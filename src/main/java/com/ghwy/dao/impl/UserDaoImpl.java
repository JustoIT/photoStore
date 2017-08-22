package com.ghwy.dao.impl;

import com.ghwy.dao.BaseDao;
import com.ghwy.dao.UserDao;
import com.ghwy.domain.User;

import java.util.List;

public class UserDaoImpl extends BaseDao implements UserDao{

    public List<User> getAllUsers() {
        return sqlSession.selectList("getAllUsers");
    }

}
