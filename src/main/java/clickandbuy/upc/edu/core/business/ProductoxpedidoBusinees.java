/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.ProductoxpedidoDAO;
import clickandbuy.upc.edu.core.entity.Productoxpedido;
import clickandbuy.upc.edu.core.entity.ProductoxpedidoId;
import clickandbuy.upc.edu.core.impl.ProductopedidoImpl;
import java.util.List;

/**
 *
 * @author Piero
 */
public class ProductoxpedidoBusinees {

    private ProductoxpedidoDAO productoxpedidodao = new ProductopedidoImpl();

    public int addProductoxpedido(Productoxpedido productoxpedido) throws Exception {
        return productoxpedidodao.addProductoxpedido(productoxpedido);
    }

    public void updateProductoxpedido(Productoxpedido productoxpedido) throws Exception {
        productoxpedidodao.updateProductoxpedido(productoxpedido);
    }

    public void deleteProductoxpedido(Productoxpedido productoxpedido) throws Exception {
        productoxpedidodao.deleteProductoxpedido(productoxpedido);
    }

    public Productoxpedido getProductoxpedido(ProductoxpedidoId id) throws Exception {
        return productoxpedidodao.getProductoxpedido(id);
    }

    public List<Productoxpedido> listProductoxpedido(Integer proped_codigopedido) throws Exception {
        return productoxpedidodao.listProductoxpedido(proped_codigopedido);
    }
}
