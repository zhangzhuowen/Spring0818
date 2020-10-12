package com.navinfo.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author zhangZhuoWen
 * @ClassName Cat
 * @date 2020/8/19 13:53
 * @Description TODO
 */
public class People {
    private Cat cat;
    private Dog dog;
    private String name;

    public Cat getCat() {
        return cat;
    }

    //@Autowired是按类型自动转配的，不支持id匹配。
    @Autowired
    @Qualifier(value = "cat11")
    /**
     * @Autowired是根据类型自动装配的，加上@Qualifier则可以根据byName的方式自动装配
     * @Qualifier不能单独使用。
     */
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

    @Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "People{" +
                "cat=" + cat +
                ", dog=" + dog +
                ", name='" + name + '\'' +
                '}';
    }
}
