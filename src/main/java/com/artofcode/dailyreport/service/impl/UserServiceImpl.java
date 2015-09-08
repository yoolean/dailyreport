package com.artofcode.dailyreport.service.impl;

import com.artofcode.dailyreport.bean.User;
import com.artofcode.dailyreport.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by harchen on 8/31/2015.
 */
public class UserServiceImpl implements UserService {
    private List<User> userList = new ArrayList<User>();

    public void register(User user) {
        userList.add(user);
    }

    public User login(String username, String password) {
        return null;
    }
}
