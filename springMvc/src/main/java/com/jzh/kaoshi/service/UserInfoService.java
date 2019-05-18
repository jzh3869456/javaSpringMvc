package com.jzh.kaoshi.service;

import com.jzh.kaoshi.entity.Count;
import com.jzh.kaoshi.entity.Login;
import com.jzh.kaoshi.entity.User;
import com.jzh.kaoshi.entity.UserInfo;

import java.util.List;

public interface UserInfoService {

    /**
     * 用户登录
     */

    List<Login> login();

    /**
     * 用户列表以创建时间倒序展示
     *
     */

    List<UserInfo> qusryUser();

    /**
     * 根据用户查询用户,返回全部信息
     */

    List<UserInfo> dynamicQueryUser(User user);

    /**
     * 统计出男女用户并返回数值
     */

    /**
     * 分页查询所有用户，并且以每页5条10条15条进行控制显示
     */

    List<Count> statisticalSex();
}
