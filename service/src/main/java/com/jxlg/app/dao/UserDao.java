package com.jxlg.app.dao;

import com.jxlg.app.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author zhouboxi
 * @create 2017-12-08 15:39
 **/
@Repository
public interface UserDao {

    User findByNameAndPassword(@Param("name") String name, @Param("password") String password);

}

