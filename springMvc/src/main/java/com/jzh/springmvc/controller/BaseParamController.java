package com.jzh.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("param")
public class BaseParamController {

    @RequestMapping("/test1.action")
    public String getParam(HttpServletRequest request) {

        String name = request.getParameter("name");

        System.out.println(name);

        return "jsp/aaa";
    }

    @RequestMapping(value = "/test2.action", method = RequestMethod.POST)
    public String getParam1(String name) {
        System.out.println(name);

        return "jsp/aaa";
    }
}














