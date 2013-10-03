/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.util;

import clickandbuy.upc.edu.core.business.RolBusiness;
import clickandbuy.upc.edu.core.business.UsuarioBusiness;
import clickandbuy.upc.edu.core.entity.Rol;
import clickandbuy.upc.edu.core.entity.Usuario;

/**
 *
 * @author Garyfimo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
        UsuarioBusiness usuarioBusiness = new UsuarioBusiness();
        Usuario u = new Usuario();
        u.setUsuNombreusuario("garyfimo");
        u.setUsuContrasenia("123456");
        Rol rol = new Rol();
        rol.setRolCodigo(00007);
        rol.setRolNombre("GERENTE");
        u.setRol(rol);
        
        System.out.println("UPC ===> Crea Usuario");
        usuarioBusiness.addUsuario(u);
        }catch(Exception ex)
        {
            ex.printStackTrace();
        }
        
    }
}
