package com.navinfo.mapper;

import com.navinfo.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @author zhangZhuoWen
 * @ClassName UserMapperImpl2
 * @date 2020/10/15 10:57
 * @Description TODO
 */
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper{



    public List<User> selectUser() {
        SqlSession sqlSession = getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
