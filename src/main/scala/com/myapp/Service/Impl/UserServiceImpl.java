package com.myapp.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.myapp.Models.User;
import com.myapp.Dao.UserDao;
import com.myapp.Service.*;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by jackywong on 28/03/2017.
 */

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserDao userDao;

    public User getUserById(Long id){
        return this.userDao.selectId(id);
    }
/*
    public int insertUser(User user){
        this.userDao.insert(user);
        return 0;
    }

    public int updateUser(User user){
        this.userDao.updateId(user);
        return 0;
    }

    public int deleteUserById(Long id){
        this.userDao.deleteId(id);
        return 0;
    }
*/
}
