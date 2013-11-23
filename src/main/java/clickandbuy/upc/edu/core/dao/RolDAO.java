/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.dao;

import clickandbuy.upc.edu.core.entity.Rol;
import clickandbuy.upc.edu.core.exception.RolException;
import java.util.List;

/**
 *
 * @author Garyfimo
 */
public interface RolDAO {

    public void addRol(Rol rol) throws RolException;

    public void updateRol(Rol rol) throws RolException;

    public void deleteRol(Rol rol) throws RolException;

    public Rol findRolbyName(String rolCodigo) throws RolException;

    public Rol findRolbyCode(Integer rolCodigo) throws RolException;

    public List<Rol> findRol() throws RolException;
}
