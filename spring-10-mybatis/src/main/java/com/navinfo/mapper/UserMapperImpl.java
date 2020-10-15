package com.navinfo.mapper;

import com.navinfo.pojo.User;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

/**
 * @author zhangZhuoWen
 * @ClassName UserMapperImpl
 * @date 2020/10/15 8:42
 * @Description TODO
 */
public class UserMapperImpl implements UserMapper{

    //我们所有的操作，在mybatis未整合spring之前 都使用sqlSession来执行，
    //整合之后，现在都使用SqlSessionTemplate

    private SqlSessionTemplate sqlSession;

    public void setSqlSession(SqlSessionTemplate sqlSession) {
        this.sqlSession = sqlSession;
    }

    public List<User> selectUser() {
        //去操作原来mybatis中要做的事情
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
