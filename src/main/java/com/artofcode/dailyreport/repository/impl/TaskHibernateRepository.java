package com.artofcode.dailyreport.repository.impl;

import com.artofcode.dailyreport.bean.Task;
import com.artofcode.dailyreport.repository.TaskRepository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by harchen on 9/7/2015.
 */
@Repository
public class TaskHibernateRepository
    extends AbstractHibernateRepository
    implements TaskRepository
{
    @Override
    public void save( Task task )
    {
        super.save( task );
    }


    @Override
    public Task findOne( long id )
    {
        return super.findById( Task.class, id );
    }


    @Override
    public List<Task> findByName( String name )
    {
        Map<String, String> parameters = new HashMap<>();
        parameters.put( "name", name );
        return super.findByQuery( Task.class, "from Task where name=:name", parameters );
    }


    @Override
    public List<Task> findAll()
    {
        return super.findAll( Task.class );
    }
}
