/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.CategoriaDAO;
import clickandbuy.upc.edu.core.entity.Categoria;
import clickandbuy.upc.edu.core.impl.CategoriaImpl;
import java.util.List;

/**
 *
 * @author Garyfimo
 */
public class CategoriaBusiness {

    private CategoriaDAO categoriadao = new CategoriaImpl();

    public void addCategoria(Categoria categoria) throws Exception {
        categoriadao.addCategoria(categoria);
    }

    public Categoria getCategoriaByCode(Integer cat_codigo) throws Exception {
        return categoriadao.getCategoria(cat_codigo);
    }

    public List<Categoria> listCategoria() throws Exception {
        return categoriadao.listCategoria();
    }
}
