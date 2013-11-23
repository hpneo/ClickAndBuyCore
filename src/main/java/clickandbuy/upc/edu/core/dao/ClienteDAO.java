/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.dao;

import clickandbuy.upc.edu.core.entity.Cliente;
import clickandbuy.upc.edu.core.exception.ClienteException;
import java.util.List;

/**
 *
 * @author Piero
 */
public interface ClienteDAO {

    public void addCliente(Cliente cliente) throws ClienteException;

    public Cliente findClienteByCode(Integer cliCodigo) throws ClienteException;

    public Cliente findClienteByNombreusuario(String cliNombreUsuario) throws ClienteException;

    public void updateCliente(Cliente cliente) throws ClienteException;

    public void deleteCliente(Cliente cliente) throws ClienteException;

    public List<Cliente> findCliente() throws ClienteException;
}
