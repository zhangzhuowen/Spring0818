package com.navinfo.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * @author zhangZhuoWen
 * @ClassName Cat
 * @date 2020/8/19 13:53
 * @Description TODO
 */
public class PeopleX {
    private Cat cat;
    @Resource
    private Dog dog;
    private String name;


    public Cat getCat() {
        return cat;
    }

    @Resource(name = "cat12")
    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return dog;
    }

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
