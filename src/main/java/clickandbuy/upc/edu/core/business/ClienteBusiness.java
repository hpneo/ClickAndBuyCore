/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.ClienteDAO;
import clickandbuy.upc.edu.core.entity.Cliente;
import clickandbuy.upc.edu.core.impl.ClienteImpl;
import java.util.List;

/**
 *
 * @author Piero
 */
public class ClienteBusiness {

    private ClienteDAO clientedao = new ClienteImpl();

    public void addCliente(Cliente cliente) throws Exception {
        clientedao.addCliente(cliente);
    }

    public Cliente getClienteByCode(Integer cli_codigo) throws Exception {
        return clientedao.getCliente(cli_codigo);
    }

    public void deleteCliente(Cliente cliente) throws Exception {
        clientedao.deleteCliente(cliente);
    }

    public void updateCliente(Cliente cliente) throws Exception {
        clientedao.updateCliente(cliente);
    }

    public List<Cliente> listCliente() throws Exception {
        return clientedao.listCliente();
    }
}
