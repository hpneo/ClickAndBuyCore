/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.impl;

import clickandbuy.upc.edu.core.dao.RolDAO;
import clickandbuy.upc.edu.core.entity.Rol;
import clickandbuy.upc.edu.core.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Garyfimo
 */
public class RolDaoImpl implements RolDAO {

    private Session session;

    @Override
    public void addRol(Rol rol) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.merge(rol);
        session.beginTransaction().commit();
    }

    @Override
    public List<Rol> findRol() {
        session = HibernateUtil.getSessionFactory().openSession();
        final String hql = "from Rol";
        final Query query = session.createQuery(hql);
        return query.list();
    }

    @Override
    public void updateRol(Rol rol) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(rol);
        session.beginTransaction().commit();
    }

    @Override
    public void deleteRol(Rol rol) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(rol);
        session.beginTransaction().commit();
    }

    @Override
    public Rol findRolbyName(String rol_nombre) {
        session = HibernateUtil.getSessionFactory().openSession();
        final String hql = "select c from Rol c where rol_nombre=:rol_nombre";
        final Query query = session.createQuery(hql);
        query.setString("rol_nombre", rol_nombre);
        HibernateUtil.shutdown();
        return (Rol) query.uniqueResult();
    }

    @Override
    public Rol findRolbyCode(Integer rol_codigo) {
        session = HibernateUtil.getSessionFactory().openSession();
        final String hql = "select c from Rol c where rol_codigo=:rol_codigo";
        final Query query = session.createQuery(hql);
        query.setInteger("rol_codigo", rol_codigo);
        HibernateUtil.shutdown();
        return (Rol) query.uniqueResult();
    }
}
