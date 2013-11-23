/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.util;

import clickandbuy.upc.edu.core.business.RolBusiness;
import clickandbuy.upc.edu.core.business.UsuarioBusiness;

import clickandbuy.upc.edu.core.entity.Rol;
import clickandbuy.upc.edu.core.entity.Usuario;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Piero
 */
public class PruebaUsuario {

    public void prueba_agregarUsuario1() {
        UsuarioBusiness usuarioBusiness = new UsuarioBusiness();
        RolBusiness rolBusiness = new RolBusiness();
        System.out.println("paso2");

        try {
            Usuario usu = new Usuario();
            usu.setUsuNombreusuario("juanitoalimanaña");
            usu.setUsuContrasenia("juan");
            Rol rol = new Rol();
            rol.setRolNombre("ADMINISTRADOR");
            rolBusiness.addRol(rol);
            rol = rolBusiness.findRolbyNombreusuario("ADMINISTRADOR");
            usu.setRol(rol);
            System.out.println("Agrego Rol");
            usuarioBusiness.addUsuario(usu);
            System.out.println("Agrego Usuario");
        } catch (Exception ex) {
        }
        System.out.println("Done");
    }

    public void prueba_obtenerPorCodigoUsuario1() {
        UsuarioBusiness usuarioBusiness = new UsuarioBusiness();
        System.out.println("paso2");

        try {
            Usuario usu = usuarioBusiness.getUsuarioByCode(1);
            System.out.println(usu.getUsuNombreusuario());
            System.out.println(usu.getRol().getRolNombre());
        } catch (Exception ex) {
        }
        System.out.println("Done");
    }

    public void prueba_obtenerPorNombreUsuario1() {
        UsuarioBusiness usuarioBusiness = new UsuarioBusiness();
        System.out.println("paso2");

        try {
            Usuario usu = usuarioBusiness.getUsuarioByUserName("juanitoalimanaña");
            System.out.println(usu.getUsuCodigo());
            System.out.println(usu.getUsuContrasenia());
        } catch (Exception ex) {
        }
        System.out.println("Done");
    }

    public void prueba_actualizarUsuario1() {
        UsuarioBusiness usuarioBusiness = new UsuarioBusiness();
        RolBusiness rolBusiness = new RolBusiness();

        System.out.println("paso2");

        try {
            Usuario usu = new Usuario();
            usu.setUsuCodigo(1);
            usu.setUsuNombreusuario("JuancitoAlimaña");
            usu.setUsuContrasenia("123");
            Rol rol = new Rol();
            rol = rolBusiness.findRolbyNombreusuario("ADMINISTRADOR");
            usu.setRol(rol);
            usuarioBusiness.updateUsuario(usu);
        } catch (Exception ex) {
        }
        System.out.println("Done");
    }

    public void prueba_eliminarUsuario1() {
        UsuarioBusiness usuarioBusiness = new UsuarioBusiness();
        RolBusiness rolBusiness = new RolBusiness();
        System.out.println("paso2");

        try {
            Usuario usu = new Usuario();
            usu.setUsuCodigo(1);
            usu.setUsuNombreusuario("JuancitoAlimaña");
            usu.setUsuContrasenia("123");
            Rol rol = new Rol();
            rol = rolBusiness.findRolbyNombreusuario("ADMINISTRADOR");
            usu.setRol(rol);
            usuarioBusiness.deleteUsuario(usu.getUsuNombreusuario());
        } catch (Exception ex) {
        }
        System.out.println("Done");
    }

    public void prueba_listarUsuario1() {
        UsuarioBusiness usuarioBusiness = new UsuarioBusiness();
        System.out.println("paso2");

        try {
            List<Usuario> Listusu = usuarioBusiness.listUsuario();
            for (Iterator iterador = Listusu.listIterator(); iterador.hasNext();) {
                Usuario usuario = (Usuario) iterador.next();
                System.out.println(usuario.getUsuCodigo());
                System.out.println(usuario.getUsuNombreusuario());
                System.out.println(usuario.getRol().getRolNombre());
                System.out.println("-------------------------------------");

            }


        } catch (Exception ex) {
        }
        System.out.println("Done");
    }

    public void prueba_listarPorRolUsuario1() {
        UsuarioBusiness usuarioBusiness = new UsuarioBusiness();
        System.out.println("paso2");

        try {
            List<Usuario> Listusu = usuarioBusiness.listUsuarioxRol(1);
            for (Iterator iterador = Listusu.listIterator(); iterador.hasNext();) {
                Usuario usuario = (Usuario) iterador.next();
                System.out.println(usuario.getUsuCodigo());
                System.out.println(usuario.getUsuNombreusuario());
                System.out.println("-------------------------------------");

            }


        } catch (Exception ex) {
        }
        System.out.println("Done");
    }

    public static void main(String[] args) {
        UsuarioBusiness usuarioBusiness = new UsuarioBusiness();
        Usuario usuario = new Usuario();
        System.out.println("paso2");
        try {
            usuario.setUsuNombreusuario("maicena");
            usuario.setUsuContrasenia("dondon");
            if (usuarioBusiness.autenticarUsuario(usuario.getUsuNombreusuario(), usuario.getUsuContrasenia())) {
                usuario = usuarioBusiness.iniciarSesion(usuario.getUsuNombreusuario());

                System.out.println(usuario.getUsuCodigo());
            }
        } catch (Exception ex) {
            System.out.println("Se cayo otra vez");
        }
    }
}
