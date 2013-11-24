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

    @Override
    public void addUsuario(Usuario usuario) {

        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.merge(usuario);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
        HibernateUtil.shutdown();
    }

    @Override
    public Usuario findUsuariobyUsername(String usuNickname) {

        session = HibernateUtil.getSessionFactory().openSession();
        //left join fetch u.rol
        final String hql = "select u from Usuario u where usu_nombreusuario=:usu_nickname";
        final Query query = session.createQuery(hql);
        query.setString("usu_nickname", usuNickname);
        HibernateUtil.shutdown();

        return (Usuario) query.uniqueResult();
    }

    @Override
    public Usuario findUsuariobyCode(Integer usuCodigo) {

        session = HibernateUtil.getSessionFactory().openSession();

        final String hql = "select u from Usuario u left join fetch u.rol where usu_codigo=:usu_codigo";
        final Query query = session.createQuery(hql);
        query.setInteger("usu_codigo", usuCodigo);
        HibernateUtil.shutdown();

        return (Usuario) query.uniqueResult();
    }

    @Override
    public boolean deleteUsuario(Usuario usuario) {
        boolean bool;
        session = HibernateUtil.getSessionFactory().openSession();
        bool = false;
        try {
            session.beginTransaction();
            session.delete(usuario);
            session.beginTransaction().commit();
            bool = true;
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
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
            throw new HibernateException(ex);
        }
        HibernateUtil.shutdown();

    }

    @Override
    public List<Usuario> findUsuariobyRol(Integer usuCodigorol) {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "select c from Usuario c where usu_codigorol=:codigo";
        final Query query = session.createQuery(s);
        query.setInteger("codigo", usuCodigorol);
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
