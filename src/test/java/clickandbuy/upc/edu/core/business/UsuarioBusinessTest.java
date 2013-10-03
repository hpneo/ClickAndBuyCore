/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.entity.Rol;
import clickandbuy.upc.edu.core.entity.Usuario;
import junit.framework.TestCase;

/**
 *
 * @author Garyfimo
 */
public class UsuarioBusinessTest extends TestCase {
    
    public UsuarioBusinessTest(String testName) {
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

    /**
     * Test of addUsuario method, of class UsuarioBusiness.
     */
    public void testAddUsuario() throws Exception {
        System.out.println("addUsuario");
        Usuario usuario = new Usuario();
        UsuarioBusiness usuarioBusiness = new UsuarioBusiness();
        usuario.setUsuContrasenia("123456");
        usuario.setUsuNombreusuario("piero9212");
        Rol rol = new Rol();
        rol.setRolCodigo(00007);
        rol.setRolNombre("GERENTE");
        usuario.setRol(rol);
        assertEquals(usuarioBusiness.addUsuario(usuario),true);
    }

    /**
     * Test of getUsuarioByCode method, of class UsuarioBusiness.
     */
    public void testGetUsuarioByUserName() throws Exception {
        System.out.println("getUsuarioByCode");
        String usu_nickname = "garyfimo";
        UsuarioBusiness usuarioBusiness = new UsuarioBusiness();
        Usuario expResult = new Usuario();
        expResult.setUsuCodigo(00005);
        expResult.setUsuContrasenia("123456");
        expResult.setUsuNombreusuario("garyfimo");
        Rol rol = new Rol();
        rol.setRolCodigo(00007);
        rol.setRolNombre("ADMINISTRADOR");
        expResult.setRol(rol);
        Usuario result = usuarioBusiness.getUsuarioByUserName(usu_nickname);
        assertEquals(expResult, result);

        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of existeUsuario method, of class UsuarioBusiness.
     */
    public void testExisteUsuario() throws Exception {
        System.out.println("existeUsuario");
        String userNickname = "";
        UsuarioBusiness instance = new UsuarioBusiness();
        Boolean expResult = null;
        Boolean result = instance.existeUsuario(userNickname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of autenticarUsuario method, of class UsuarioBusiness.
     */
    public void testAutenticarUsuario() throws Exception {
        System.out.println("autenticarUsuario");
        String userNickname = "";
        String userPassword = "";
        UsuarioBusiness instance = new UsuarioBusiness();
        Boolean expResult = null;
        Boolean result = instance.autenticarUsuario(userNickname, userPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deleteUsuario method, of class UsuarioBusiness.
     */
    public void testDeleteUsuario() throws Exception {
        System.out.println("deleteUsuario");
        Usuario usuario = null;
        UsuarioBusiness instance = new UsuarioBusiness();
        instance.deleteUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
