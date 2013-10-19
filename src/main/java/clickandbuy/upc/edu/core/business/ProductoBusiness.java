/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.ProductoDAO;
import clickandbuy.upc.edu.core.entity.Producto;
import clickandbuy.upc.edu.core.impl.ProductoImpl;
import java.util.List;

/**
 *
 * @author Piero
 */
public class ProductoBusiness {

    private ProductoDAO productodao = new ProductoImpl();

    public boolean addProducto(Producto producto) throws Exception {
        return productodao.addProducto(producto);
    }

    public Producto getProductoByCode(Integer prod_codigo) throws Exception {
        return productodao.getProducto(prod_codigo);
    }

    public void deleteProducto(Producto producto) throws Exception {
        productodao.deleteProducto(producto);
    }

    public void updateProducto(Producto producto) throws Exception {
        productodao.updateProducto(producto);
    }

    public List<Producto> listProducto() throws Exception {
        return productodao.listProducto();
    }

    public List<Producto> listProductoxCategoria(Integer prod_codigocategoria) throws Exception {
        return productodao.listProductoxCategoria(prod_codigocategoria);
    }
}
