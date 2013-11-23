/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.impl;

import clickandbuy.upc.edu.core.dao.UsuarioDAO;
import clickandbuy.upc.edu.core.entity.Usuario;
import clickandbuy.upc.edu.core.util.HibernateUtil;
import java.util.List;
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

    public void addUsuario(Usuario usuario) throws Exception {

        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.merge(usuario);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        HibernateUtil.shutdown();
    }

    public Usuario findUsuariobyUsername(String usu_nickname) throws Exception {

        session = HibernateUtil.getSessionFactory().openSession();
        //left join fetch u.rol
        final String hql = "select u from Usuario u where usu_nombreusuario=:usu_nickname";
        final Query query = session.createQuery(hql);
        query.setString("usu_nickname", usu_nickname);
        HibernateUtil.shutdown();

        return (Usuario) query.uniqueResult();
    }

    public Usuario findUsuariobyCode(Integer usu_codigo) throws Exception {

        session = HibernateUtil.getSessionFactory().openSession();

        final String hql = "select u from Usuario u left join fetch u.rol where usu_codigo=:usu_codigo";
        final Query query = session.createQuery(hql);
        query.setInteger("usu_codigo", usu_codigo);
        HibernateUtil.shutdown();

        return (Usuario) query.uniqueResult();
    }

    public boolean deleteUsuario(Usuario usuario) throws Exception {

        session = HibernateUtil.getSessionFactory().openSession();
        bool = false;
        try {
            session.beginTransaction();
            session.delete(usuario);
            session.beginTransaction().commit();
            bool = true;
        } catch (HibernateException ex) {
            ex.printStackTrace();
        }
        HibernateUtil.shutdown();
        return bool;
    }

    public void updateUsuario(Usuario usuario) throws Exception {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(usuario);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            ex.printStackTrace();
            HibernateUtil.shutdown();
        }
    }

    public List<Usuario> findUsuariobyRol(Integer usu_codigorol) throws Exception {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "select c from Usuario c where usu_codigorol=:codigo";
        final Query query = session.createQuery(s);
        query.setInteger("codigo", usu_codigorol);
        HibernateUtil.shutdown();
        return query.list();
    }

    public List<Usuario> findUsuario() throws Exception {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "from Usuario";
        final Query query = session.createQuery(s);
        HibernateUtil.shutdown();
        return query.list();
    }
}
