package com.navinfo.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author zhangZhuoWen
 * @ClassName User
 * @date 2020/8/19 16:23
 * @Description TODO
 */
@Component
public class User {
    public String name;

    public String getName() {
        return name;
    }

    // 相当于配置文件中 <property name="name" value="秦疆"/>
    @Value("zzw")
    public void setName(String name) {
        this.name = name;
    }
}
