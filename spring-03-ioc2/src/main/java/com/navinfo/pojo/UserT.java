package com.navinfo.pojo;

/**
 * @author zhangZhuoWen
 * @ClassName User
 * @date 2020/8/18 17:52
 * @Description TODO
 */
public class UserT {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name" + name);
    }
}
