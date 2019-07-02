package com.funong.newerp.webapp;

import com.funong.newerp.common.result.ResponseResult;
import com.funong.newerp.dal.entity.MscSendTaskEntity;
import com.funong.newerp.facade.MscSendTaskFacade;
import com.funong.newerp.service.logic.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @Resource
    HelloService helloService;
    @Resource
    MscSendTaskFacade mscSendTaskFacade;

    @RequestMapping(value = "/say2", method = RequestMethod.GET)
    private MscSendTaskEntity common_get_sample2(@RequestParam(value = "name", required = false) String name) {
        return mscSendTaskFacade.findById(1);
    }


    @RequestMapping(value = "/say", method = RequestMethod.GET)
    private String common_get_sample(@RequestParam(value = "name", required = false) String name) {
        String rtn = helloService.sayHello(name);
        rtn = "（common_get_sample）" + rtn;
        return rtn;
    }

    @RequestMapping(value = "/say", method = RequestMethod.POST)
    private String common_post_sample(@RequestParam(value = "name", required = false) String name) {
        return "（common_post_sample）hello " + name + "!";
    }

    @RequestMapping(value = "/var/{name}", method = RequestMethod.GET)
    private String var_get_sample(@PathVariable String name) {
        return "（var_get_sample）hello " + name + "!";
    }

    @RequestMapping(value = "/var/{name}", method = RequestMethod.POST)
    private String var_post_sample(@PathVariable String name) {
        return "（var_get_sample）hello " + name + "!";
    }

}
