/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.ClienteDAO;
import clickandbuy.upc.edu.core.entity.Cliente;
import clickandbuy.upc.edu.core.exception.ClienteException;
import clickandbuy.upc.edu.core.impl.ClienteDaoImpl;
import java.util.List;

/**
 *
 * @author Piero
 */
public class ClienteBusiness {

    private ClienteDAO clientedao = new ClienteDaoImpl();

    public void addCliente(Cliente cliente) throws ClienteException {
        clientedao.addCliente(cliente);
    }

    public Cliente getClienteByCode(Integer cliCodigo) throws ClienteException {
        return clientedao.findClienteByCode(cliCodigo);
    }

    public Cliente findClienteByNombreusuario(String cliNombreusuario) throws ClienteException {
        return clientedao.findClienteByNombreusuario(cliNombreusuario);
    }

    public void deleteCliente(Cliente cliente) throws ClienteException {
        clientedao.deleteCliente(cliente);
    }

    public void updateCliente(Cliente cliente) throws ClienteException {
        clientedao.updateCliente(cliente);
    }

    public List<Cliente> listCliente() throws ClienteException {
        return clientedao.findCliente();
    }

    public boolean existeCliente(String cliNombreusuario) throws ClienteException {
        Boolean existe = false;
        Cliente cli = this.findClienteByNombreusuario(cliNombreusuario);
        if (cli != null) {
            existe = true;
        }
        return existe;
    }

    public boolean autenticarCliente(String cliNombreusuario, String cliContrasenia) throws ClienteException {
        boolean resultado = false;
        Cliente cli = this.findClienteByNombreusuario(cliNombreusuario);
        if (cli != null && cli.getCliContrasenia().equals(cliContrasenia)) {
            resultado = true;
        }

        return resultado;
    }

    public Cliente iniciarSesion(String userNickname) throws ClienteException {

        return findClienteByNombreusuario(userNickname);
    }
}
