package com.navinfo.demo01;

/**
 * @author zhangZhuoWen
 * @ClassName Proxy
 * @date 2020/8/20 9:18
 * @Description TODO
 */
public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        fare();
    }

    //看房
    public void seeHouse(){
        System.out.println("带房客看房");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }

}
