/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.LogDAO;
import clickandbuy.upc.edu.core.entity.Cliente;
import clickandbuy.upc.edu.core.entity.Log;
import clickandbuy.upc.edu.core.impl.LogImpl;
import java.util.List;

/**
 *
 * @author Garyfimo
 */
public class LogBusiness {

    private LogDAO logdao = new LogImpl();
    
    public void addLog(Log log) throws Exception
    {
        logdao.addLog(log);
    }
    
    public List<Log> getLogByCliente(Cliente cliente) throws Exception
    {
        return logdao.listLog(cliente);
    }
}
