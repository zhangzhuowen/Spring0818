package com.navinfo.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author zhangZhuoWen
 * @ClassName ProxyInvocationHandler
 * @date 2020/8/20 13:53
 * @Description TODO
 */
public class ProxyInvocationHandler implements InvocationHandler {
    //被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成得到代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    // 处理代理实例上的方法调用并返回结果
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        //method还是为被代理人的方法HOST，搞清楚，我这里是使用的动态代理，意思就是说，我在之前   代码不动的基础上   做横向的扩展。所以这里直接反射调用Host的方法
        Object invoke = method.invoke(rent, args);
        fare();
        return invoke;
    }

    //看房
    public void seeHouse() {
        System.out.println("带房客看房");
    }

    //收中介费
    public void fare() {
        System.out.println("收中介费");
    }
}
