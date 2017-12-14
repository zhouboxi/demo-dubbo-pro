package com.jxlg.app.api;


import com.jxlg.app.entity.User;

/**
 * @author zhouboxi
 * @create 2017-12-08 15:37
 **/
public interface IUserService {

    User findByNameAndPassword(String name, String password);

}
