package clickandbuy.upc.edu.core.entity;
// Generated Oct 16, 2013 8:23:13 PM by Hibernate Tools 3.2.1.GA

import java.math.BigDecimal;

/**
 * Productoxpedido generated by hbm2java
 */
public class Productoxpedido implements java.io.Serializable {

    private ProductoxpedidoId id;
    private Pedido pedido;
    private Producto producto;
    private int propedCantidad;
    private BigDecimal propedPreciototal;

    public Productoxpedido() {
    }

    public Productoxpedido(ProductoxpedidoId id, Pedido pedido, Producto producto, int propedCantidad, BigDecimal propedPreciototal) {
        this.id = id;
        this.pedido = pedido;
        this.producto = producto;
        this.propedCantidad = propedCantidad;
        this.propedPreciototal = propedPreciototal;
    }

    public ProductoxpedidoId getId() {
        return this.id;
    }

    public void setId(ProductoxpedidoId id) {
        this.id = id;
    }

    public Pedido getPedido() {
        return this.pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public Producto getProducto() {
        return this.producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public int getPropedCantidad() {
        return this.propedCantidad;
    }

    public void setPropedCantidad(int propedCantidad) {
        this.propedCantidad = propedCantidad;
    }

    public BigDecimal getPropedPreciototal() {
        return this.propedPreciototal;
    }

    public void setPropedPreciototal(BigDecimal propedPreciototal) {
        this.propedPreciototal = propedPreciototal;
    }
}