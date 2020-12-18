package com.navinfo.config;

import com.navinfo.bean.Color;
import com.navinfo.bean.Person;
import org.springframework.context.annotation.*;

/**
 * @author zhangZhuoWen
 * @ClassName MainConfig2
 * @date 2020/12/17 15:01
 * @Description TODO
 */

@Configuration
//id默认是组件的全类名
@Import({Color.class,MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class MainConfig2 {

    /**
     * singleton ioc容器启动会调用方法创建对象放到ioc容器中去,以后从容器中去拿
     *
     * prototype 获取实例的时候再去调用
     *
     * request 同一个请求创建一个实例
     *
     * session 同一个session创建一个实例
     *
     * @return
     */
    //@Scope("prototype")
    @Lazy
    @Bean("person")
    public Person person(){
        System.out.println("给容器中添加Person");
        return new Person("zhangsan",26);
    }

    /**
     *
     * @Conditional :按照一定的的条件进行判断，满足条件给容器中注册bean
     */
    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person01(){
        return new Person("Bill",50);
    }
    @Conditional({LinuxCondition.class})
    @Bean("li")
    public Person person02(){
        return new Person("li",6);
    }


    /**
     * 给容器中注册组件 ：
     * 1. 包扫描 +组件标注注解 （@Controller / @Service ...） [适用于自己写的类]
     * 2. @Bean [导入的第三方包里面的组件]
     * 3. @Import [快速的给容器中导入一个组件] 因为第二种方式比较麻烦
     *         1).@Import（要导入到容器中的组件）；容器中就会自动注册这个组件，id默认是类的全类名
     *         2).ImportSelector :返回需要导入的组件的全类名数组
     *         3).ImportBeanDefinitionRegistrar :
     */


}
