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

    public boolean addCategory(Category cat) {
        try {
            SessionFactory factory = HibernateUtil.getSessionFactory();
            Session session = factory.openSession();
            session.save(cat);
            session.beginTransaction();
            session.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return  false;
        }

    }
}
