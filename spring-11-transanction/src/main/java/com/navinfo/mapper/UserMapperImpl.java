package com.navinfo.mapper;

import com.navinfo.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author zhangZhuoWen
 * @ClassName UserMapperImpl
 * @date 2020/10/15 8:42
 * @Description TODO
 */
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper{

    public List<User> selectUser() {

        UserMapper mapper = getSqlSession().getMapper(UserMapper.class);

        User user = new User(4, "小王", "123");
        mapper.addUser(user);
        mapper.deleteUser(4);

        return mapper.selectUser();
    }

    public int addUser(User user) {
        return getSqlSession().getMapper(UserMapper.class).addUser(user);
    }

    public int deleteUser(int id) {
        return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
    }
}
