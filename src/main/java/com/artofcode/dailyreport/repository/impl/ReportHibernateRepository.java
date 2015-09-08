package com.artofcode.dailyreport.repository.impl;

import com.artofcode.dailyreport.bean.Report;
import com.artofcode.dailyreport.bean.User;
import com.artofcode.dailyreport.repository.ReportRepository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by harchen on 9/2/2015.
 */
@Repository
public class ReportHibernateRepository
    extends AbstractHibernateRepository
    implements ReportRepository
{

    @Override
    public void save( Report report )
    {
        super.save( report );
    }


    @Override
    public Report findOne( long id )
    {
        return super.findById( Report.class, id );
    }


    @Override
    public List<Report> findByUser( User user )
    {
        Map<String, Object> parameters = new HashMap<>();
        parameters.put( "user", user );
        return super.findByQuery( Report.class, "from Report where user=:user", parameters );
    }


    @Override
    public List<Report> findAll()
    {
        return super.findAll( Report.class );
    }
}
