package com.blog.service;

import com.blog.dao.Blog_Dao;
import com.blog.model.Blog;

/**
 * Created by nervliming on 2016/12/22.
 */
public class Blog_Service {
    private Blog_Dao blog_dao;
    public void save_Blog(Blog blog){
        blog_dao.saveBlog(blog);
    }

    public Blog_Dao getBlog_dao() {
        return blog_dao;
    }

    public void setBlog_dao(Blog_Dao blog_dao) {
        this.blog_dao = blog_dao;
    }
}
