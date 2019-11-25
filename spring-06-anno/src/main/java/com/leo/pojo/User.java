package com.leo.pojo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
//等价于<bean id="user" class="com.leo.pojo.User"/>
//@Component组件
public class User {

    @Value("leo")
    public String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
