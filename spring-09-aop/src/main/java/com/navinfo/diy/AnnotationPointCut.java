package com.navinfo.diy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author zhangZhuoWen
 * @ClassName AnnotationPointCut
 * @date 2020/8/21 15:07
 * @Description TODO
 */
//使用注解实现AOP
@Component
@Aspect
public class AnnotationPointCut {

    public AnnotationPointCut() {
        System.out.println("AnnotationPointCut");
    }

    @Before("execution(* com.navinfo.service.UserServiceImpl.*(..))")
    public void before (){
        System.out.println("===========方法执行前=========");
    }

    @After("execution(* com.navinfo.service.UserServiceImpl.*(..))")
    public void after (){
        System.out.println("===========方法执行后=========");
    }

    /**
     * 在环绕增强中，我们可以给定一个参数，代表我们要获取处理切入的点
     *
     * @param jp
     * @throws Throwable
     */
    @Around("execution(* com.navinfo.service.UserServiceImpl.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        System.out.println("签名:"+jp.getSignature());
        //执行目标方法proceed
        Object proceed = jp.proceed();
        System.out.println("环绕后");
        System.out.println(proceed);
    }

}
