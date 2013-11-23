/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.CarritoDAO;
import clickandbuy.upc.edu.core.entity.Carrito;
import clickandbuy.upc.edu.core.impl.CarritoImpl;
import java.util.List;

/**
 *
 * @author Garyfimo
 */
public class CarritoBusiness {

    private CarritoDAO carritodao = new CarritoImpl();

    public void addCarrito(Carrito carrito) throws Exception {
        carritodao.addCarrito(carrito);
    }

    public Carrito getCarrito(Integer car_codigo) throws Exception {
        return carritodao.getCarrito(car_codigo);
    }

    public void deleteCarrito(Carrito carrito) throws Exception {
        carritodao.deleteCarrito(carrito);
    }

    public List<Carrito> listCarrito() throws Exception {
        return carritodao.listCarrito();

    }
}
