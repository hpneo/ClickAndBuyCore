/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.entity.Rol;
import clickandbuy.upc.edu.core.entity.Usuario;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

/**
 *
 * @author Garyfimo
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class UsuarioBusinessTest {

    public UsuarioBusinessTest() {
    }

    @Test
    public void testAGetUsuarioByUserName() throws Exception {
        System.out.println("getUsuarioByUserName");
        String usu_nickname = "garyfimo";
        UsuarioBusiness usuarioBusiness = new UsuarioBusiness();

        assertNotNull(usuarioBusiness.getUsuarioByUserName(usu_nickname));

    }

    @Test
    public void testBExisteUsuario() throws Exception {
        System.out.println("existeUsuario");
        String userNickname = "garyfimo";
        UsuarioBusiness usuarioBusiness = new UsuarioBusiness();

        assertTrue(usuarioBusiness.existeUsuario(userNickname));

    }

    @Test
    public void testCAutenticarUsuario() throws Exception {
        System.out.println("autenticarUsuario");
        String userNickname = "garyfimo";
        String userPassword = "123456";
        UsuarioBusiness usuarioBusiness = new UsuarioBusiness();

        assertTrue(usuarioBusiness.autenticarUsuario(userNickname, userPassword));

    }

    @Test
    public void testDDeleteUsuario() throws Exception {
        System.out.println("deleteUsuario");
        String usuarioNickname = "garyfimo";
        UsuarioBusiness usuarioBusiness = new UsuarioBusiness();
        assertTrue(usuarioBusiness.deleteUsuario(usuarioNickname));
    }

    @Test
    public void testEAddUsuario() throws Exception {
        System.out.println("addUsuario");
        Usuario usuario = new Usuario();
        UsuarioBusiness usuarioBusiness = new UsuarioBusiness();
        usuario.setUsuContrasenia("123456");
        usuario.setUsuNombreusuario("garyfimo");
        Rol rol = new Rol();
        rol.setRolCodigo(00001);
        rol.setRolNombre("ADMINISTRADOR");
        usuario.setRol(rol);
        assertTrue(usuarioBusiness.addUsuario(usuario));
    }
}