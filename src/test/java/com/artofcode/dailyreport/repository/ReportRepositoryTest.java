package com.artofcode.dailyreport.repository;

import com.artofcode.dailyreport.RootConfig;
import com.artofcode.dailyreport.bean.Report;
import com.artofcode.dailyreport.bean.Task;
import com.artofcode.dailyreport.bean.User;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

import static junit.framework.TestCase.assertTrue;


/**
 * Created by harchen on 9/6/2015.
 */
@RunWith( SpringJUnit4ClassRunner.class )
@ContextConfiguration( classes = { RootConfig.class } )
public class ReportRepositoryTest
{
    @Autowired
    private ReportRepository reportRepository;
    @Autowired
    private TaskRepository taskRepository;
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

        Task coding = new Task();
        coding.setName( "Coding" );
        coding.setDescription( "Write code for daily report application" );

        taskRepository.save( coding );

        Report report = new Report();
        report.setUser( harry );
        report.setTask( coding );
        report.setDuration( 8 );
        report.setDate( new Date() );

        reportRepository.save( report );
    }


    @Test
    public void testFindOne() throws Exception
    {

    }


    @Test
    public void testFindByUser() throws Exception
    {
        User harry = userRepository.findByUsername( "harry" );
        List<Report> reportList = reportRepository.findByUser( harry );
        assertTrue( reportList.size() > 0 );
    }


    @Test
    public void testFindAll() throws Exception
    {

    }


    public void setReportRepository( ReportRepository reportRepository )
    {
        this.reportRepository = reportRepository;
    }


    public void setTaskRepository( TaskRepository taskRepository )
    {
        this.taskRepository = taskRepository;
    }


    public void setUserRepository( UserRepository userRepository )
    {
        this.userRepository = userRepository;
    }
}
