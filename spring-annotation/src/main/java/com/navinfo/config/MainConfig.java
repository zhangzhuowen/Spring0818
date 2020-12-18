package com.navinfo.config;

import com.navinfo.bean.Person;
import com.navinfo.service.MyService;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * @author zhangZhuoWen
 * @ClassName MainConfig
 * @date 2020/12/16 15:27
 * @Description TODO
 */

//配置类 == 配置文件
@Configuration
@ComponentScans(
        value = {
                @ComponentScan(value = "com.navinfo",includeFilters = {
//                        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
//                        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = MyService.class),
                        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})
                },useDefaultFilters = false)
        }
)
public class MainConfig {

    //类型为返回值的类型，id默认是用方法名作为id
    @Bean("person01")
    public Person person(){
        return new Person("lisi",20);
    }

}
