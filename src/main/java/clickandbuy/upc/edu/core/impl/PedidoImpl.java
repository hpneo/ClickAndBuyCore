/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.impl;

import clickandbuy.upc.edu.core.dao.PedidoDAO;
import clickandbuy.upc.edu.core.entity.Pedido;
import clickandbuy.upc.edu.core.entity.Producto;
import clickandbuy.upc.edu.core.util.HibernateUtil;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Piero
 */
public class PedidoImpl implements PedidoDAO {

    private Session session;

    @Override
    public void addPedido(Pedido pedido) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.merge(pedido);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
    }
    }

    @Override
    public Pedido getPedido(Integer ped_codigo) {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "select c from Pedido c where ped_codigo=:codigo";
        final Query query = session.createQuery(s);
        query.setInteger("codigo", ped_codigo);
        return (Pedido) query.uniqueResult();
    }

    @Override
    public void updatePedido(Pedido pedido) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.update(pedido);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

    @Override
    public void deletePedido(Pedido pedido) {
        session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.delete(pedido);
            session.beginTransaction().commit();
        } catch (HibernateException ex) {
            throw new HibernateException(ex);
        }
    }

    @Override
    public List<Pedido> listPedido() {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "from Pedido";
        final Query query = session.createQuery(s);
        return query.list();
    }

    @Override
    public List<Pedido> listPedidoxTipo(String ped_tipo) {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "select c from Pedido c where ped_tipo=:tipo";
        final Query query = session.createQuery(s);
        query.setString("tipo", ped_tipo);
        return query.list();
    }

    @Override
    public List<Pedido> listPedidoxCliente(Integer ped_codigocliente) {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "select c from Pedido c where ped_codigocliente=:codigo";
        final Query query = session.createQuery(s);
        query.setInteger("codigo", ped_codigocliente);
        return query.list();
    }

    @Override
    public List<Pedido> listPedidoxClientexTipo(Integer ped_codigocliente, String ped_tipo) {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "select c from Pedido c where ped_codigocliente=:codigo and ped_tipo=:tipo";
        final Query query = session.createQuery(s);
        query.setInteger("codigo", ped_codigocliente);
        query.setString("tipo", ped_tipo);
        return query.list();
    }

    @Override
    public List<Producto> listProductoxPedido(int ped_codigo) {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "select c from Pedido c where ped_tipo=:tipo";
        final Query query = session.createQuery(s);
        return query.list();
    }
}
