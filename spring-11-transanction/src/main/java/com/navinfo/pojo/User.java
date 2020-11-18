package com.navinfo.pojo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhangZhuoWen
 * @ClassName User
 * @date 2020/10/12 17:03
 * @Description TODO
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String pwd;

}
