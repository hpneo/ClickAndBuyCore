/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.impl;

import clickandbuy.upc.edu.core.dao.CarritoDAO;
import clickandbuy.upc.edu.core.entity.Carrito;
import clickandbuy.upc.edu.core.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Garyfimo
 */
public class CarritoImpl implements CarritoDAO {

    private Session session;

    public void addCarrito(Carrito carrito) throws Exception {

        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.merge(carrito);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }

    }

    public Carrito getCarrito(Integer car_codigo) throws Exception {

        session = HibernateUtil.getSessionFactory().openSession();

        final String hql = "select c from Carrito c where car_codigo:=codigo";
        final Query query = session.createQuery(hql);
        query.setInteger("codigo", car_codigo);

        return (Carrito) query.uniqueResult();
    }

    public void deleteCarrito(Carrito carrito) throws Exception {

        session = HibernateUtil.getSessionFactory().openSession();

        try {

            session.beginTransaction();
            session.delete(carrito);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
    }

    public List<Carrito> listCarrito() throws Exception {

        session = HibernateUtil.getSessionFactory().openSession();

        final String hql = "from Carrito";
        final Query query = session.createQuery(hql);

        return query.list();


    }
}
