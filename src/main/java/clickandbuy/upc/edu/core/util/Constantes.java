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

    public static String getERRORCONEXION() {
        return ERRORCONEXION;
    }

    public static String getERRORID() {
        return ERRORID;
    }

    public static String getERRORQUERY() {
        return ERRORQUERY;
    }

    public static String getERRORMAPEO() {
        return ERRORMAPEO;
    }

    public static String getERRORHIBERNATE() {
        return ERRORHIBERNATE;
    }

    public static int getCARACTERESNOMBREUSUARIO() {
        return CARACTERESNOMBREUSUARIO;
    }

    public static int getCARACTERESCLIENTE() {
        return CARACTERESCLIENTE;
    }

    public static int getCARACTERESCONTRASENA() {
        return CARACTERESCONTRASENA;
    }

    public static String getCODIGO() {
        return CODIGO;
    }

    public static String getSELECTFROMPEDIDOWHERE() {
        return SELECTFROMPEDIDOWHERE;
    }

    private static final String ERRORCONEXION = "No se pudo establecer conexión con la base de datos.";
    private static final String ERRORID = "Error al generar ID en la base de datos";
    private static final String ERRORQUERY = "Query inválido.";
    private static final String ERRORMAPEO = "Entidad desconocida.";
    private static final String ERRORHIBERNATE = "Error con la base de datos (Hibernate 3.0.5).";
    private static final int CARACTERESNOMBREUSUARIO = 15;
    private static final int CARACTERESCLIENTE = 15;
    private static final int CARACTERESCONTRASENA = 8;
    private static final String CODIGO = "codigo";
    private static final String SELECTFROMPEDIDOWHERE = "select c from Pedido c where pedtipo=:tipo";
}
