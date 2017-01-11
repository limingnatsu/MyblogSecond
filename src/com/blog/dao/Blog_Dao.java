package com.blog.dao;

import com.blog.model.Blog;
import com.opensymphony.xwork2.ActionContext;
import com.sun.net.httpserver.Authenticator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.orm.hibernate4.support.HibernateDaoSupport;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.Iterator;
import java.util.List;

import static com.opensymphony.xwork2.Action.SUCCESS;

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
    public List<Blog> findById(){
        List<Blog> blogs = (List<Blog>) hibernateTemplate.find("from Blog");
    //遍历输出
    /*    Iterator<Blog> iterator  = blogs.iterator();
        while(iterator.hasNext()){
            Blog blog = (Blog)iterator.next();
            System.out.println(blog.getContent());
        }
        ActionContext.getContext().put("blog", blogs); */
         return blogs;
    }
    //按标题删除博客
    public void deleteBlog(int id ){
        System.out.println("被删除的文章编号为："+id);
        Blog blog = (Blog) hibernateTemplate.load(Blog.class,id);
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
