package com.artofcode.dailyreport.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


/**
 * Created by harchen on 8/31/2015.
 */
@Entity
public class Report
{
    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private Long id;
    @Column
    private int duration;
    @Column
    private Date date;
    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
    @ManyToOne(fetch = FetchType.EAGER)
    private Task task;


    public Date getDate()
    {
        return date;
    }


    public void setDate( Date date )
    {
        this.date = date;
    }


    public int getDuration()
    {
        return duration;
    }


    public void setDuration( int duration )
    {
        this.duration = duration;
    }


    public Long getId()
    {
        return id;
    }


    public void setId( Long id )
    {
        this.id = id;
    }


    public Task getTask()
    {
        return task;
    }


    public void setTask( Task task )
    {
        this.task = task;
    }


    public User getUser()
    {
        return user;
    }


    public void setUser( User user )
    {
        this.user = user;
    }
}
