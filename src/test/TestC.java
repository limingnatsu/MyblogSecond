package test;

import com.blog.model.Blog;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.List;


/**
 * Created by nervliming on 2017/2/10.
 */
public class TestC {

    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Criteria criteria = session.createCriteria(Blog.class);
        String name = "龙城";
        criteria.add(Restrictions.like("title","%"+name+"%"));
        criteria.setFirstResult(1);
        criteria.setMaxResults(100);

        List<Blog> blogs = criteria.list();
        for(int i = 0;i<blogs.size();i++){
            System.out.println(blogs.get(i).getTitle());
        }
    }
}
