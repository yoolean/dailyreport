package com.artofcode.dailyreport;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;


/**
 * Created by harchen on 8/28/2015.
 */
@Configuration
@ComponentScan( basePackages = { "com.artofcode.dailyreport" }, excludeFilters = { @ComponentScan.Filter( type = FilterType.ANNOTATION, value = EnableWebMvc.class ) })
public class RootConfig
{
    @Bean(destroyMethod = "close")
    public BasicDataSource dataSource()
    {
        BasicDataSource ds = new BasicDataSource();
        ds.setDriverClassName("org.hsqldb.jdbc.JDBCDriver");
        ds.setUrl("jdbc:hsqldb:file:db/reportDB;shutdown=true");
        ds.setUsername("sa");
        ds.setPassword("");
        ds.setInitialSize(1);
        ds.setMaxActive( 10 );
        return ds;
    }


    @Bean(destroyMethod = "destroy")
    public LocalSessionFactoryBean sessionFactory( DataSource dataSource )
    {
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource( dataSource );
        sessionFactoryBean.setPackagesToScan("com.artofcode.dailyreport.bean");
        sessionFactoryBean.setMappingResources(new String[]{"hibernate.cfg.xml"});
        return sessionFactoryBean;
    }
}
