/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.PedidoDAO;
import clickandbuy.upc.edu.core.entity.Pedido;
import clickandbuy.upc.edu.core.entity.Producto;
import clickandbuy.upc.edu.core.impl.PedidoImpl;
import java.util.List;

/**
 *
 * @author Piero
 */
public class PedidoBusiness {

    private PedidoDAO pedidodao = new PedidoImpl();

    public void addPedido(Pedido pedido) throws Exception {
        pedidodao.addPedido(pedido);
    }

    public Pedido getPedido(Integer pedCodigo) throws Exception {
        return pedidodao.getPedido(pedCodigo);
    }

    public void updatePedido(Pedido pedido) throws Exception {
        pedidodao.updatePedido(pedido);
    }

    public void deletePedido(Pedido pedido) throws Exception {
        pedidodao.deletePedido(pedido);
    }

    public List<Pedido> listPedido() throws Exception {
        return pedidodao.listPedido();
    }

    public List<Pedido> listPedidoxTipo(String pedTipo) throws Exception {
        return pedidodao.listPedidoxTipo(pedTipo);
    }

    public List<Pedido> listPedidoxCliente(Integer pedCodigocliente) throws Exception {
        return pedidodao.listPedidoxCliente(pedCodigocliente);
    }

    public List<Pedido> listPedidoxClientexTipo(Integer pedCodigocliente, String pedTipo) throws Exception {
        return pedidodao.listPedidoxClientexTipo(pedCodigocliente, pedTipo);
    }

    public List<Producto> listProductoxPedido(int pedCodigo) throws Exception {
        return pedidodao.listProductoxPedido(pedCodigo);
    }
}
