/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.impl;

import clickandbuy.upc.edu.core.dao.RolDAO;
import clickandbuy.upc.edu.core.entity.Rol;
import clickandbuy.upc.edu.core.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Garyfimo
 */
public class RolImpl implements RolDAO{
    
    private Session session;

    public Rol getRolName(Integer rol_codigo) throws Exception {
        
        session = HibernateUtil.getSessionFactory().openSession();
                
        Query query = session.createQuery("from rol where rolcodigo = :code ");
        query.setParameter("code", rol_codigo);

        return (Rol) query.uniqueResult();
    }

    public void addRol(Rol rol) throws Exception {
       
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.merge(rol);
        session.beginTransaction().commit();
   }
    
    
}
