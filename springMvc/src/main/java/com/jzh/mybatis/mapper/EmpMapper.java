package com.jzh.mybatis.mapper;

import com.jzh.mybatis.beans.EmpBean;
import com.jzh.mybatis.beans.EmpDnameBean;
import com.jzh.mybatis.beans.Student;

import java.util.List;
import java.util.Map;

//TestMapper全类名，与对应的mapper.xml文件的namespace对应
public interface EmpMapper {

    //方法名称与xml映射文件中的id属性对应，有没有参数也与xml配置有关
    List<EmpBean> queryAll();

    List<EmpMapper> queryByParam(Map<String,Object> whereMap);

    List<EmpDnameBean> queryDname();
}
