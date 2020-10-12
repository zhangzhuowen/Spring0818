package com.navinfo.pojo;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author zhangZhuoWen
 * @ClassName User
 * @date 2020/8/19 16:56
 * @Description TODO
 */
public class User {
    private String name;

    public String getName() {
        return name;
    }

    @Value("zzw")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

}
