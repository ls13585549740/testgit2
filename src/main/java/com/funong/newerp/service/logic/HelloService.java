package com.funong.newerp.service.logic;

import com.alibaba.fastjson.JSON;
import com.funong.newerp.dal.entity.MscSendTaskEntity;
import com.funong.newerp.facade.MscSendTaskFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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

            List<MscSendTaskEntity> rtn2 = null;
            Example example = new Example(MscSendTaskEntity.class);
            example.createCriteria().andEqualTo("sender", "nzj");
            MscSendTaskEntity entity = new MscSendTaskEntity();
            entity.setReceiver("lit");
            rtn2 = mscSendTaskFacade.findByEntity(entity);

            name = JSON.toJSONString(rtn);
            name = name + "--------" + JSON.toJSONString(rtn2);
            name = name + "--------" + JSON.toJSONString(rtn3);

            if (null == name || "".equals(name.trim())) {
                return "please input name";
            }
            return "Hello " + name;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "gggg";


    }
}
