package com.navinfo.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @author zhangZhuoWen
 * @ClassName LinuxCondition
 * @date 2020/12/17 16:11
 * @Description TODO
 */
public class LinuxCondition implements Condition {

    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {

        Environment environment = conditionContext.getEnvironment();

        String property = environment.getProperty("os.name");
        if (property.contains("Linux")){
            return true;
        }
        return false;
    }
}
