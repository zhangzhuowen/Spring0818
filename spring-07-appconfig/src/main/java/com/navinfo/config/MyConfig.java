package com.navinfo.config;

import com.navinfo.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author zhangZhuoWen
 * @ClassName MyConfig
 * @date 2020/8/19 16:58
 * @Description TODO
 */
@Configuration
@ComponentScan("com.navinfo.pojo")
@Import(MyConfig2.class)
public class MyConfig {

    @Bean
    public User getUser(){
        return new User();
    }

}
