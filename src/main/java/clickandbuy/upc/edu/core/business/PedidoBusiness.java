/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.PedidoDAO;
import clickandbuy.upc.edu.core.entity.Pedido;
import clickandbuy.upc.edu.core.entity.Producto;
import clickandbuy.upc.edu.core.exception.PedidoException;
import clickandbuy.upc.edu.core.impl.PedidoImpl;
import java.util.List;

/**
 *
 * @author Piero
 */
public class PedidoBusiness {

    private PedidoDAO pedidodao = new PedidoImpl();

    public void addPedido(Pedido pedido) throws PedidoException {
        pedidodao.addPedido(pedido);
    }

    public Pedido getPedido(Integer pedCodigo) throws PedidoException {
        return pedidodao.getPedido(pedCodigo);
    }

    public void updatePedido(Pedido pedido) throws PedidoException {
        pedidodao.updatePedido(pedido);
    }

    public void deletePedido(Pedido pedido) throws PedidoException {
        pedidodao.deletePedido(pedido);
    }

    public List<Pedido> listPedido() throws PedidoException {
        return pedidodao.listPedido();
    }

    public List<Pedido> listPedidoxTipo(String pedTipo) throws PedidoException {
        return pedidodao.listPedidoxTipo(pedTipo);
    }

    public List<Pedido> listPedidoxCliente(Integer pedCodigocliente) throws PedidoException {
        return pedidodao.listPedidoxCliente(pedCodigocliente);
    }

    public List<Pedido> listPedidoxClientexTipo(Integer pedCodigocliente, String pedTipo) throws PedidoException {
        return pedidodao.listPedidoxClientexTipo(pedCodigocliente, pedTipo);
    }

    public List<Producto> listProductoxPedido(int pedCodigo) throws PedidoException {
        return pedidodao.listProductoxPedido(pedCodigo);
    }
}
