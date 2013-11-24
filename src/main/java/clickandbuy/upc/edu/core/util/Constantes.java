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

    private Constantes() {
    }

    public static String getERROR_CONEXION() {
        return ERROR_CONEXION;
    }

    public static String getERROR_ID() {
        return ERROR_ID;
    }

    public static String getERROR_QUERY() {
        return ERROR_QUERY;
    }

    public static String getERROR_MAPEO() {
        return ERROR_MAPEO;
    }

    public static String getERROR_HIBERNATE() {
        return ERROR_HIBERNATE;
    }

    public static int getCARACTERES_NOMBREUSUARIO() {
        return CARACTERES_NOMBREUSUARIO;
    }

    public static int getCARACTERES_CLIENTE() {
        return CARACTERES_CLIENTE;
    }

    public static int getCARACTERES_CONTRASENA() {
        return CARACTERES_CONTRASENA;
    }

    public static String getCODIGO() {
        return CODIGO;
    }

    public static String getSELECT_FROM_PEDIDO_WHERE() {
        return SELECT_FROM_PEDIDO_WHERE;
    }

    private static final String ERROR_CONEXION = "No se pudo establecer conexión con la base de datos.";
    private static final String ERROR_ID = "Error al generar ID en la base de datos";
    private static final String ERROR_QUERY = "Query inválido.";
    private static final String ERROR_MAPEO = "Entidad desconocida.";
    private static final String ERROR_HIBERNATE = "Error con la base de datos (Hibernate 3.0.5).";
    private static final int CARACTERES_NOMBREUSUARIO = 15;
    private static final int CARACTERES_CLIENTE = 15;
    private static final int CARACTERES_CONTRASENA = 8;
    private static final String CODIGO = "codigo";
    private static final String SELECT_FROM_PEDIDO_WHERE = "select c from Pedido c where ped_tipo=:tipo";
}
