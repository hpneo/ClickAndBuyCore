/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.impl;

import clickandbuy.upc.edu.core.dao.ClienteDao;
import clickandbuy.upc.edu.core.entity.Cliente;
import clickandbuy.upc.edu.core.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Piero
 */
public class ClienteDaoImpl implements ClienteDao
{
    private Session session;
    
    public void addCliente(Cliente cliente) throws Exception 
    {  
        session = HibernateUtil.getSessionFactory().openSession(); 
        try
        {   
            session.beginTransaction();
            session.merge(cliente);
            session.beginTransaction().commit();
        }
        catch(HibernateException ex)
        {
            ex.printStackTrace();
        }  
        HibernateUtil.shutdown();
    }
    public void updateCliente(Cliente cliente) throws Exception 
    {
        session = HibernateUtil.getSessionFactory().openSession();   
        try
        {
            session.beginTransaction();
            session.update(cliente);
            session.beginTransaction().commit();
        }
        catch(HibernateException ex)
        {
            ex.printStackTrace();
        }
        HibernateUtil.shutdown();
    }
    public void deleteCliente(Cliente cliente) throws Exception 
    {
        session = HibernateUtil.getSessionFactory().openSession();
        try
        {
            session.beginTransaction();
            session.delete(cliente);
            session.beginTransaction().commit();
        }
        catch(HibernateException ex)
        {
            ex.printStackTrace();
        }
        HibernateUtil.shutdown();
    }
    public Cliente findClienteByCode(Integer cli_codigo) throws Exception 
    {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "select c from Cliente c where cli_codigo=:codigo";
        final Query query = session.createQuery(s);
        query.setInteger("codigo", cli_codigo);
        HibernateUtil.shutdown();
        return (Cliente) query.uniqueResult();
    }
    public Cliente findClienteByNombreusuario(String cli_nombreusuario) throws Exception 
    {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "select c from Cliente c where cli_nombreusuario=:cli_nombreusuario";
        final Query query = session.createQuery(s);
        query.setString("cli_nombreusuario", cli_nombreusuario);
        HibernateUtil.shutdown();
        return (Cliente) query.uniqueResult();
    }
    public List<Cliente> findCliente() throws Exception
    {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "from Cliente";
        final Query query = session.createQuery(s);
        HibernateUtil.shutdown();
        return query.list();
    }
    
}
