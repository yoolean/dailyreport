package com.artofcode.dailyreport.service;

import com.artofcode.dailyreport.bean.User;

/**
 * Created by harchen on 8/31/2015.
 */
public interface UserService {
    void register(User user);

    User login(String username, String password);
}
