package com.navinfo.demo01;

/**
 * @author zhangZhuoWen
 * @ClassName Client
 * @date 2020/8/20 9:17
 * @Description TODO
 */

public class Client {

    public static void main(String[] args) {
        //房东要租房
        Host host = new Host();
        //中介帮助房东
        Proxy proxy = new Proxy(host);

        //你去找中介！
        proxy.rent();
    }
}
