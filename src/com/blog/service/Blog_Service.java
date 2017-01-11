package com.blog.service;

import com.blog.dao.Blog_Dao;
import com.blog.model.Blog;

import java.util.List;

/**
 * Created by nervliming on 2016/12/22.
 */
public class Blog_Service {
    private Blog_Dao blog_dao;
    //保存日志
    public void saveBlog(Blog blog){
        blog_dao.saveBlog(blog);
    }
    //展示日志
    public List<Blog> show_Blog(){
        return blog_dao.findById();
    }
    //删除日志
    public void deleteBlog(int id){
        blog_dao.deleteBlog(id);
    }

    public void setBlog_dao(Blog_Dao blog_dao) {
        this.blog_dao = blog_dao;
    }
}
