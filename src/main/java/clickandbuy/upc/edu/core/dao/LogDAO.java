/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.dao;

import clickandbuy.upc.edu.core.entity.Cliente;
import clickandbuy.upc.edu.core.entity.Log;
import java.util.List;

/**
 *
 * @author Garyfimo
 */
public interface LogDAO {

    public void addLog(Log log) throws Exception;

    public List<Log> listLog(Cliente cliente) throws Exception;
}
