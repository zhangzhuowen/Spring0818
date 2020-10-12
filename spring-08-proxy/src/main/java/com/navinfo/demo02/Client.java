package com.navinfo.demo02;

/**
 * @author zhangZhuoWen
 * @ClassName Client
 * @date 2020/8/20 14:30
 * @Description TODO
 */
public class Client {

    public static void main(String[] args) {
        //姚锦雯
        Host host = new Host("张卓文");

        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setRent(host);
        Rent rent = (Rent) proxyInvocationHandler.getProxy();
        rent.Papapa("好舒服","姚锦雯");

       // proxy.rent();



    }
}
