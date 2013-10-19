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

    public Pedido getPedido(Integer ped_codigo) throws Exception {
        return pedidodao.getPedido(ped_codigo);
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

    public List<Pedido> listPedidoxTipo(String ped_tipo) throws Exception {
        return pedidodao.listPedidoxTipo(ped_tipo);
    }

    public List<Pedido> listPedidoxCliente(Integer ped_codigocliente) throws Exception {
        return pedidodao.listPedidoxCliente(ped_codigocliente);
    }

    public List<Pedido> listPedidoxClientexTipo(Integer ped_codigocliente, String ped_tipo) throws Exception {
        return pedidodao.listPedidoxClientexTipo(ped_codigocliente, ped_tipo);
    }

    public List<Producto> listProductoxPedido(int ped_codigo) throws Exception {
        return pedidodao.listProductoxPedido(ped_codigo);
    }
}
