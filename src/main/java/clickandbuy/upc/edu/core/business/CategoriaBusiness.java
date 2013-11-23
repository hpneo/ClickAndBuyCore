package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.CategoriaDAO;
import clickandbuy.upc.edu.core.entity.Categoria;
import clickandbuy.upc.edu.core.impl.CategoriaImpl;
import java.util.List;

public class CategoriaBusiness {

    private CategoriaDAO categoriadao = new CategoriaImpl();

    public void addCategoria(Categoria categoria) throws Exception {
        categoriadao.addCategoria(categoria);
    }

    public Categoria getCategoriaByCode(Integer cat_codigo) throws Exception {
        return categoriadao.getCategoria(cat_codigo);
    }

    public Categoria getCategoriaXNombre(String nombre) throws Exception {
        return categoriadao.getCategoriaXNombre(nombre);
    }

    public List<Categoria> listCategoria() throws Exception {
        return categoriadao.listCategoria();
    }
}
