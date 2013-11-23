/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.edu.upc.core.test.business;

import clickandbuy.upc.edu.core.business.RolBusiness;
import clickandbuy.upc.edu.core.entity.Rol;
import clickandbuy.upc.edu.core.entity.Usuario;
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

    @Test
    public void testAGetRollByUserName() throws Exception {
        System.out.println("getRoll");
        int usu_roll = 10;
        RolBusiness rol = new RolBusiness();

        assertNotNull(rol.getRolNameByCode(usu_roll));

    }

    @Test
    public void testBExisterol() throws Exception {
        System.out.println("existerol");

        Integer usu = 5;
        RolBusiness rol = new RolBusiness();
        // assertTrue(rol.getRolNameByCode(usu));

    }
}
