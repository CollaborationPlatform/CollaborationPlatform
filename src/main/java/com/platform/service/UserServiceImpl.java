package com.platform.service;

import com.platform.dao.user.UserDao;
import com.platform.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findUser(String username, String password) {
        return this.userDao.findUser(username, password);
    }


    @Override
    public String addUser(User user) {
        // check user data
        System.out.println(user.toString());
        if (user.getUsername() == null || user.getUsername().equals("")) {
            return "please input username";
        }
        if (user.getPassword() == null || user.getPassword().equals("")) {
            return "please input password";
        }
        if (user.getCategory() == null || user.getCategory().equals("")) {
            return "please choose category";
        }

        User userByUsername = this.userDao.findUserByUsername(user.getUsername());
        if (userByUsername != null) {
            return "username existed";
        }
        this.userDao.addUser(user);
        return null;
    }
}
