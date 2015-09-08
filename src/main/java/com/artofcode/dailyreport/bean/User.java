package com.artofcode.dailyreport.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 * Created by harchen on 8/31/2015.
 */
@Entity
public class User
{
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    @Column( nullable = false )
    private String userName;
    @Column( nullable = false )
    private String password;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column( nullable = false )
    private String email;

    public String getEmail()
    {
        return email;
    }


    public void setEmail( String email )
    {
        this.email = email;
    }


    public String getFirstName()
    {
        return firstName;
    }


    public void setFirstName( String firstName )
    {
        this.firstName = firstName;
    }


    public Long getId()
    {
        return id;
    }


    public void setId( Long id )
    {
        this.id = id;
    }


    public String getLastName()
    {
        return lastName;
    }


    public void setLastName( String lastName )
    {
        this.lastName = lastName;
    }


    public String getPassword()
    {
        return password;
    }


    public void setPassword( String password )
    {
        this.password = password;
    }


    public String getUserName()
    {
        return userName;
    }


    public void setUserName( String userName )
    {
        this.userName = userName;
    }
}
