package com.artofcode.dailyreport.repository;

import com.artofcode.dailyreport.RootConfig;
import com.artofcode.dailyreport.bean.Task;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static junit.framework.TestCase.assertTrue;


/**
 * Created by harchen on 9/7/2015.
 */
@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( classes = { RootConfig.class } )
public class TaskRepositoryTest
{
    @Autowired
    private TaskRepository taskRepository;


    @Test
    public void testSave() throws Exception
    {
        Task coding = new Task();
        coding.setName( "Coding" );
        coding.setDescription("Write code for daily report application");
        taskRepository.save(coding);
    }


    @Test
    public void testFindOne() throws Exception
    {

    }


    @Test
    public void testFindByName() throws Exception
    {
        testSave();
        List<Task> tasks=taskRepository.findByName("Coding");
        assertTrue(tasks.size()>0);
    }


    @Test
    public void testFindAll() throws Exception
    {

    }


    public void setTaskRepository( TaskRepository taskRepository )
    {
        this.taskRepository = taskRepository;
    }
}
