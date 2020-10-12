package com.navinfo.service;

import com.navinfo.dao.UserDao;

/**
 * @author zhangZhuoWen
 * @ClassName UserServiceImpl
 * @date 2020/8/18 15:57
 * @Description TODO
 */
public class UserServiceImpl implements UserService{
    //private UserDao userDao = new UserDaoOracleImpl();

    private UserDao userDao;

    //利用set进行动态实现值的注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
