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
 * @author Garyfimo
 */
public class ProductoBusiness {
    private ProductoDAO productodao = new ProductoImpl();
    
    public void addProducto(Producto producto) throws Exception
    { 
        productodao.addProducto(producto);
    }
    
    public Producto getProductoByCode(Integer prod_codigo) throws Exception
    {
      return productodao.getProducto(prod_codigo);
    }
    
    public List<Producto> listProducto() throws Exception
    {
        return productodao.listProducto();                
    }
    
}
