package com.multi.dibase;
//UserServiceImpl는 UserDaoJdbcImpl을 의존하는 설계도
public class UserServiceImpl {
   private UserDaoJdbcImpl jdbcImpl;

    public UserServiceImpl(UserDaoJdbcImpl jdbcImpl) {
        this.jdbcImpl = jdbcImpl;
    }
}
