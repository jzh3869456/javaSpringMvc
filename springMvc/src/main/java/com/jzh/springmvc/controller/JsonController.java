package com.jzh.springmvc.controller;

import com.jzh.springmvc.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/json")
public class JsonController {

    @RequestMapping(value = "/json.action")
    @ResponseBody
    public static Object d() {

        Person person = new Person();
        person.setName("孙悟空");
        person.setAge(666);
        person.setBrithday(new Date());

        return person;
    }

}


















