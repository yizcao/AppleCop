package com.dao;

import java.util.List;
import java.util.Map;

import com.model.User;

/**
 * Created by chanshuyi on 2015/12/26.
 */
public interface IUserDao {
    User getUserById(int userId);

    /**
     *
     * @param param Map�е�keyҪ�����ݿ���е��ֶ�����ͬ
     * @return
     */
    User getUserByMapSql(Map<String, String> param);

	List<User> getUserListByMapSql(Map<String, String> param);
 }