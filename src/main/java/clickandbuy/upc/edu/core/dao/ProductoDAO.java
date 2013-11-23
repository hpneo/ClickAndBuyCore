/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.dao;

import clickandbuy.upc.edu.core.entity.Producto;
import clickandbuy.upc.edu.core.exception.ProductoException;
import java.util.List;

/**
 *
 * @author Piero
 */
public interface ProductoDAO {

    public boolean addProducto(Producto producto) throws ProductoException;

    public Producto getProducto(Integer prodCodigo) throws Exception;

    public void deleteProducto(Producto producto) throws ProductoException;

    public void updateProducto(Producto producto) throws ProductoException;

    public List<Producto> listProducto() throws ProductoException;

    public List<Producto> listProductoxCategoria(Integer prodCodigoCategoria) throws ProductoException;
}
