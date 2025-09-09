package com.multi.di2;

public class UserServiceImpl implements UserService{
    private UserDao userDao = new UserDaoJdbcImpl();
    @Override
    public void register() {
        userDao.insert();
    }

    @Override
    public void findUser() {
        userDao.select();
    }
}
