/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.ClienteDAO;
import clickandbuy.upc.edu.core.entity.Cliente;
import clickandbuy.upc.edu.core.impl.ClienteDaoImpl;
import java.util.List;

/**
 *
 * @author Piero
 */
public class ClienteBusiness {

    private ClienteDAO clientedao = new ClienteDaoImpl();

    public void addCliente(Cliente cliente) throws Exception {
        clientedao.addCliente(cliente);
    }

    public Cliente getClienteByCode(Integer cliCodigo) throws Exception {
        return clientedao.findClienteByCode(cliCodigo);
    }

    public Cliente findClienteByNombreusuario(String cliNombreusuario) throws Exception {
        return clientedao.findClienteByNombreusuario(cliNombreusuario);
    }

    public void deleteCliente(Cliente cliente) throws Exception {
        clientedao.deleteCliente(cliente);
    }

    public void updateCliente(Cliente cliente) throws Exception {
        clientedao.updateCliente(cliente);
    }

    public List<Cliente> listCliente() throws Exception {
        return clientedao.findCliente();
    }

    public boolean existeCliente(String cliNombreusuario) throws Exception {
        Boolean existe = false;
        Cliente cli = this.findClienteByNombreusuario(cliNombreusuario);
        if (cli != null) {
            existe = true;
        }
        return existe;
    }

    public boolean autenticarCliente(String cliNombreusuario, String cliContrasenia) throws Exception {
        boolean resultado = false;
        Cliente cli = this.findClienteByNombreusuario(cliNombreusuario);
        if (cli != null && cli.getCliContrasenia().equals(cliContrasenia)) {
            resultado = true;
        }

        return resultado;
    }

    public Cliente iniciarSesion(String userNickname) throws Exception {

        return findClienteByNombreusuario(userNickname);
    }
}
