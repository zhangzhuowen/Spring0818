package com.navinfo.pojo;

/**
 * @author zhangZhuoWen
 * @ClassName Hello
 * @date 2020/8/18 16:54
 * @Description TODO
 */
public class Hello {
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("Hello,"+ name );
    }
}
