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

    public Pedido getPedido(Integer pedCodigo) throws PedidoException;

    public void updatePedido(Pedido pedido) throws PedidoException;

    public void deletePedido(Pedido pedido) throws PedidoException;

    public List<Pedido> listPedido() throws PedidoException;

    public List<Pedido> listPedidoxTipo(String pedTipo) throws PedidoException;

    public List<Pedido> listPedidoxCliente(Integer pedCodigocliente) throws PedidoException;

    public List<Pedido> listPedidoxClientexTipo(Integer pedCodigocliente, String pedTipo) throws PedidoException;

    public List<Producto> listProductoxPedido(int pedCodigo) throws PedidoException;
}
