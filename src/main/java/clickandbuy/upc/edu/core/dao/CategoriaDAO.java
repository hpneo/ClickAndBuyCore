/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.dao;

import clickandbuy.upc.edu.core.entity.Categoria;
import java.util.List;

/**
 *
 * @author Garyfimo
 */
public interface CategoriaDAO {

    public void addCategoria(Categoria categoria) throws Exception;

    public Categoria getCategoria(Integer cat_codigo) throws Exception;

    public List<Categoria> listCategoria() throws Exception;
}
