/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.edu.upc.core.test.business;

import clickandbuy.upc.edu.core.business.RolBusiness;
import clickandbuy.upc.edu.core.entity.Rol;
import clickandbuy.upc.edu.core.entity.Usuario;
import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 *
 * @author carlos
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RollBusinessTest {

    public RollBusinessTest() {
    }

   
    public void testBExisterol() throws Exception {
        System.out.println("existerol");

        Integer usu = 2;
        RolBusiness rol = new RolBusiness();
        assertEquals(rol.getRolNameByCode(usu),"PROGRAMADOR");

    }
}
