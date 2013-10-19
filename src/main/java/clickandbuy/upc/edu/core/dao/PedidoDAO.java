/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.dao;

import clickandbuy.upc.edu.core.entity.Pedido;
import clickandbuy.upc.edu.core.entity.Producto;
import java.util.List;

/**
 *
 * @author Piero
 */
public interface PedidoDAO {

    public void addPedido(Pedido pedido) throws Exception;

    public Pedido getPedido(Integer ped_codigo) throws Exception;

    public void updatePedido(Pedido pedido) throws Exception;

    public void deletePedido(Pedido pedido) throws Exception;

    public List<Pedido> listPedido() throws Exception;

    public List<Pedido> listPedidoxTipo(String ped_tipo) throws Exception;

    public List<Pedido> listPedidoxCliente(Integer ped_codigocliente) throws Exception;

    public List<Pedido> listPedidoxClientexTipo(Integer ped_codigocliente, String ped_tipo) throws Exception;

    public List<Producto> listProductoxPedido(int ped_codigo) throws Exception;
}
