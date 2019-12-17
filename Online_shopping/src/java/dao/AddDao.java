package dao;

import entity.Category;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

/**
 *
 * @author KHALID
 */
public class AddDao {
    public Category addCategory(Category cat){
        SessionFactory factory=HibernateUtil.getSessionFactory();
        Session session=factory.openSession();
        session.save(cat);
        session.beginTransaction();
        session.getTransaction().commit();
        return  cat;
    }
}
