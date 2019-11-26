package com.leo.diy;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//方式三：使用注解方式实现AOP
@Aspect//标注这个类是一个切面
//@Component
public class AnnotationPointCut {

    @Before("execution(* com.leo.sercive.UserServiceImpl.*(..))")
    public void before() {
        System.out.println("====方法执行前====");
    }

    @After("execution(* com.leo.sercive.UserServiceImpl.*(..))")
    public void after() {
        System.out.println("====方法执行后====");
    }


    //    我们可以给定一个参数，代表我们要获取处理切入的点
    @Around("execution(* com.leo.sercive.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Signature signature = jp.getSignature();
        System.out.println(signature);
        //执行方法
        Object proceed = jp.proceed();
        System.out.println("环绕后");
    }
}
