package com.navinfo.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author zhangZhuoWen
 * @ClassName MyTypeFilter
 * @date 2020/12/17 14:10
 * @Description TODO
 */
public class MyTypeFilter implements TypeFilter {

    /**
     * metadataReader :         读取到的当前正在扫描的类的信息
     * metadataReaderFactory ： 可以获取到其他任何类信息的
     *
     * @param metadataReader
     * @param metadataReaderFactory
     * @return
     * @throws IOException
     */
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        //获取当前类注解的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();

        //获取当前正在扫描的类的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();

        String className = classMetadata.getClassName();
        System.out.println("------> " + className);

        //获取当前类资源信息
        Resource resource = metadataReader.getResource();


        return false;
    }
}
