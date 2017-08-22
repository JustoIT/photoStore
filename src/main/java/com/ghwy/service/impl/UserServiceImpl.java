package com.ghwy.service.impl;

import com.ghwy.dao.UserDao;
import com.ghwy.domain.User;
import com.ghwy.service.UserService;
import java.util.List;

public class UserServiceImpl implements UserService{

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }
}
