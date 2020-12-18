package com.navinfo.config;

import com.navinfo.bean.RainBow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhangZhuoWen
 * @ClassName MyImportBeanDefinitionRegistrar
 * @date 2020/12/18 10:34
 * @Description TODO
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     *
     *
     * @param importingClassMetadata  当前类的注解信息
     * @param registry    BeanDefinition注册类
     *                    把所有需要添加到容器中的bean.调用
     *                    BeanDefinitionRegistry.registerBeanDefinition手工注册进来
     */
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        if(registry.containsBeanDefinition("person")){
            RootBeanDefinition rootBeanDefinition = new RootBeanDefinition(RainBow.class);
            registry.registerBeanDefinition("rain",rootBeanDefinition);
        }


    }
}
