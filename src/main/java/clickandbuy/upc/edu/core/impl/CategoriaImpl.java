/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.impl;

import clickandbuy.upc.edu.core.dao.CategoriaDAO;
import clickandbuy.upc.edu.core.entity.Categoria;
import clickandbuy.upc.edu.core.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Garyfimo
 */
public class CategoriaImpl implements CategoriaDAO{

    Session session;
    
    public void addCategoria(Categoria categoria) throws Exception {
        
        session = HibernateUtil.getSessionFactory().openSession();
        
        try{
        session.beginTransaction();
        session.merge(categoria);
        session.beginTransaction().commit();
        }catch(HibernateException ex)
        {
            ex.printStackTrace();
        }
    }

    public Categoria getCategoria(Integer cat_codigo) throws Exception {
       
        session = HibernateUtil.getSessionFactory().openSession();
        
        final String hql = "select c from Categoria c where cat_codigo=:codigo";
        final Query query = session.createQuery(hql);
        query.setInteger("codigo", cat_codigo);
        
        return (Categoria) query.uniqueResult();
    }

    public List<Categoria> listCategoria() throws Exception {
        
      session = HibernateUtil.getSessionFactory().openSession();
      
      final String hql = "from Categoria";
      final Query query = session.createQuery(hql);
      
      return query.list();          
    }
    
    
}
