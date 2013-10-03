/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.impl;

import clickandbuy.upc.edu.core.dao.ProductoDAO;
import clickandbuy.upc.edu.core.entity.Producto;
import clickandbuy.upc.edu.core.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Garyfimo
 */
public class ProductoImpl implements ProductoDAO{

    private Session session;
    
    public void addProducto(Producto producto) throws Exception {
       
        session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        session.merge(producto);
        session.beginTransaction().begin();
        
    }

    public List<Producto> listProducto() throws Exception {
        
        session = HibernateUtil.getSessionFactory().openSession();
        
        final String hql = "from Producto";
        final Query query = session.createQuery(hql);
        
        return query.list();
    }
    
    

    
}
