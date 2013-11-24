/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.UsuarioDAO;
import clickandbuy.upc.edu.core.entity.Usuario;
import clickandbuy.upc.edu.core.exception.UsuarioException;
import clickandbuy.upc.edu.core.impl.UsuarioDaoImpl;
import java.util.List;
import org.apache.log4j.Logger;

/**
 *
 * @author Garyfimo
 */
public class UsuarioBusiness {

    Logger log = Logger.getLogger("UsuarioBusiness");
    private UsuarioDAO usuarioDao = new UsuarioDaoImpl();
    private RolBusiness rolBusiness;
    private Usuario usuario;

    public boolean addUsuario(Usuario usuario) throws UsuarioException {
        if (!existeUsuario(usuario.getUsuNombreusuario())) {
            usuarioDao.addUsuario(usuario);
            log.info("Crea usuario");
            return true;
        } else {
            log.info("No crea usuario");
            return false;
        }
    }

    public Usuario getUsuarioByUserName(String usuNickname) throws UsuarioException {
        log.info("Retorna usuario por nombre");
        return usuarioDao.findUsuariobyUsername(usuNickname);
    }

    public Usuario getUsuarioByCode(Integer usuCodigo) throws UsuarioException {
        log.info("Retorna usuario por codigo");
        return usuarioDao.findUsuariobyCode(usuCodigo);
    }

    public boolean deleteUsuario(String userNickname) throws UsuarioException {
        Usuario usuarioBorrar = usuarioDao.findUsuariobyUsername(userNickname);
        log.info("Borra usuario");
        return usuarioDao.deleteUsuario(usuarioBorrar);

    }

    public void updateUsuario(Usuario usu) throws UsuarioException {
        log.info("Actualiza usuario");
        usuarioDao.updateUsuario(usu);

    }

    public List<Usuario> listUsuarioxRol(Integer usuCodigorol) throws UsuarioException {
        log.info("Lista usuario por rol");
        return usuarioDao.findUsuariobyRol(usuCodigorol);
    }

    public List<Usuario> listUsuario() throws UsuarioException {
        log.info("Lista usuario");
        return usuarioDao.findUsuario();
    }

    public boolean existeUsuario(String userNickname) throws UsuarioException {
        Boolean existe = false;

        usuario = usuarioDao.findUsuariobyUsername(userNickname);
        if (usuario != null) {
            log.info("Existe usuario");
            existe = true;
        }

        return existe;
    }

    public boolean autenticarUsuario(String userNickname, String userPassword) throws UsuarioException {
        boolean resultado = false;
        usuario = usuarioDao.findUsuariobyUsername(userNickname);

        if (usuario != null) {
            if (usuario.getUsuContrasenia().equals(userPassword)) {
                log.info("Contraseña correcta");
                resultado = true;
            }
        }

        return resultado;
    }

    public Usuario iniciarSesion(String userNickname) throws UsuarioException {
        usuario = usuarioDao.findUsuariobyUsername(userNickname);
        log.info("Inicia sesion");
        return usuario;
    }
}
