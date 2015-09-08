package com.artofcode.dailyreport.repository;

import com.artofcode.dailyreport.bean.Report;
import com.artofcode.dailyreport.bean.User;

import java.util.List;

/**
 * Created by harchen on 9/2/2015.
 */
public interface ReportRepository {
    void save(Report report);

    Report findOne(long id);

    List<Report> findByUser(User user);

    List<Report> findAll();
}
