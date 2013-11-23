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

    public Cliente getClienteByCode(Integer cli_codigo) throws Exception {
        return clientedao.findClienteByCode(cli_codigo);
    }

    public Cliente findClienteByNombreusuario(String cli_nombreusuario) throws Exception {
        return clientedao.findClienteByNombreusuario(cli_nombreusuario);
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

    public boolean existeCliente(String cli_nombreusuario) throws Exception {
        Boolean existe = false;
        Cliente cli = this.findClienteByNombreusuario(cli_nombreusuario);
        if (cli != null) {
            existe = true;
        }
        return existe;
    }

    public boolean autenticarCliente(String cli_nombreusuario, String cli_contrasenia) throws Exception {
        boolean resultado = false;
        Cliente cli = this.findClienteByNombreusuario(cli_nombreusuario);
        if (cli != null) {
            if (cli.getCliContrasenia().equals(cli_contrasenia)) {
                resultado = true;
            }
        }
        return resultado;
    }

    public Cliente iniciarSesion(String userNickname) throws Exception {
        Cliente cli = findClienteByNombreusuario(userNickname);
        return cli;
    }
}
