/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.impl;

import clickandbuy.upc.edu.core.dao.UsuarioDAO;
import clickandbuy.upc.edu.core.entity.Usuario;
import clickandbuy.upc.edu.core.util.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Garyfimo
 */
public class UsuarioImpl implements UsuarioDAO{

    private Session session;
    private boolean bool;
    
    public boolean addUsuario(Usuario usuario) throws Exception {
      
      session = HibernateUtil.getSessionFactory().openSession();
      bool = false;
      try{
      session.beginTransaction();
      session.merge(usuario);
      session.beginTransaction().commit();
      bool = true;
      }catch(HibernateException ex)
      {
          ex.printStackTrace();
      }
      return bool;
    }

    public Usuario getUsuario(String usu_nickname) throws Exception {
        
        session = HibernateUtil.getSessionFactory().openSession();
        
        final String hql = "select u from Usuario u where usu_nombreusuario=:nickname";
        final Query query = session.createQuery(hql);
        query.setString("nickname", usu_nickname);
        
        return (Usuario) query.uniqueResult();
    }

    public boolean deleteUsuario(Usuario usuario) throws Exception {
        
        session = HibernateUtil.getSessionFactory().openSession();
        bool = false;
        try{
        session.beginTransaction();
        session.delete(usuario);
        session.beginTransaction().commit();
        bool = true;
        }catch(HibernateException ex)
        {
            ex.printStackTrace();
        }
        
        return bool;
    }
    
}
