package com.artofcode.dailyreport.service;

import com.artofcode.dailyreport.bean.Task;

import java.util.List;

/**
 * Created by harchen on 8/31/2015.
 */
public interface TaskService {
    void createTask(Task... tasks);

    List<Task> findAll();

    Task find(String taskId);
}
