/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.dao;

import clickandbuy.upc.edu.core.entity.Producto;
import java.util.List;

/**
 *
 * @author Garyfimo
 */
public interface ProductoDAO {

    public void addProducto(Producto producto) throws Exception;
    public List<Producto> listProducto() throws Exception;
}
