/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.dao;

import clickandbuy.upc.edu.core.entity.Rol;
import java.util.List;

/**
 *
 * @author Garyfimo
 */
public interface RolDAO {

    public void addRol(Rol rol) throws Exception;

    public void updateRol(Rol rol) throws Exception;

    public void deleteRol(Rol rol) throws Exception;

    public Rol findRolbyName(String rolCodigo) throws Exception;

    public Rol findRolbyCode(Integer rolCodigo) throws Exception;

    public List<Rol> findRol() throws Exception;
}
