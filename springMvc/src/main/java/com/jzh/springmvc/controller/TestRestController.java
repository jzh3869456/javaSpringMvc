package com.jzh.springmvc.controller;

import com.jzh.springmvc.bean.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @RestController 表示整个类都返回json数据
 */
@RestController
@RequestMapping("/rest")
public class TestRestController {

    @RequestMapping("/rest.action")
    public Person getPerson(){

        return new Person("看看",22,new Date());
    }

}
