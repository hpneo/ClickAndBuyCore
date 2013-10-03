/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.impl;

import clickandbuy.upc.edu.core.dao.UsuarioDAO;
import clickandbuy.upc.edu.core.entity.Usuario;
import clickandbuy.upc.edu.core.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Garyfimo
 */
public class UsuarioImpl implements UsuarioDAO{

    private Session session;
    
    public void addUsuario(Usuario usuario) throws Exception {
      
      session = HibernateUtil.getSessionFactory().openSession();
      
      session.beginTransaction();
      session.merge(usuario);
      session.beginTransaction().commit();
        
    }

    public Usuario getUsuario(String usu_nickname) throws Exception {
        
        session = HibernateUtil.getSessionFactory().openSession();
        
        final String hql = "select u from Usuario u where usu_nombreusuario=:nickname";
        final Query query = session.createQuery(hql);
        query.setString("nickname", usu_nickname);
        
        return (Usuario) query.uniqueResult();
    }

    public void deleteUsuario(Usuario usuario) throws Exception {
        
        session = HibernateUtil.getSessionFactory().openSession();
        
        session.beginTransaction();
        session.delete(usuario);
        session.beginTransaction().commit();
        
    }
    
}
