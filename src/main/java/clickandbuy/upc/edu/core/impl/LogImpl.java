/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.impl;

import clickandbuy.upc.edu.core.dao.LogDAO;
import clickandbuy.upc.edu.core.entity.Cliente;
import clickandbuy.upc.edu.core.entity.Log;
import clickandbuy.upc.edu.core.util.HibernateUtil;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author Garyfimo
 */
public class LogImpl implements LogDAO {

    private Session session;
<<<<<<< HEAD

    @Override
    public void addLog(Log log) {
=======
    
    
    public void addLog(Log log) throws Exception {
>>>>>>> 28c455c349210a566fe93b6a65a549d1a651e152
        session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        session.merge(log);
        session.beginTransaction().commit();

    }

    @Override
    public List<Log> listLog(Cliente cliente) {
        session = HibernateUtil.getSessionFactory().openSession();

        final String hql = "select l from Log l where log_codigocliente=:codigo";
        final Query query = session.createQuery(hql);
        query.setInteger("log_codigocliente", cliente.getCliCodigo());

        return query.list();

    }
}
