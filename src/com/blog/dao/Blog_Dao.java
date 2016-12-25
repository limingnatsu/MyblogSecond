package com.blog.dao;

import com.blog.model.Blog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.orm.hibernate5.HibernateTemplate;

/**
 * Created by nervliming on 2016/12/22.
 */
public class Blog_Dao   {
    private SessionFactory sessionFactory;
    private HibernateTemplate hibernateTemplate;
    //实现存储日志功能
    public void saveBlog(Blog blog) {
        Session session = sessionFactory.getCurrentSession();
       session.save(blog);



    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
