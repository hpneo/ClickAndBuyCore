/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.dao;

import clickandbuy.upc.edu.core.entity.Usuario;
import clickandbuy.upc.edu.core.exception.UsuarioException;
import java.util.List;

/**
 *
 * @author Garyfimo
 */
public interface UsuarioDAO {

    public void addUsuario(Usuario usuario) throws UsuarioException;


    public Usuario findUsuariobyUsername(String usuNombreusuario) throws UsuarioException;

    public Usuario findUsuariobyCode(Integer usuNombreusuario) throws UsuarioException;

    public void updateUsuario(Usuario usuario) throws UsuarioException;

    public boolean deleteUsuario(Usuario usuario) throws UsuarioException;

    public List<Usuario> findUsuariobyRol(Integer usuCodigorol) throws UsuarioException;

    public List<Usuario> findUsuario() throws UsuarioException;
}
