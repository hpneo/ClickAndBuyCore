/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.impl;

import clickandbuy.upc.edu.core.dao.ClienteDAO;
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
public class ClienteDaoImpl implements ClienteDAO {

    private Session session;

    @Override
    public void addCliente(Cliente cliente) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.merge(cliente);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
        HibernateUtil.shutdown();
    }

    @Override
    public void updateCliente(Cliente cliente) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(cliente);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
        HibernateUtil.shutdown();
    }

    @Override
    public void deleteCliente(Cliente cliente) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.delete(cliente);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
        HibernateUtil.shutdown();
    }

    @Override
    public Cliente findClienteByCode(Integer cliCodigo) {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "select c from Cliente c where cli_codigo=:codigo";
        final Query query = session.createQuery(s);
        query.setInteger("codigo", cliCodigo);
        HibernateUtil.shutdown();
        return (Cliente) query.uniqueResult();
    }

    @Override
    public Cliente findClienteByNombreusuario(String cliNombreusuario) {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "select c from Cliente c where cli_nombreusuario=:cli_nombreusuario";
        final Query query = session.createQuery(s);
        query.setString("cli_nombreusuario", cliNombreusuario);
        HibernateUtil.shutdown();
        return (Cliente) query.uniqueResult();
    }

    @Override
    public List<Cliente> findCliente() {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "from Cliente";
        final Query query = session.createQuery(s);
        HibernateUtil.shutdown();
        return query.list();
    }
}
