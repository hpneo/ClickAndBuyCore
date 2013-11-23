/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.dao;

import clickandbuy.upc.edu.core.entity.Carrito;
import java.util.List;

/**
 *
 * @author Garyfimo
 */
public interface CarritoDAO {

    public void addCarrito(Carrito carrito) throws Exception;

    public Carrito getCarrito(Integer car_codigo) throws Exception;

    public void deleteCarrito(Carrito carrito) throws Exception;

    public List<Carrito> listCarrito() throws Exception;
}
