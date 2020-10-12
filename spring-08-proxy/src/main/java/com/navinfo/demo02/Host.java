package com.navinfo.demo02;

/**
 * @author zhangZhuoWen
 * @ClassName Host
 * @date 2020/8/20 9:16
 * @Description TODO
 */
//房东
public class Host implements Rent {
    public String name;

    public Host(String name) {
        this.name = name;
    }

    public void rent() {
        System.out.println("房东要出租房子");
    }

    public void Papapa(String shout,String petName) {
        System.out.println(name + "和" + petName +  "啪啪啪" + shout);
    }
}
