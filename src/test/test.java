package test;

import com.blog.dao.Blog_Dao;
import com.blog.model.Blog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by nervliming on 2016/12/22.
 */
public class test {
    
    public static void main(String[] args) throws Exception{

      ApplicationContext ac = new ClassPathXmlApplicationContext("/conf/applicationContext.xml");
        Blog_Dao blog_dao = (Blog_Dao) ac.getBean("blog_Dao");




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
