package com.artofcode.dailyreport.service;

import com.artofcode.dailyreport.bean.Report;
import com.artofcode.dailyreport.bean.User;

import java.util.Date;
import java.util.List;

/**
 * Created by harchen on 8/31/2015.
 */
public interface ReportService {
    void createReport(Report report);
    void createReport(Report... reports);

    List<Report> findReportsByUser(User user, Date from, Date to);
}
