package com.leo.log;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;


@Component
public class AfterLog implements AfterReturningAdvice {

    //returnValue返回值
    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("执行了" + method.getName() + "方法 返回结果为：" + returnValue);
    }
}
