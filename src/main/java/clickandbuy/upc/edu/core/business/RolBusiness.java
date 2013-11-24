/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.RolDAO;
import clickandbuy.upc.edu.core.entity.Rol;
import clickandbuy.upc.edu.core.exception.RolException;
import clickandbuy.upc.edu.core.impl.RolDaoImpl;
import java.util.List;

/**
 *
 * @author Garyfimo
 */
public class RolBusiness {

    private RolDAO roldao = new RolDaoImpl();

    public Rol getRolNameByCode(Integer rolCodigo) throws RolException {
        return roldao.findRolbyCode(rolCodigo);
    }

    public List<Rol> listRoles() throws RolException {
        return roldao.findRol();
    }

    public void updateRol(Rol rol) throws RolException {
        roldao.updateRol(rol);
    }

    public void deleteRol(Rol rol) throws RolException {
        roldao.updateRol(rol);
    }

    public Rol findRolbyNombreusuario(String rolNombre) throws RolException {
        return roldao.findRolbyName(rolNombre);
    }

    public void addRol(Rol rol) throws RolException {
        if (!existeRol(rol.getRolNombre())) {
            roldao.addRol(rol);
        }
    }

    public boolean existeRol(String rolNombre) throws RolException {
        boolean existe;
        if (findRolbyNombreusuario(rolNombre) == null) {
            existe = false;
        } else {
            existe = true;
        }

        return existe;
    }
}
