package com.funong.newerp.service.base;


import com.funong.newerp.dal.base.CrudDAO;
import com.funong.newerp.common.annotations.ServiceLog;
import com.funong.newerp.common.exception.BusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.entity.Condition;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * 基于通用MyBatis Mapper插件的Service接口的实现
 *
 * @author niuzhanjun
 */
public abstract class AbstractService<T> implements Service<T> {

    @Autowired
    protected CrudDAO<T> dao;

    /**
     * 当前泛型真实类型的Class
     */
    private Class<T> modelClass;

    public AbstractService() {
        ParameterizedType pt = (ParameterizedType) this.getClass().getGenericSuperclass();
        modelClass = (Class<T>) pt.getActualTypeArguments()[0];
    }

    @Override
    @ServiceLog(description = "持久化")
    public int save(T model) {
        return dao.insertSelective(model);
    }

    @Override
    @ServiceLog(description = "批量持久化")
    public int save(List<T> models) {
        return dao.insertList(models);
    }

    @Override
    @ServiceLog(description = "通过主鍵刪除")
    public int deleteById(Long id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    @ServiceLog(description = "通过主鍵批量刪除")
    public int deleteByIds(String ids) {
        return dao.deleteByIds(ids);
    }

    @Override
    @ServiceLog(description = "更新")
    public int update(T model) {
        return dao.updateByPrimaryKeySelective(model);
    }

    @Override
    @ServiceLog(description = "通过ID查找")
    public T findById(Long id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    @ServiceLog(description = "通过多个ID查找")
    public List<T> findByIds(String ids) {
        return dao.selectByIds(ids);
    }

    @Override
    @ServiceLog(description = "根据条件查找")
    public List<T> findByCondition(Condition condition) {
        return dao.selectByCondition(condition);
    }

    @Override
    @ServiceLog(description = "获取所有")
    public List<T> findAll() {
        return dao.selectAll();
    }

    @Override
    @ServiceLog(description = "根据自定义条件查找")
    public T findBy(String fieldName, Object value) throws BusinessException {
        try {
            T model = modelClass.newInstance();
            Field field = modelClass.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(model, value);
            return dao.selectOne(model);
        } catch (ReflectiveOperationException e) {
            throw new BusinessException(e.getMessage(), e);
        }
    }

}
