package clickandbuy.upc.edu.core.entity;
// Generated Sep 27, 2013 3:28:11 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Carrito generated by hbm2java
 */
public class Carrito  implements java.io.Serializable {


     private Integer carCodigo;
     private Producto producto;
     private int carCantidad;
     private double carPrecio;
     private Set historialcarritos = new HashSet(0);

    public Carrito() {
    }

	
    public Carrito(Producto producto, int carCantidad, double carPrecio) {
        this.producto = producto;
        this.carCantidad = carCantidad;
        this.carPrecio = carPrecio;
    }
    public Carrito(Producto producto, int carCantidad, double carPrecio, Set historialcarritos) {
       this.producto = producto;
       this.carCantidad = carCantidad;
       this.carPrecio = carPrecio;
       this.historialcarritos = historialcarritos;
    }
   
    public Integer getCarCodigo() {
        return this.carCodigo;
    }
    
    public void setCarCodigo(Integer carCodigo) {
        this.carCodigo = carCodigo;
    }
    public Producto getProducto() {
        return this.producto;
    }
    
    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    public int getCarCantidad() {
        return this.carCantidad;
    }
    
    public void setCarCantidad(int carCantidad) {
        this.carCantidad = carCantidad;
    }
    public double getCarPrecio() {
        return this.carPrecio;
    }
    
    public void setCarPrecio(double carPrecio) {
        this.carPrecio = carPrecio;
    }
    public Set getHistorialcarritos() {
        return this.historialcarritos;
    }
    
    public void setHistorialcarritos(Set historialcarritos) {
        this.historialcarritos = historialcarritos;
    }




}

