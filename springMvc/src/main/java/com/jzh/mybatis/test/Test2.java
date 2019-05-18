package com.jzh.mybatis.test;

import com.jzh.mybatis.beans.EmpBean;
import com.jzh.mybatis.beans.EmpDnameBean;
import com.jzh.mybatis.beans.Student;
import com.jzh.mybatis.mapper.EmpMapper;
import com.jzh.mybatis.mapper.TestMapper;
import com.jzh.mybatis.mapper.impl.QueryByParam;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test2 {

    public static void main(String[] args) {

        SqlSession session = null;
        try{
            //-- 主配置文件，文件位置在classPath根路径（也就是src根路径）
            String resource = "mybatis-config.xml";
            //--通过org.apache.ibatis.io.Resources获取输入流
            InputStream inputStream = Resources.getResourceAsStream(resource);
            //--org.apache.ibatis.session.SqlSessionFactoryBuilder创建SqlSessionFactory对象
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            //-- 创建SqlSession
            session = sqlSessionFactory.openSession();

            //-- 执行sql语句
            EmpMapper empMapper = session.getMapper(EmpMapper.class);
            //System.out.println(empMapper.queryAll());
            //System.out.println("=============================");
            //empMapper.queryDname();

            /*for (EmpDnameBean e:empMapper.queryDname()) {
                System.out.println(e.getDeptno());
                System.out.println(e.getDname());
                System.out.println(e.getEmpno());
                System.out.println(e.getEname());
            }*/

            Map<String,Object> whereMap = new HashMap<String, Object>();
            //动态sql

            //whereMap.put("ename","%S%");
            whereMap.put("salBegin",1000);
            whereMap.put("salEnd",3000);
            System.out.println(empMapper.queryByParam(whereMap));


        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(session != null)
                session.close();
        }

    }

}
