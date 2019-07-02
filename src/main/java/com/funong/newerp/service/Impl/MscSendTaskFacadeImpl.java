package com.funong.newerp.service.Impl;

import com.funong.newerp.dal.dao.MscSendTaskDAO;
import com.funong.newerp.dal.entity.MscSendTaskEntity;
import com.funong.newerp.facade.MscSendTaskFacade;
import com.funong.newerp.service.base.AbstractService;
import com.funong.newerp.service.logic.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class MscSendTaskFacadeImpl  extends AbstractService<MscSendTaskEntity> implements MscSendTaskFacade {
    @Autowired
    MscSendTaskDAO mscSendTaskDAO;
}
