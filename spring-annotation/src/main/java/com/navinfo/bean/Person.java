package com.navinfo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangZhuoWen
 * @ClassName Person
 * @date 2020/12/16 15:24
 * @Description TODO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;
    private Integer age;
}
