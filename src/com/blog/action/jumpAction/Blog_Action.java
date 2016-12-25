package com.blog.action.jumpAction;

import com.blog.action.jumpAction.Jump_Show_Blog;
import com.blog.model.Blog;
import com.blog.service.Blog_Service;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate5.HibernateTemplate;

/**
 * Created by nervliming on 2016/12/22.
 */
public class Blog_Action extends ActionSupport implements ModelDriven<com.blog.model.Blog> {
    private com.blog.model.Blog blog;
    private Blog_Service blog_service;

    @Override
    public String execute() throws Exception {
        blog_service.save_Blog(blog);
        System.out.println("test");
        return SUCCESS;
    }

    @Override
    public com.blog.model.Blog getModel() {
        return blog;
    }

    //写日志并保存的方法
    public String saveBlog(Blog Blog){
        blog_service.save_Blog(blog);
        return "success";
    }




    public void setBlog_Service(Blog_Service Blog_Service) {
        blog_service = Blog_Service;
    }

    public Blog_Service getBlog_Service() {
        return blog_service;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }

    public Blog_Service getBlog_service() {
        return blog_service;
    }

    public void setBlog_service(Blog_Service blog_service) {
        this.blog_service = blog_service;
    }

}
