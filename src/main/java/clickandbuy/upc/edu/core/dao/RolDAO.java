/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.dao;

import clickandbuy.upc.edu.core.entity.Rol;

/**
 *
 * @author Garyfimo
 */
public interface RolDAO {
    
    public Rol getRolName(Integer rol_codigo) throws Exception;
    public void addRol(Rol rol) throws Exception;
    
}
