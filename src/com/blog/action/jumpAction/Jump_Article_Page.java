package com.blog.action.jumpAction;

import com.blog.model.Blog;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by nervliming on 2017/3/10.
 */
public class Jump_Article_Page extends ActionSupport implements ModelDriven<Blog>{
    Blog blog = new Blog();
    @Override
    public Blog getModel() {
        return blog;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("编号是:"+blog.getId());
        return SUCCESS;
    }
}
