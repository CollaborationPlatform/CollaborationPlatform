package com.platform.service;

import com.platform.po.User;

public interface UserService {
    public User findUser(String username, String password);
    public String addUser(User user);
}
