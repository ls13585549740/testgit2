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
    @ServiceLog(description = "保存/新增记录")
    public int save(T entity) {
        return dao.insertSelective(entity);
    }


    @Override
    @ServiceLog(description = "通过ID查找记录")
    public T findById(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    @ServiceLog(description = "通过实体值查找记录")
    public List<T> findByEntity(T entity) {
        return dao.select(entity);
    }

    @Override
    @ServiceLog(description = "根据条件查找记录")
    public List<T> findByCondition(Condition condition) {
        return dao.selectByCondition(condition);
    }

    @Override
    @ServiceLog(description = "获取所有记录")
    public List<T> findAll() {
        return dao.selectAll();
    }

    @Override
    @ServiceLog(description = "根据实体值获取记录数量")
    public int findCountByEntity(T entity) {
        return dao.selectCount(entity);
    }

    @Override
    @ServiceLog(description = "根据条件获取记录数量")
    public int findCountByCondtion(Condition condition) {
        return dao.selectCountByCondition(condition);
    }


    @Override
    @ServiceLog(description = "通过ID主鍵刪除记录")
    public int deleteById(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }


    @Override
    @ServiceLog(description = "更新记录")
    public int update(T entity) {
        return dao.updateByPrimaryKeySelective(entity);
    }

    @Override
    @ServiceLog(description = "根据条件更新记录")
    public int updateByCondition(T entity, Condition condition) {
        return dao.updateByCondition(entity, condition);
    }



}
