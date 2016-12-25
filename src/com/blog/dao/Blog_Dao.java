package com.blog.dao;

import com.blog.model.Blog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

/**
 * Created by nervliming on 2016/12/22.
 */
public class Blog_Dao   {
    private SessionFactory sessionFactory;
    private HibernateTemplate hibernateTemplate;
    //实现存储博客功能
    public void saveBlog(Blog blog) {
        hibernateTemplate.save(blog);
    }

 //查找所有博客
    public List<Blog> listAll(){
        String sql = "from Blog blog ";
        List<Blog> blogs = (List<Blog>) this.hibernateTemplate.find(sql);
        return blogs;
    }

    //按编号查号
    public Blog findById(int id){
        Blog blog = (Blog) hibernateTemplate.get(Blog.class,id);
        return blog;
    }
    //按标题删除博客
    public void deleteBlog(Blog blog ){
        hibernateTemplate.delete(blog);
        System.out.println("删除成功");
    }
    //更新博客
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
