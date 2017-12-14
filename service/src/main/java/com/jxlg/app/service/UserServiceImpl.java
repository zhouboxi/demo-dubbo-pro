package com.jxlg.app.service;

import com.jxlg.app.api.IUserService;
import com.jxlg.app.dao.UserDao;
import com.jxlg.app.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhouboxi
 * @create 2017-12-08 15:38
 **/
@Service(value = "iUserService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserDao userDao;
    @Override
    public User findByNameAndPassword(String name, String password) {
        User user = userDao.findByNameAndPassword(name, password);
        if(user!=null){
            return user;
        }
        return null;
    }

}

