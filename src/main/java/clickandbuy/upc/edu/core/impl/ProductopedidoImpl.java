/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.impl;

import clickandbuy.upc.edu.core.dao.ProductoxpedidoDAO;
import clickandbuy.upc.edu.core.entity.Productoxpedido;
import clickandbuy.upc.edu.core.entity.ProductoxpedidoId;
import clickandbuy.upc.edu.core.util.Constantes;
import clickandbuy.upc.edu.core.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Piero
 */
public class ProductopedidoImpl implements ProductoxpedidoDAO {

    private Session session;

    @Override
    public int addProductoxpedido(Productoxpedido productoxpedido) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.merge(productoxpedido);
        session.beginTransaction().commit();
        session.close();
        return productoxpedido.getId().hashCode();
    }

    @Override
    public void updateProductoxpedido(Productoxpedido productoxpedido) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(productoxpedido);
        session.beginTransaction().commit();
        session.close();
    }

    @Override
    public void deleteProductoxpedido(Productoxpedido productoxpedido) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(productoxpedido);
        session.beginTransaction().commit();
        session.close();

    }

    @Override
    public Productoxpedido getProductoxpedido(ProductoxpedidoId id) {
        int proped_codigopedido = id.getPropedCodigopedido();
        int proped_codigoproducto = id.getPropedCodigoproducto();
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "select c from Productoxpedido c where proped_codigopedido=:codigo and proped_codigoproducto=:codigop";
        final Query query = session.createQuery(s);
        query.setInteger(Constantes.CODIGO, proped_codigopedido);
        query.setInteger("codigop", proped_codigoproducto);
        return (Productoxpedido) query.uniqueResult();
    }

    @Override
    public List<Productoxpedido> listProductoxpedido(Integer proped_codigopedido) {
        session = HibernateUtil.getSessionFactory().openSession();
        final String s = "select c from Productoxpedido c where proped_codigopedido=:codigo";
        final Query query = session.createQuery(s);
        query.setInteger("codigo", proped_codigopedido);
        session.close();
        return query.list();
    }
}
