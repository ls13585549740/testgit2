package com.funong.newerp.webapp;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping(value = "/say", method = RequestMethod.GET)
    private String common_get_sample(@RequestParam(value = "name", required = false) String name) {
        return "（common_get_sample）hello " + name + "!";
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
