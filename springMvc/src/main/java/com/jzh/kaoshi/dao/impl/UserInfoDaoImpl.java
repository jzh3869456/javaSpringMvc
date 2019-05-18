package com.jzh.kaoshi.dao.impl;

import com.jzh.kaoshi.dao.UserInfoDao;
import com.jzh.kaoshi.entity.*;
import com.jzh.kaoshi.jdbc.JDBCUtil;
import org.springframework.stereotype.Repository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Repository(value = "userDao")
public class UserInfoDaoImpl implements UserInfoDao {

    /**
     * 用户登陆
     * @return 返回账号密码的List集合
     */
    @Override
    public List<Login> login() {

        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtil.getConnection();
            stat = conn.createStatement();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT u.`name`,u.`password` from user_info u");
            String sql = sb.toString();
            rs = stat.executeQuery(sql);
            List<Login> list = new ArrayList<Login>();

            while (rs.next()){
                String name = rs.getString("name");
                String password = rs.getString("password");
                Login login = new Login();
                login.setName(name);
                login.setPassword(password);
                list.add(login);
            }

            return list;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn,stat,rs);
        }

        return null;
    }

    /**
     *
     * @return 返回按时间倒叙展示的用户列表
     */
    @Override
    public List<UserInfo> qusryUser() {

        Connection conn = null;
        Statement stat = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtil.getConnection();
            stat = conn.createStatement();
            StringBuilder sb = new StringBuilder();
            sb.append("SELECT u.id, u.`name`,u.`password`,u.age,u.sex,u.creaDate FROM user_info u GROUP BY creaDate DESC");
            String sql = sb.toString();
            rs = stat.executeQuery(sql);
            List<UserInfo> list = new ArrayList<UserInfo>();

            while (rs.next()){

                String id = rs.getString("id");
                String name = rs.getString("name");
                String password = rs.getString("password");
                int age = rs.getInt("age");
                int sex = rs.getInt("sex");
                Timestamp creaDatee = rs.getTimestamp("creaDate");
                //String creaDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(creaDatee); // 转换为String类型

                UserInfo userInfo = new UserInfo();
                userInfo.setId(id);
                userInfo.setName(name);
                userInfo.setPassword(password);
                userInfo.setAge(age);
                userInfo.setSex(sex);
                userInfo.setCreaDate(creaDatee);
                list.add(userInfo);

            }

            return list;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn,stat,rs);
        }
        return null;
    }

    @Override
    public List<UserInfo> dynamicQueryUser(User user) {

        Connection conn = null;
        PreparedStatement psd = null;
        ResultSet rs = null;

        try {
            conn = JDBCUtil.getConnection();
            //String sql = "delete from tab_teacher where id = ?";
            StringBuffer sql = new StringBuffer();
            sql.append("SELECT u.id, u.`name`,u.`password`,u.age,u.sex,u.creaDate FROM user_info u WHERE u.`name` LIKE CONCAT('%',?,'%')");

            psd = conn.prepareStatement(sql.toString());
            psd.setString(1,user.getUserName());

            rs = psd.executeQuery();

            List<UserInfo> list = new ArrayList<UserInfo>();
            while (rs.next()){

                String id;
                id = rs.getString("id");
                String name = rs.getString("name");
                String password = rs.getString("password");
                int age = rs.getInt("age");
                int sex = rs.getInt("sex");
                Timestamp creaDatee = rs.getTimestamp("creaDate");

                UserInfo userInfo = new UserInfo();
                userInfo.setId(id);
                userInfo.setName(name);
                userInfo.setPassword(password);
                userInfo.setAge(age);
                userInfo.setSex(sex);
                userInfo.setCreaDate(creaDatee);
                list.add(userInfo);

            }

            return list;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn,psd,rs);
        }

        return null;
    }

    @Override
    public List<Count> statisticalSex() {

        Connection conn = null;
        PreparedStatement psd = null;
        ResultSet rs = null;


        try {
            conn = JDBCUtil.getConnection();
            //String sql = "delete from tab_teacher where id = ?";
            StringBuffer sql = new StringBuffer();
            sql.append("SELECT  sum(CASE when u.sex=1 THEN 1 ELSE 0 END ),SUM(CASE WHEN u.sex=0 THEN 1 ELSE 0 END) FROM user_info u");
            psd = conn.prepareStatement(sql.toString());

            rs = psd.executeQuery();
            Count count = new Count();
            List<Count> list = new ArrayList<Count>();
            while (rs.next()){

                int maleUsers = rs.getInt(1);
                int femaleUsers = rs.getInt(2);

                count.setMaleUsers(maleUsers);
                count.setFemaleUsers(femaleUsers);

                list.add(count);

            }

            return list;

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn,psd,rs);
        }

        return null;
    }


    @Override
    public List<UserInfo> pagingQuery() {
        return null;
    }

    public static void main(String[] args) {

        UserInfoDaoImpl u = new UserInfoDaoImpl();
       // User user = new User();
        //user.setUserName("泓");

       List<Count> list = u.statisticalSex();
        System.out.println(list);
        //List<Count> list = u.StatisticalSex();

        //System.out.println(list);
        //System.out.println(u.StatisticalSex());
        //System.out.println(list);
        /*for (Count count:list){
            //System.out.println(l.getName());
            //System.out.println(l.getCreaDate());
            System.out.println(count);
        }*/

    }
}































