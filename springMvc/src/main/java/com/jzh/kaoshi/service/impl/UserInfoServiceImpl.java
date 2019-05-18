package com.jzh.kaoshi.service.impl;

import com.jzh.kaoshi.dao.UserInfoDao;
import com.jzh.kaoshi.dao.impl.UserInfoDaoImpl;
import com.jzh.kaoshi.entity.*;
import com.jzh.kaoshi.service.UserInfoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserInfoServiceImpl implements UserInfoService {

    //@Autowired
    //private UserInfoDaoImpl userInfoDao;
    private UserInfoDao userInfoDao = new UserInfoDaoImpl();

    /**
     *
     * @return 返回name passeord
     */
    @Override
    public List<Login> login() {

       return userInfoDao.login();
    }

    /**
     *
     * @return 返回全部
     */
    @Override
    public List<UserInfo> qusryUser() {
        return userInfoDao.qusryUser();
    }

    @Override
    public List<UserInfo> dynamicQueryUser(User user) {
        return userInfoDao.dynamicQueryUser(user);
    }

    /**
     *
     * @return 返回存储有数值的对象
     */
    @Override
    public List<Count> statisticalSex() {

        return userInfoDao.statisticalSex();
    }

    public static void main(String[] args) {

        //User user = new User();
        //user.setUserName("蔡");

       // UserInfoServiceImpl u = new UserInfoServiceImpl();
        //List<UserInfo> list = u.StatisticalSex(0,3);
        //System.out.println(list);
        //List<Count> list = u.StatisticalSex();

        //System.out.println(list);
        //System.out.println(u.QusryUser());

    }


}
