/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.dao;

import clickandbuy.upc.edu.core.entity.Cliente;
import java.util.List;

/**
 *
 * @author Piero
 */
public interface ClienteDao {
    
    public void addCliente(Cliente cliente) throws Exception;    
    public Cliente findClienteByCode(Integer cli_codigo) throws Exception;
    public Cliente findClienteByNombreusuario(String cli_nombreusuario) throws Exception;
    public void updateCliente(Cliente cliente) throws Exception;
    public void deleteCliente(Cliente cliente) throws Exception;
    public List<Cliente> findCliente() throws Exception;
    
    
}
