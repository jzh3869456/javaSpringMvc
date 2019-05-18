package com.jzh.mybatis.mapper;

import com.jzh.mybatis.beans.Student;

import java.util.List;

//TestMapper全类名，与对应的mapper.xml文件的namespace对应
public interface TestMapper {

    //方法名称与xml映射文件中的id属性对应，有没有参数也与xml配置有关
    List<Student> queryStudent();
}
