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

    public Pedido getPedido(Integer pedCodigo) throws Exception;

    public void updatePedido(Pedido pedido) throws Exception;

    public void deletePedido(Pedido pedido) throws Exception;

    public List<Pedido> listPedido() throws Exception;

    public List<Pedido> listPedidoxTipo(String pedTipo) throws Exception;

    public List<Pedido> listPedidoxCliente(Integer pedCodigocliente) throws Exception;

    public List<Pedido> listPedidoxClientexTipo(Integer pedCodigocliente, String pedTipo) throws Exception;

    public List<Producto> listProductoxPedido(int pedCodigo) throws Exception;
}
