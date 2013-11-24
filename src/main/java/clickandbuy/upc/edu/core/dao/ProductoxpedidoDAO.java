/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.dao;

import clickandbuy.upc.edu.core.entity.Productoxpedido;
import clickandbuy.upc.edu.core.entity.ProductoxpedidoId;
import clickandbuy.upc.edu.core.exception.ProductoxpedidoException;
import java.util.List;

/**
 *
 * @author Piero
 */
public interface ProductoxpedidoDAO {

    public int addProductoxpedido(Productoxpedido productoxpedido) throws ProductoxpedidoException;

    public void updateProductoxpedido(Productoxpedido productoxpedido) throws ProductoxpedidoException;

    public void deleteProductoxpedido(Productoxpedido productoxpedido) throws ProductoxpedidoException;

    public Productoxpedido getProductoxpedido(ProductoxpedidoId id) throws ProductoxpedidoException;

    public List<Productoxpedido> listProductoxpedido(Integer propedCodigopedido) throws ProductoxpedidoException;
}
