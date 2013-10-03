/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.UsuarioDAO;
import clickandbuy.upc.edu.core.entity.Usuario;
import clickandbuy.upc.edu.core.impl.UsuarioImpl;

/**
 *
 * @author Garyfimo
 */
public class UsuarioBusiness {
    
    private UsuarioDAO usuariodao = new UsuarioImpl();
    private RolBusiness rolBusiness;
    private Usuario usuario;
    
    public boolean addUsuario(Usuario usuario) throws Exception
    {
       if(!existeUsuario(usuario.getUsuNombreusuario())) 
        if(usuariodao.addUsuario(usuario))
            return true;
        
        return false;
    }
    
    public Usuario getUsuarioByUserName(String usu_nickname) throws Exception
    {
        return usuariodao.getUsuario(usu_nickname);
    }
    
    public boolean existeUsuario(String userNickname) throws Exception
    {
        Boolean existe = false;
        
        usuario = usuariodao.getUsuario(userNickname);
        if(usuario != null)
            existe = true;
        
        return existe;
    }
    
    public Boolean autenticarUsuario(String userNickname, String userPassword) throws Exception
    {
        Boolean resultado = false;
        
        usuario = usuariodao.getUsuario(userNickname);
        if(usuario != null)
            if(usuario.getUsuContrasenia().equals(userPassword))
                resultado = true;
        
        return resultado;
    }
    
    
    public Boolean deleteUsuario(Usuario usuario) throws Exception
    {
        if(usuariodao.deleteUsuario(usuario))
            return true;
        
        return false;
        
    }
}
