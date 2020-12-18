package com.navinfo.config;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author zhangZhuoWen
 * @ClassName MyImportSelector
 * @date 2020/12/18 10:11
 * @Description TODO
 */

//自定义逻辑返回需要导入的组件
public class MyImportSelector implements ImportSelector {

    /**
     *
     * @param importingClassMetadata 当前标注@Import注解的类的所有注解的信息
     * @return 就是导入到容器中的组件全类名
     */
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

        return new String[]{"com.navinfo.bean.Blue"};
    }
}
