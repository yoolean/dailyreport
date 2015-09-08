package com.artofcode.dailyreport.service.impl;

import com.artofcode.dailyreport.bean.Report;
import com.artofcode.dailyreport.bean.User;
import com.artofcode.dailyreport.repository.ReportRepository;
import com.artofcode.dailyreport.service.ReportService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by harchen on 9/2/2015.
 */
@Component
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportRepository reportRepository;

    public void createReport(Report report) {
         reportRepository.save(report);
    }

    public void createReport(Report... reports) {

    }

    public List<Report> findReportsByUser(User user, Date from, Date to) {
        return null;
    }

    public void setReportRepository(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }
}
