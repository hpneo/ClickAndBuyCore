/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.dao;

import clickandbuy.upc.edu.core.entity.Productoxpedido;
import clickandbuy.upc.edu.core.entity.ProductoxpedidoId;
import java.util.List;

/**
 *
 * @author Piero
 */
public interface ProductoxpedidoDAO {

    public int addProductoxpedido(Productoxpedido productoxpedido) throws Exception;

    public void updateProductoxpedido(Productoxpedido productoxpedido) throws Exception;

    public void deleteProductoxpedido(Productoxpedido productoxpedido) throws Exception;

    public Productoxpedido getProductoxpedido(ProductoxpedidoId id) throws Exception;

    public List<Productoxpedido> listProductoxpedido(Integer propedCodigopedido) throws Exception;
}
