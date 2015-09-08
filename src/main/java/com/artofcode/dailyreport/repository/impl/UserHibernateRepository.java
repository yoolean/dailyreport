package com.artofcode.dailyreport.repository.impl;

import com.artofcode.dailyreport.bean.User;
import com.artofcode.dailyreport.repository.UserRepository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by harchen on 9/7/2015.
 */
@Repository
public class UserHibernateRepository
    extends AbstractHibernateRepository
    implements UserRepository
{
    @Override
    public void save( User user )
    {
        super.save( user );
    }


    @Override
    public User findOne( long id )
    {
        return super.findById( User.class, id );
    }


    @Override
    public User findByUsername( String username )
    {
        Map<String, String> parameters = new HashMap<>();
        parameters.put( "userName", username );
        List<User> userList = super.findByQuery( User.class, "from User where userName=:userName", parameters );
        User user = userList.isEmpty() ? null : userList.get( 0 );
        return user;
    }


    @Override
    public List<User> findAll()
    {
        return super.findAll( User.class );
    }
}
