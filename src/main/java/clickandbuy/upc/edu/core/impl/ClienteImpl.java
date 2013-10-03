/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.impl;

import clickandbuy.upc.edu.core.dao.ClienteDAO;
import clickandbuy.upc.edu.core.entity.Cliente;
import clickandbuy.upc.edu.core.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Garyfimo
 */
public class ClienteImpl implements ClienteDAO{

    private Session session;
    
    public void addCliente(Cliente cliente) throws Exception {
        
        session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        session.merge(cliente);
        session.beginTransaction().commit();
    }

    public Cliente getCliente(Integer cli_codigo) throws Exception {
        
        session = HibernateUtil.getSessionFactory().openSession();
        
        final  String hql = "select c from Cliente c where cli_codigo=:codigo";
        final Query query = session.createQuery(hql);
        query.setInteger("codigo", cli_codigo);
        
        return (Cliente) query.uniqueResult();
    }

    public void deleteCliente(Cliente cliente) throws Exception {
        
        session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        session.delete(cliente);
        session.beginTransaction().commit();
    }
    
    
    
}
