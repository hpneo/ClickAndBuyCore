package clickandbuy.upc.edu.core.entity;
// Generated Sep 27, 2013 3:28:11 PM by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * Rol generated by hbm2java
 */
public class Rol  implements java.io.Serializable {


     private Integer rolCodigo;
     private String rolNombre;
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);

    public Rol() {
    }

	
    public Rol(String rolNombre) {
        this.rolNombre = rolNombre;
    }
    public Rol(String rolNombre, Set usuarios) {
       this.rolNombre = rolNombre;
       this.usuarios = usuarios;
    }
   
    public Integer getRolCodigo() {
        return this.rolCodigo;
    }
    
    public void setRolCodigo(Integer rolCodigo) {
        this.rolCodigo = rolCodigo;
    }
    public String getRolNombre() {
        return this.rolNombre;
    }
    
    public void setRolNombre(String rolNombre) {
        this.rolNombre = rolNombre;
    }
    public Set getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set usuarios) {
        this.usuarios = usuarios;
    }




}


