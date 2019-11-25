package com.leo.pojo;


import org.springframework.stereotype.Component;

@Component
//等价于<bean id="user" class="com.leo.pojo.User"/>
//@Component组件
public class User {
    public String name = "leo";
}
