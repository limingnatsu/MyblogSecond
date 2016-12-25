package test;

import com.blog.dao.Blog_Dao;
import com.blog.model.Blog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.Iterator;
import java.util.List;

/**
 * Created by nervliming on 2016/12/22.
 */
public class test {
    
    public static void main(String[] args) throws Exception{

        ApplicationContext ac = new ClassPathXmlApplicationContext("/conf/applicationContext.xml");
        Blog_Dao blog_dao = (Blog_Dao) ac.getBean("blog_Dao");
        Blog blog = new Blog();
        blog.setId(2);
        blog.setTitle("可怕");
        blog_dao.deleteBlog(blog);


        /*测试展示全部
        List<Blog> blogs = blog_dao.listAll();
        Iterator iterator = blogs.iterator();
        while (iterator.hasNext()){
            Blog blog1 = (Blog) iterator.next();
            System.out.println(blog1);
        }
*/

   }
}
