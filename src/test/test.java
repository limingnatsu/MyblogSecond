package test;

import com.blog.dao.Blog_Dao;
import com.blog.model.Blog;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by nervliming on 2016/12/22.
 */
public class test {
    public static void main(String[] args) throws Exception{
        System.out.println("begin");
        ApplicationContext ac = new ClassPathXmlApplicationContext("/conf/applicationContext.xml");
        SessionFactory sessionFactory = (SessionFactory)ac.getBean("sessionFactory");
        System.out.print(sessionFactory);
        Blog blog = new Blog();
        blog.setContent("heheda");
        blog.setTitle("美国恐成最大赢家");
        Session session = sessionFactory.openSession();
        session.save(blog);
        session.beginTransaction().commit();
   }
}
