/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.dao;

import clickandbuy.upc.edu.core.entity.Producto;
import java.util.List;

/**
 *
 * @author Piero
 */
public interface ProductoDAO {

    public boolean addProducto(Producto producto) throws Exception;

    public Producto getProducto(Integer prodCodigo) throws Exception;

    public void deleteProducto(Producto producto) throws Exception;

    public void updateProducto(Producto producto) throws Exception;

    public List<Producto> listProducto() throws Exception;

    public List<Producto> listProductoxCategoria(Integer prodCodigocategoria) throws Exception;
}
