package com.jzh.springmvc.controller;

import com.jzh.springmvc.bean.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/test.action")
    public ModelAndView test(){
        /*创建视图对象,并指定到视图页面*/
        ModelAndView modelAndView = new ModelAndView("jsp/aaa");

        Person person = new Person();
        person.setName("文森");
        person.setAge(66);
        /*添加模型数据对象到视图*/
        modelAndView.addObject(person);
        //modelAndView.addObject("name","jzh");
        return modelAndView;
    }

    @RequestMapping("/test1.action")
    public ModelAndView test1(){

        Map<String,String> map = new HashMap<String, String>();
        map.put("name","孙悟空");
        map.put("age","66");

        return new ModelAndView("jsp/test1",map);
    }

}
















