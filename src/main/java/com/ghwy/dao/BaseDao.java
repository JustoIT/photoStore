package com.ghwy.dao;

import org.apache.ibatis.session.SqlSession;

public class BaseDao {

    protected SqlSession sqlSession;

    public void setSqlSession(SqlSession sqlSession) {
        this.sqlSession = sqlSession;
    }

}
