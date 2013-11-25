/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.edu.upc.core.test.business;

import clickandbuy.upc.edu.core.business.RolBusiness;
import clickandbuy.upc.edu.core.entity.Rol;
import junit.framework.TestCase;
import static junit.framework.TestCase.assertEquals;

/**
 *
 * @author carlos
 */
public class RollBusinessTest extends TestCase {

    public RollBusinessTest(String testName) {
        super(testName);
    }
   
    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
    
    public void testBExisterol() throws Exception {

    Integer codigo = 2;
    String nomRol = "PROGRAMADOR";
    RolBusiness instance = new RolBusiness();
    Rol rol = instance.getRolNameByCode(codigo);
    assertEquals(rol.getRolNombre(), nomRol);
    }
}
