/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.util;

/**
 *
 * @author Piero
 */
public class Constantes {

    public static final String ERROR_CONEXION = "No se pudo establecer conexión con la base de datos.";
    public static final String ERROR_ID = "Error al generar ID en la base de datos";
    public static final String ERROR_QUERY = "Query inválido.";
    public static final String ERROR_MAPEO = "Entidad desconocida.";
    public static final String ERROR_HIBERNATE = "Error con la base de datos (Hibernate 3.0.5).";
    public static final int CARACTERES_NOMBREUSUARIO = 15;
    public static final int CARACTERES_CLIENTE = 15;
    public static final int CARACTERES_CONTRASENA = 8;
    
    public static final String CODIGO="codigo";
    
    public static final String SELECT_FROM_PEDIDO_WHERE="select c from Pedido c where ped_tipo=:tipo";
}
