package com.jzh.springmvc.controller;

import com.jzh.springmvc.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/person")
public class BassParamController {

    @RequestMapping("/test1.action")
    public Person getParam(@RequestBody Person person){

        return person;
    }
}
