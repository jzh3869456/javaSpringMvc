package com.jzh.kaoshi.entity;

import com.jzh.kaoshi.service.UserInfoService;
import com.jzh.kaoshi.service.impl.UserInfoServiceImpl;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Success {

    public static  Boolean succec(String name,String password){
        Boolean succec = false;// 返回结果

        UserInfoService uis = new UserInfoServiceImpl();
        List<Login> list = uis.login();

        for (int i = 0; i < list.size(); i++) {
            String namee = list.get(i).getName();

            if ((name).equals(namee)){

                for (int j = 0; j < list.size(); j++) {
                    String pass = list.get(j).getPassword();
                    if ((password).equals(pass)){
                        succec = true;
                        break;
                    }else {
                        continue;
                    }
                }
            }else {
                continue;
            }
        }

        return succec;
    }
}
