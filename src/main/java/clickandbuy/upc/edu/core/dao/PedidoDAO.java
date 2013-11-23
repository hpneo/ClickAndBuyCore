/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.dao;

import clickandbuy.upc.edu.core.entity.Pedido;
import clickandbuy.upc.edu.core.entity.Producto;
import clickandbuy.upc.edu.core.exception.PedidoException;
import java.util.List;

/**
 *
 * @author Piero
 */
public interface PedidoDAO {

    public void addPedido(Pedido pedido) throws PedidoException;

    public Pedido getPedido(Integer ped_codigo) throws PedidoException;

    public void updatePedido(Pedido pedido) throws PedidoException;

    public void deletePedido(Pedido pedido) throws PedidoException;

    public List<Pedido> listPedido() throws PedidoException;

    public List<Pedido> listPedidoxTipo(String ped_tipo) throws PedidoException;

    public List<Pedido> listPedidoxCliente(Integer ped_codigocliente) throws PedidoException;

    public List<Pedido> listPedidoxClientexTipo(Integer ped_codigocliente, String ped_tipo) throws PedidoException;

    public List<Producto> listProductoxPedido(int ped_codigo) throws PedidoException;
}
