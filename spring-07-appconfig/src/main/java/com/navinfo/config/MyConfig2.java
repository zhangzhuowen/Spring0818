package com.navinfo.config;

import com.navinfo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhangZhuoWen
 * @ClassName MyConfig
 * @date 2020/8/19 16:58
 * @Description TODO
 */
@Configuration
public class MyConfig2 {

    @Bean
    public User getUser(){
        return new User();
    }

}
