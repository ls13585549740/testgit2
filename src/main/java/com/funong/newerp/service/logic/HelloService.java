package com.funong.newerp.service.logic;

import com.alibaba.fastjson.JSON;
import com.funong.newerp.dal.dao.MscSendTaskDAO;
import com.funong.newerp.dal.entity.MscSendTaskEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    MscSendTaskDAO mscSendTaskDAO;

    public String sayHello(String name) {

        MscSendTaskEntity rtn = mscSendTaskDAO.selectByPrimaryKey(1);
        name = JSON.toJSONString(rtn);

        if (null == name || "".equals(name.trim())) {
            return "please input name";
        }
        return "Hello " + name;


    }
}
