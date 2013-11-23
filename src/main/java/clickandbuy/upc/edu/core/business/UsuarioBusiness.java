/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.UsuarioDAO;
import clickandbuy.upc.edu.core.entity.Usuario;
import clickandbuy.upc.edu.core.impl.UsuarioDaoImpl;
import java.util.List;

/**
 *
 * @author Garyfimo
 */
public class UsuarioBusiness {

    private UsuarioDAO usuarioDao = new UsuarioDaoImpl();
    private RolBusiness rolBusiness;
    private Usuario usuario;

    public boolean addUsuario(Usuario usuario) throws Exception {
        if (!existeUsuario(usuario.getUsuNombreusuario())) {
            usuarioDao.addUsuario(usuario);
            System.out.println("Crea usuario");
            return true;
        } else {
            System.out.println("No crea usuario");
            return false;
        }
    }

    public Usuario getUsuarioByUserName(String usu_nickname) throws Exception {
        return usuarioDao.findUsuariobyUsername(usu_nickname);
    }

    public Usuario getUsuarioByCode(Integer usu_codigo) throws Exception {
        return usuarioDao.findUsuariobyCode(usu_codigo);
    }

    public boolean deleteUsuario(String userNickname) throws Exception {
        Usuario usuarioBorrar = usuarioDao.findUsuariobyUsername(userNickname);

        return usuarioDao.deleteUsuario(usuarioBorrar);

    }

    public void updateUsuario(Usuario usu) throws Exception {
        usuarioDao.updateUsuario(usu);

    }

    public List<Usuario> listUsuarioxRol(Integer usu_codigorol) throws Exception {
        return usuarioDao.findUsuariobyRol(usu_codigorol);
    }

    public List<Usuario> listUsuario() throws Exception {
        return usuarioDao.findUsuario();
    }

    public boolean existeUsuario(String userNickname) throws Exception {
        Boolean existe = false;

        usuario = usuarioDao.findUsuariobyUsername(userNickname);
        if (usuario != null) {
            existe = true;
        }

        return existe;
    }

    public boolean autenticarUsuario(String userNickname, String userPassword) throws Exception {
        boolean resultado = false;
        usuario = usuarioDao.findUsuariobyUsername(userNickname);

        if (usuario != null) {
            if (usuario.getUsuContrasenia().equals(userPassword)) {
                resultado = true;
            }
        }

        return resultado;
    }

    public Usuario iniciarSesion(String userNickname) throws Exception {
        usuario = usuarioDao.findUsuariobyUsername(userNickname);
        return usuario;
    }
}
