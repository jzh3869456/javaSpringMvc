package com.jzh.mybatis.test;

import com.jzh.mybatis.beans.Student;
import com.jzh.mybatis.mapper.TestMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

public class Test1 {

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
            TestMapper testMapper = session.getMapper(TestMapper.class);

            List<Student> list = testMapper.queryStudent();
            System.out.println(list);

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(session != null)
                session.close();
        }

    }

}
