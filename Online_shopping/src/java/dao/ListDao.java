/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Category;
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
     public List<Category> catListByName(String name) {
        SessionFactory factory = HibernateUtil.getSessionFactory();
        Session session = factory.openSession();
        List<Category> cList=session.createQuery("SELECT al FROM Category al where lower(catName)='"+name.toLowerCase()+"'").list();
        cList.toString();
        session.close();
        return cList;
    }
}
