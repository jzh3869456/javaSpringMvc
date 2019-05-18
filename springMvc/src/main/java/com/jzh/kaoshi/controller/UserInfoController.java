package com.jzh.kaoshi.controller;

import com.jzh.kaoshi.entity.*;
import com.jzh.kaoshi.service.UserInfoService;
import com.jzh.kaoshi.service.impl.UserInfoServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping(value = "/user")
public class UserInfoController{

   // @Autowired
    //Success success;

    /**
     * 登陆
     * @param login
     * @param model
     * @param response
     * @return
     * @throws IOException
     */
    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public String login(Login login, Model model,HttpServletResponse response) throws IOException {

        String namee = login.getName();
        String passwordd = login.getPassword();
        if (Success.succec(namee,passwordd)){

            System.out.println("登陆成功");
            response.sendRedirect("/jsp/userHome.jsp");//登录成功跳转用户页面
        }else {

            System.out.println("登录失败");
        }

        return "jsp/login";
    }



    /**
     * 按照创建时间倒叙返回用户列表
     * @param model
     * @return
     */
    @RequestMapping(value = "/query")
    public String queryUserInfo(Model model){

        UserInfoService userInfoService = new UserInfoServiceImpl();
        List<UserInfo> list = userInfoService.qusryUser();

        model.addAttribute(list);

        return "/jsp/userHome";
    }

    /**
     * 根据用户名查询用户
     */

    @RequestMapping(value = "/DynamicQueryUser")
    public String dynamicQueryUser(User user, Model model){

        String userName = user.getUserName();
        System.out.println(userName);
        user.setUserName(userName);
        UserInfoService userInfoService = new UserInfoServiceImpl();
        List<UserInfo> list = userInfoService.dynamicQueryUser(user);

        model.addAttribute(list);
        return "/jsp/userHome";
    }

    /**
     * 统计出男女用户各有多少人并在页面展示
     */

    @RequestMapping(value = "/StatisticalSex")
    public String statisticalSex(Model model){

        UserInfoService userInfoService = new UserInfoServiceImpl();
        List<Count> countList = userInfoService.statisticalSex();

        model.addAttribute(countList);

        return "/jsp/userHome";
    }


    /**
     * 分页查询所有用户，并且以每页5条10条15条进行控制显示
     */

    @RequestMapping("/pagingQuery")
    public String pagingQuery(){

        UserInfoService userInfoService = new UserInfoServiceImpl();

        return "";
    }


























}
