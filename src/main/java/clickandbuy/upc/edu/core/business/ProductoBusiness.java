/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.ProductoDAO;
import clickandbuy.upc.edu.core.entity.Producto;
import clickandbuy.upc.edu.core.exception.ProductoException;
import clickandbuy.upc.edu.core.impl.ProductoImpl;
import java.util.List;

/**
 *
 * @author Piero
 */
public class ProductoBusiness {

    private ProductoDAO productodao = new ProductoImpl();

    public boolean addProducto(Producto producto) throws ProductoException {
        return productodao.addProducto(producto);
    }

    public Producto getProductoByCode(Integer prodCodigo) throws ProductoException {
        return productodao.getProducto(prodCodigo);
    }

    public void deleteProducto(Producto producto) throws ProductoException {
        productodao.deleteProducto(producto);
    }

    public void updateProducto(Producto producto) throws ProductoException {
        productodao.updateProducto(producto);
    }

    public List<Producto> listProducto() throws ProductoException {
        return productodao.listProducto();
    }

    public List<Producto> listProductoxCategoria(Integer prodCodigocategoria) throws ProductoException {
        return productodao.listProductoxCategoria(prodCodigocategoria);
    }
}
