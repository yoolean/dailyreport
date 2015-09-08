package com.artofcode.dailyreport.repository;

import com.artofcode.dailyreport.bean.Task;

import java.util.List;


/**
 * Created by harchen on 9/7/2015.
 */
public interface TaskRepository
{
    void save(Task task);


    Task findOne( long id );


    List<Task> findByName(String name);


    List<Task> findAll();
}
