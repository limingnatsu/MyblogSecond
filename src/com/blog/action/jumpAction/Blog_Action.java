package com.blog.action.jumpAction;

import com.blog.action.jumpAction.Jump_Show_Blog;
import com.blog.model.Blog;
import com.blog.service.Blog_Service;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.ServletActionContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import org.springframework.orm.hibernate5.HibernateTemplate;


import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nervliming on 2016/12/22.
 */
public class Blog_Action extends ActionSupport implements ModelDriven<com.blog.model.Blog> {
    private com.blog.model.Blog blog;
    private Blog_Service blog_service;
   private List<Blog> blogs = new ArrayList<Blog>();
    private String gsonObject;
    @Override
    public com.blog.model.Blog getModel() {
        return blog;
    }

    //写日志并保存的方法
    public String saveBlog( ){
        blog_service.saveBlog(blog);
        return "success";
    }
    //展示日志的方法

    public String showBlog() throws IOException{
        //设置数据的回显
       blogs = blog_service.show_Blog();
      blog = blogs.get(1);
        System.out.println("回显的数据"+blog.getContent());
     //   Gson gson = new Gson();
    //    gsonObject = gson.toJson(blog);
       //   System.out.println("wusuowei"+blog.getContent());*/
    //    ActionContext.getContext().getSession().put("blogs",blogs);
        return SUCCESS;
    }

    //删除方法
    public String deleteBlog(){
        blog_service.deleteBlog(blog.getId());
        return SUCCESS;
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



    public String getGsonObject() {
        return gsonObject;
    }

    public void setGsonObject(String gsonObject) {
        this.gsonObject = gsonObject;
    }

   public List<Blog> getBlogs() {
        return blogs;
    }

    public void setBlogs(List<Blog> blogs) {
        this.blogs = blogs;
    }
}
