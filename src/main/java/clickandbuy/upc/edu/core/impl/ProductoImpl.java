/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.impl;

import clickandbuy.upc.edu.core.dao.ProductoDAO;
import clickandbuy.upc.edu.core.entity.Producto;
import clickandbuy.upc.edu.core.util.Constantes;
import clickandbuy.upc.edu.core.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Piero
 */
public class ProductoImpl implements ProductoDAO {

    private Session session;

    @Override
    public boolean addProducto(Producto producto) {
        session = HibernateUtil.getSessionFactory().openSession();
        boolean bool = false;
        try {
            session.beginTransaction();
            session.merge(producto);
            session.beginTransaction().commit();
            bool = true;
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
        return bool;
    }

    @Override
    public Producto getProducto(Integer prod_codigo) {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "select c from Producto c where prod_codigo=:codigo";
        final Query query = session.createQuery(s);
        query.setInteger(Constantes.CODIGO, prod_codigo);
        return (Producto) query.uniqueResult();
    }

    @Override
    public void deleteProducto(Producto producto) {

        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.delete(producto);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

    @Override
    public void updateProducto(Producto producto) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(producto);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

    @Override
    public List<Producto> listProducto() {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "from Producto";
        final Query query = session.createQuery(s);
        return query.list();
    }

    @Override
    public List<Producto> listProductoxCategoria(Integer prodCodigocategoria) {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "select c from Producto c where prod_codigocategoria=:codigo";
        final Query query = session.createQuery(s);
        query.setInteger(Constantes.CODIGO, prodCodigocategoria);
        return query.list();
    }
}
