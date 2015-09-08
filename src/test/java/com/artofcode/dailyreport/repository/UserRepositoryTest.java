package com.artofcode.dailyreport.repository;

import com.artofcode.dailyreport.RootConfig;
import com.artofcode.dailyreport.bean.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;


/**
 * Created by harchen on 9/7/2015.
 */
@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( classes = { RootConfig.class } )
public class UserRepositoryTest
{
    @Autowired
    private UserRepository userRepository;


    @Test
    public void testSave() throws Exception
    {
        User harry = new User();
        harry.setUserName( "harry" );
        harry.setPassword( "123" );
        harry.setEmail( "harry.3.chen@nokia.com" );
        userRepository.save( harry );
    }


    @Test
    public void testFindOne() throws Exception
    {

    }


    @Test
    public void testFindByUsername() throws Exception
    {
        testSave();
        User user = userRepository.findByUsername( "harry" );
        assertEquals("harry", user.getUserName());
    }


    @Test
    public void testFindAll() throws Exception
    {

    }


    public void setUserRepository( UserRepository userRepository )
    {
        this.userRepository = userRepository;
    }
}
