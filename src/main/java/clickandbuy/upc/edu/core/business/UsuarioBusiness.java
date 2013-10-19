/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.UsuarioDAO;
import clickandbuy.upc.edu.core.entity.Usuario;
import clickandbuy.upc.edu.core.impl.UsuarioImpl;
import java.util.List;

/**
 *
 * @author Garyfimo
 */
public class UsuarioBusiness {
    
    private UsuarioDAO usuarioDao = new UsuarioImpl();
    private RolBusiness rolBusiness;
    private Usuario usuario;
    
    public boolean addUsuario(Usuario usuario) throws Exception
    {
       if(!existeUsuario(usuario.getUsuNombreusuario())) 
        if(usuarioDao.addUsuario(usuario))
        {
            System.out.println("Crea usuario");
            return true;
        }
       System.out.println("No crea usuario");
        return false;
    }
    
    public Usuario getUsuarioByUserName(String usu_nickname) throws Exception
    {
        return usuarioDao.getUsuario(usu_nickname);
    }
    
     public Usuario getUsuarioByCode(Integer usu_codigo) throws Exception
    {
        return usuarioDao.getUsuarioByCode(usu_codigo);
    }
    
    public boolean existeUsuario(String userNickname) throws Exception
    {
        Boolean existe = false;
        
        usuario = usuarioDao.getUsuario(userNickname);
        if(usuario != null) {
	  existe = true;
	}
        
        return existe;
    }
    
    public boolean autenticarUsuario(String userNickname, String userPassword) throws Exception
    {
        boolean resultado = false;
        usuario = usuarioDao.getUsuario(userNickname);
	
        if(usuario != null) {
	  if(usuario.getUsuContrasenia().equals(userPassword)) {
	    resultado = true;
	  }
	}
        
        return resultado;
    }
    
    
    public boolean deleteUsuario(String userNickname) throws Exception
    {
        Usuario usuarioBorrar = usuarioDao.getUsuario(userNickname);
        
        return usuarioDao.deleteUsuario(usuarioBorrar);
            
    }
    public List<Usuario> listUsuarioxRol(Integer usu_codigorol) throws Exception
    {
        return usuarioDao.listUsuarioxRol(usu_codigorol);
    }
    
    public List<Usuario> listUsuario() throws Exception
    {
        return usuarioDao.listUsuario();
    }
}
