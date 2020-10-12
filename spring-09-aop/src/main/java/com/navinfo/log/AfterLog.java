package com.navinfo.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * @author zhangZhuoWen
 * @ClassName AfterLog
 * @date 2020/8/20 17:22
 * @Description TODO
 */
public class AfterLog  implements AfterReturningAdvice {

    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了" + o1.getClass().getName()
                +"的"+method.getName()+"方法,"
                +"返回值："+o);
    }
}
