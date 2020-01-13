
package dao;

import entity.Category;
import entity.Product;
import entity.SubCategory;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import util.HibernateUtil;

/**
 *
 * @author KHALID
 */
public class ListDao {

    public List catList() {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        List<Category> cList=session.createQuery("SELECT al.catName FROM Category al").list();
        cList.toString();
        session.close();
        return cList;
    }
    public List subcatList(String name) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        List<Category> cList=session.createQuery("SELECT al.subCatName FROM SubCategory al where al.category.catId IN "
                + "( SELECT a.catId from Category a where lower(a.catName)='"+name.toLowerCase()+"')").list();
        cList.toString();
        session.close();
        return cList;
    }
     public List<Category> catListByName(String name) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        List<Category> cList=session.createQuery("SELECT al FROM Category al where lower(catName)='"+name.toLowerCase()+"'").list();
        cList.toString();
        session.close();
        return cList;
    }
     public List<SubCategory> subcatListByName(String name) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        List<SubCategory> cList=session.createQuery("SELECT al FROM SubCategory al where lower(subCatName)='"+name.toLowerCase()+"'").list();
        cList.toString();
        session.close();
        return cList;
    }
     public List allProductList() {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        List<Product> cList=session.createQuery("SELECT al FROM Product al").list();
        cList.toString();
        session.close();
        return cList;
    }
     public List<Category> catListAll(){
         SessionFactory factory=HibernateUtil.getSessionFactory();
         Session session=factory.openSession();
         List<Category> cList=session.createQuery("SELECT al FROM Category al").list();
         cList.toString();
         session.close();
         return cList;
     }
     
     public List allProductListbyCatName(String catname){
         SessionFactory factory=HibernateUtil.getSessionFactory();
         Session session=factory.openSession();
         System.out.println("check2:"+catname);
         List<Product> clist=session.createQuery("SELECT product FROM SubCategory subCategory, Category category, Product product WHERE "
                 + "subCategory.category.catId=category.catId AND product.subCategory.subCatId = subCategory.subCatId AND "
                 + "(category.catName= '"+catname+"')").list();
         clist.toString();
         session.close();
         System.out.println("hey"+clist);
         return clist;
     }
         
}
