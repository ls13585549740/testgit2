package com.funong.newerp.service.logic;

import com.alibaba.fastjson.JSON;
import com.funong.newerp.dal.dao.MscSendTaskDAO;
import com.funong.newerp.dal.entity.MscSendTaskEntity;
import com.funong.newerp.facade.MscSendTaskFacade;
import com.funong.newerp.service.base.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;


@Service
public class HelloService {

    @Autowired
    MscSendTaskFacade mscSendTaskFacade;

    public String sayHello(String name) {


        MscSendTaskEntity rtn = mscSendTaskFacade.findById(1);

        List<MscSendTaskEntity> rtn3 = new ArrayList<>();
        try {
            Condition condition = new Condition(MscSendTaskEntity.class,false,false);
            Example.Criteria criteria = condition.createCriteria();
            criteria.andEqualTo("sender", "neo");
            rtn3 = mscSendTaskFacade.findByCondition(condition);
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<MscSendTaskEntity> rtn2 = null;
        try {
            Example example = new Example(MscSendTaskEntity.class);
            example.createCriteria().andEqualTo("sender", "nzj");
            MscSendTaskEntity entity=new MscSendTaskEntity();
            entity.setReceiver("lit");
            rtn2 = mscSendTaskFacade.findByEntity(entity);
        } catch (Exception e) {
            e.printStackTrace();
        }
        name = JSON.toJSONString(rtn);
        name = name + "--------" + JSON.toJSONString(rtn2);
        name = name + "--------" + JSON.toJSONString(rtn3);

        if (null == name || "".equals(name.trim())) {
            return "please input name";
        }
        return "Hello " + name;

        /*int rtn = mscSendTaskDAO.insert(MscSendTaskEntity t);
        int rtn = mscSendTaskDAO.insertList(List < MscSendTaskEntity > list);
        int rtn = mscSendTaskDAO.insertSelective(MscSendTaskEntity t);
        int rtn = mscSendTaskDAO.insertUseGeneratedKeys(MscSendTaskEntity t);
        List<T> list = mscSendTaskDAO.select(MscSendTaskEntity t);
        List<T> list = mscSendTaskDAO.selectAll();
        List<T> list = mscSendTaskDAO.selectByIds(String s);
        List<T> list = mscSendTaskDAO.selectByCondition(Object o);
        List<T> list = mscSendTaskDAO.selectByExample(Object o);
        MscSendTaskEntity t = mscSendTaskDAO.selectByPrimaryKey(Object o);
        int count = mscSendTaskDAO.selectCount(MscSendTaskEntity t);
        int count = mscSendTaskDAO.selectCountByCondition(Object o);
        MscSendTaskEntity t = mscSendTaskDAO.selectOne(MscSendTaskEntity t);
        int rtn = mscSendTaskDAO.updateByCondition(MscSendTaskEntity t,Object o);
        int rtn = mscSendTaskDAO.updateByConditionSelective(MscSendTaskEntity t,Object o);
        int rtn = mscSendTaskDAO.updateByExampleSelective(MscSendTaskEntity t,Object o);
        int rtn = mscSendTaskDAO.updateByPrimaryKey(MscSendTaskEntity t);
        int rtn = mscSendTaskDAO.updateByPrimaryKeySelective(MscSendTaskEntity t);
        int rtn = mscSendTaskDAO.deleteByIds(String s);
        int rtn = mscSendTaskDAO.delete(MscSendTaskEntity t);
        int rtn = mscSendTaskDAO.deleteByCondition(Object o);
        int rtn = mscSendTaskDAO.deleteByPrimaryKey(Object o);
        */

    }
}
