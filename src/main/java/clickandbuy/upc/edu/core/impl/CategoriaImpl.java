package clickandbuy.upc.edu.core.impl;

import clickandbuy.upc.edu.core.dao.CategoriaDAO;
import clickandbuy.upc.edu.core.entity.Categoria;
import clickandbuy.upc.edu.core.util.HibernateUtil;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

public class CategoriaImpl implements CategoriaDAO {

    Session session;

    @Override
    public void addCategoria(Categoria categoria) {

        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.merge(categoria);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

    @Override
    public Categoria getCategoria(Integer catCodigo) {
        session = HibernateUtil.getSessionFactory().openSession();
        final String hql = "select c from Categoria c where cat_codigo=:codigo";
        final Query query = session.createQuery(hql);
        query.setInteger("codigo", catCodigo);
        return (Categoria) query.uniqueResult();
    }

    @Override
    public Categoria getCategoriaXNombre(String nombre) {
        session = HibernateUtil.getSessionFactory().openSession();
        final String hql = "select n from Categoria n where cat_nombre=:nombre";
        final Query query = session.createQuery(hql);
        return (Categoria) query.uniqueResult();
    }

    @Override
    public List<Categoria> listCategoria() {
        session = HibernateUtil.getSessionFactory().openSession();
        final String hql = "from Categoria";
        final Query query = session.createQuery(hql);
        return query.list();
    }
}
