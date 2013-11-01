/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.RolDao;
import clickandbuy.upc.edu.core.entity.Rol;
import clickandbuy.upc.edu.core.impl.RolDaoImpl;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Garyfimo
 */
public class RolBusiness {

    private RolDao roldao = new RolDaoImpl();

    public Rol getRolNameByCode(Integer rol_codigo) throws Exception 
    {
        return roldao.findRolbyCode(rol_codigo);
    }

    public List<Rol> listRoles() throws Exception
    {
        return roldao.findRol();
    }
    public void updateRol(Rol rol) throws Exception 
    {
        roldao.updateRol(rol);
    }

    public void deleteRol(Rol rol) throws Exception 
    {
        roldao.updateRol(rol);
    }

    public Rol findRolbyNombreusuario(String rol_nombre) throws Exception 
    {
        return roldao.findRolbyName(rol_nombre);
    }

    public void addRol(Rol rol) throws Exception 
    {
        if(!existeRol(rol.getRolNombre()))
            roldao.addRol(rol);
    }
    public boolean existeRol(String rol_nombre) throws Exception
    {
       boolean existe;
       if(findRolbyNombreusuario(rol_nombre)==null)
           existe = false;
       else
           existe= true;
       
       return existe;
    }
}
