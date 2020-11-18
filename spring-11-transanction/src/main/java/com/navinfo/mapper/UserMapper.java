package com.navinfo.mapper;

import com.navinfo.pojo.User;

import java.util.List;

/**
 * @author zhangZhuoWen
 * @ClassName UserMapper
 * @date 2020/10/12 17:20
 * @Description TODO
 */
public interface UserMapper {
    public List<User> selectUser();

    public int addUser(User user);

    public int deleteUser(int id);

}
