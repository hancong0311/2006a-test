package com.example.h2006atest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Title: TestController
 * @Description:
 * @Auther:
 * @Version: 1.0
 * @create 2021/6/4 9:34
 */
@RestController
public class TestController {


    @RequestMapping("test")
    public String test(){
        return "test--00000--1---dd---";
    }

    @RequestMapping("test2")
    public String test2(){

        return "test----2---张三-------";

    }

    @RequestMapping("test3")
    public String test3(){
        return "test----3----------李四";
    }
}
