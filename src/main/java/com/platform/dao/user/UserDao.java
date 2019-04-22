package com.platform.dao.user;

import com.platform.po.User;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    public User findUser(@Param("username") String usename,
                         @Param("password") String password);
    public User findUserByUsername(@Param("username") String username);
    public void addUser(User user);
}
