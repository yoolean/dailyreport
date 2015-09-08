package com.artofcode.dailyreport.repository.impl;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;


/**
 * Created by harchen on 9/8/2015.
 */
public abstract class AbstractHibernateRepository
{
    @Autowired
    protected SessionFactory sessionFactory;


    public void setSessionFactory( SessionFactory sessionFactory )
    {
        this.sessionFactory = sessionFactory;
    }


    private Session openSession()
    {
        return sessionFactory.openSession();
    }


    private void closeSession( Session session )
    {
        if( session != null )
        {
            session.close();
        }
    }


    protected <T> T findById( Class<T> entity, Long id )
    {
        Session session = null;
        try
        {
            session = openSession();
            Object object = session.get( entity, id );

            return (T)object;
        }
        finally
        {
            closeSession( session );
        }
    }


    protected  <T> List<T> findAll( Class<T> entity )
    {
        Session session = null;
        try
        {
            session = openSession();
            List<T> entities = session.createCriteria( entity ).list();
            return entities;
        }
        finally
        {
            closeSession( session );
        }
    }


    protected void save( Object entity )
    {
        Session session = null;
        try
        {
            session = openSession();
            session.beginTransaction();
            session.persist( entity );
            session.getTransaction().commit();
        }
        catch( HibernateException e )
        {
            Transaction transaction = session.getTransaction();
            if( transaction.isActive() )
            {
                transaction.rollback();
            }
            throw e;
        }
        finally
        {
            closeSession( session );
        }
    }


    protected  <T> List<T> findByQuery( Class<T> entity, String statement, Map parameters )
    {
        Session session = null;
        try
        {
            session = openSession();
            Query query = session.createQuery( statement );
            query.setProperties( parameters );
            List<T> reports = query.list();
            return reports;
        }
        finally
        {
            closeSession( session );
        }
    }
}
