/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.impl;

import clickandbuy.upc.edu.core.dao.UsuarioDAO;
import clickandbuy.upc.edu.core.entity.Usuario;
import clickandbuy.upc.edu.core.util.HibernateUtil;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Garyfimo
 */
public class UsuarioDaoImpl implements UsuarioDAO {

    private Session session;
    private boolean bool;

    @Override
    public void addUsuario(Usuario usuario) {

        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.merge(usuario);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            Logger.getLogger(UsuarioDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        HibernateUtil.shutdown();
    }

    @Override
    public Usuario findUsuariobyUsername(String usu_nickname) {

        session = HibernateUtil.getSessionFactory().openSession();
        //left join fetch u.rol
        final String hql = "select u from Usuario u where usu_nombreusuario=:usu_nickname";
        final Query query = session.createQuery(hql);
        query.setString("usu_nickname", usu_nickname);
        HibernateUtil.shutdown();

        return (Usuario) query.uniqueResult();
    }

    @Override
    public Usuario findUsuariobyCode(Integer usu_codigo) {

        session = HibernateUtil.getSessionFactory().openSession();

        final String hql = "select u from Usuario u left join fetch u.rol where usu_codigo=:usu_codigo";
        final Query query = session.createQuery(hql);
        query.setInteger("usu_codigo", usu_codigo);
        HibernateUtil.shutdown();

        return (Usuario) query.uniqueResult();
    }

    @Override
    public boolean deleteUsuario(Usuario usuario) {

        session = HibernateUtil.getSessionFactory().openSession();
        bool = false;
        try {
            session.beginTransaction();
            session.delete(usuario);
            session.beginTransaction().commit();
            bool = true;
        } catch (HibernateException ex) {
            Logger.getLogger(UsuarioDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        HibernateUtil.shutdown();
        return bool;
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(usuario);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            Logger.getLogger(UsuarioDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
            HibernateUtil.shutdown();
        }
    }

    @Override
    public List<Usuario> findUsuariobyRol(Integer usu_codigorol) {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "select c from Usuario c where usu_codigorol=:codigo";
        final Query query = session.createQuery(s);
        query.setInteger("codigo", usu_codigorol);
        HibernateUtil.shutdown();
        return query.list();
    }

    @Override
    public List<Usuario> findUsuario() {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "from Usuario";
        final Query query = session.createQuery(s);
        HibernateUtil.shutdown();
        return query.list();
    }
}
