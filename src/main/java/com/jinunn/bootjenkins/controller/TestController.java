package com.jinunn.bootjenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : JinDun
 * @date : 2022/8/30 11:55
 */
@RestController
public class TestController {

    @GetMapping("/aaa")
    public String getStr(){
        return "hello git";
    }

    @GetMapping("/bbb")
    public String getbbb(){
        return "add bbb";
    }

    @GetMapping("/ccc")
    public String getCcc(){
        return "ccc";
    }
}
