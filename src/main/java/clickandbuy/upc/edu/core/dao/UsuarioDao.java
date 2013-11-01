/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.dao;

import clickandbuy.upc.edu.core.entity.Usuario;
import java.util.List;

/**
 *
 * @author Garyfimo
 */
public interface UsuarioDao {
 
    public void addUsuario(Usuario usuario) throws Exception;
    public Usuario findUsuariobyUsername(String usu_nombreusuario) throws Exception;
    public Usuario findUsuariobyCode(Integer usu_nombreusuario) throws Exception;
    public void updateUsuario(Usuario usuario) throws Exception;
    public boolean deleteUsuario(Usuario usuario) throws Exception;
    public List<Usuario> findUsuariobyRol(Integer usu_codigorol) throws Exception;
    public List<Usuario> findUsuario() throws Exception;
}
