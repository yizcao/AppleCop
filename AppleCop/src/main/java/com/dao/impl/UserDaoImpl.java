package com.dao.impl;


import com.mapper.UserMapper;
import com.model.User;
import com.dao.IUserDao;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2015/12/26.
 */public class UserDaoImpl extends BaseDao implements IUserDao {

    private static Log logger = LogFactory.getLog(UserDaoImpl.class);

    
    public User getUserById(int userId) {
        UserMapper mapper = readonlySQLSession.getMapper(UserMapper.class);
        return mapper.selectByPrimaryKey(userId);
    }

    /**
     * dsafdsf
     * @param param
     * @return
     */
    
    public User getUserByMapSql(Map<String, String> param) {
        logger.info("getUserByMapSql ���ݶ�̬������ѯ�û�����");
        return getUserListByMapSql(param).size() > 0 ? getUserListByMapSql(param).get(0) : null;
    }

    /**
     * get**MapSql()��ķ���ֻ�����ڸ������ĵ��ڲ�ѯ
     * ���磺select * from user where username = 1 and password = 3  ����ȷ��
     *       select * from user where username in (1,2,3) �������޷�ʵ�֣�
     * @param param
     * @return
     */
    
    public List<User> getUserListByMapSql(Map<String, String> param) {
        logger.info("getUserListByMapSql ���ݶ�̬������ѯ�û������б�");
        UserMapper mapper = readonlySQLSession.getMapper(UserMapper.class);
        return mapper.getUserListByMapSql(param);
    }
}