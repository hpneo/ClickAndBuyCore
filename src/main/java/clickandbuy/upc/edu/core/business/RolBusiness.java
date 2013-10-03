/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.RolDAO;
import clickandbuy.upc.edu.core.entity.Rol;
import clickandbuy.upc.edu.core.impl.RolImpl;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Garyfimo
 */
public class RolBusiness {
    private RolDAO roldao = new RolImpl();
    
    public Rol getRolNameByCode(Integer rol_codigo) throws Exception
    {
        try {
            return roldao.getRolName(rol_codigo);
        } catch (Exception ex) {
            throw ex;
        }
    }
    
    public void addRol(Rol rol) throws Exception
    {
        try{
            
        roldao.addRol(rol);
               } catch (Exception ex) {
            throw ex;
        }  
    }
}
