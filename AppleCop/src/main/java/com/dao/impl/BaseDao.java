package com.dao.impl;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * ����Service�Ļ��࣬����ע��sqlSession
 */
public class BaseDao {
    /**
     * ��д��sqlSession
     */protected SqlSession writableSQLSession;

    /**
     * ֻ����sqlSession
     */protected SqlSession readonlySQLSession;

    public void setWritableSQLSession(SqlSession writableSQLSession) {
        this.writableSQLSession = writableSQLSession;
    }

    public void setReadonlySQLSession(SqlSession readonlySQLSession) {
        this.readonlySQLSession = readonlySQLSession;
    }
}
