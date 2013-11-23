/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.RolDAO;
import clickandbuy.upc.edu.core.entity.Rol;
import clickandbuy.upc.edu.core.impl.RolDaoImpl;
import java.util.List;

/**
 *
 * @author Garyfimo
 */
public class RolBusiness {

    private RolDAO roldao = new RolDaoImpl();

    public Rol getRolNameByCode(Integer rolCodigo) throws Exception {
        return roldao.findRolbyCode(rolCodigo);
    }

    public List<Rol> listRoles() throws Exception {
        return roldao.findRol();
    }

    public void updateRol(Rol rol) throws Exception {
        roldao.updateRol(rol);
    }

    public void deleteRol(Rol rol) throws Exception {
        roldao.updateRol(rol);
    }

    public Rol findRolbyNombreusuario(String rolNombre) throws Exception {
        return roldao.findRolbyName(rolNombre);
    }

    public void addRol(Rol rol) throws Exception {
        if (!existeRol(rol.getRolNombre())) {
            roldao.addRol(rol);
        }
    }

    public boolean existeRol(String rolNombre) throws Exception {
        boolean existe;
        if (findRolbyNombreusuario(rolNombre) == null) {
            existe = false;
        } else {
            existe = true;
        }

        return existe;
    }
}
