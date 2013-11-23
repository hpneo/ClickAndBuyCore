/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.entity.Categoria;
import clickandbuy.upc.edu.core.entity.Producto;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author Garyfimo
 */
public class ComprasBusinessTest {

    public ComprasBusinessTest() {
    }

    /* @Test
     public void testAddCompras() throws Exception 
     {
     System.out.println("addCompras");
     Compras compras = new Compras();
     Producto producto = new Producto();
     producto.setProdNombre("Leche Gloria");
     producto.setProdDescripcion("Leche evaporada y entera; en bolsa, en tarro y en caja");
     producto.setProdPreciocompra(3.15);
     producto.setProdPrecioventa(3.65);
     producto.setProdStock(14);
     Categoria cat = new Categoria();
     cat.setCatCodigo(1);
     cat.setCatNombre("ABARROTES");
     producto.setCategoria(cat);
     producto.setProdCodigo(7);
     compras.setProducto(producto);
     compras.setCarCantidad(25);
     compras.setCarPrecio(36.36);
     ComprasBusiness comprasBusiness = new ComprasBusiness();
        
     assertTrue(comprasBusiness.addCompras(compras));
     }

     @Test
     public void testGetCompras() throws Exception {
     System.out.println("getCompras");
     Integer com_codigo = 1;
     ComprasBusiness comprasBusiness = new ComprasBusiness();
     Compras compras = comprasBusiness.getCompras(com_codigo);
        
     System.out.println(compras.getProducto().getProdNombre());
        
     assertTrue(true);
        
        
     }

     @Test
     public void testDeleteCompras() throws Exception {
     System.out.println("deleteCompras");
     Compras comrito = null;
     ComprasBusiness instance = new ComprasBusiness();
     instance.deleteCompras(comrito);
     fail("The test case is a prototype.");
     }

     @Test
     public void testListCompras() throws Exception {
     System.out.println("listCompras");
     ComprasBusiness instance = new ComprasBusiness();
     List expResult = null;
     List result = instance.listCompras();
     assertEquals(expResult, result);
     fail("The test case is a prototype.");
     }*/
}