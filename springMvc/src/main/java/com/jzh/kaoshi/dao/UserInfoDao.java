package com.jzh.kaoshi.dao;

import com.jzh.kaoshi.entity.*;

import java.util.List;

public interface UserInfoDao {

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

    List<Count> statisticalSex();

    /**
     * 分页查询所有用户，并且以每页5条10条15条进行控制显示
     */

    List<UserInfo> pagingQuery();







}
