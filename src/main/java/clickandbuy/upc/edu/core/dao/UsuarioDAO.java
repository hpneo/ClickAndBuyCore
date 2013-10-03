/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.dao;

import clickandbuy.upc.edu.core.entity.Usuario;

/**
 *
 * @author Garyfimo
 */
public interface UsuarioDAO {
 
    public boolean addUsuario(Usuario usuario) throws Exception;
    public Usuario getUsuario(String usu_nickname) throws Exception;
    public boolean deleteUsuario(Usuario usuario) throws Exception;
    
}
