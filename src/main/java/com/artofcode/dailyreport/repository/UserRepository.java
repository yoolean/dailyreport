package com.artofcode.dailyreport.repository;

import com.artofcode.dailyreport.bean.User;

import java.util.List;


/**
 * Created by harchen on 9/7/2015.
 */
public interface UserRepository
{
    void save( User user );


    User findOne( long id );

    User findByUsername( String username );


    List<User> findAll();
}
