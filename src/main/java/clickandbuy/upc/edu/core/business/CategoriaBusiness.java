package clickandbuy.upc.edu.core.business;

import clickandbuy.upc.edu.core.dao.CategoriaDAO;
import clickandbuy.upc.edu.core.entity.Categoria;
import clickandbuy.upc.edu.core.exception.CategoriaException;
import clickandbuy.upc.edu.core.impl.CategoriaImpl;
import java.util.List;

public class CategoriaBusiness {

    private CategoriaDAO categoriadao = new CategoriaImpl();

    public void addCategoria(Categoria categoria) throws CategoriaException {
        categoriadao.addCategoria(categoria);
    }

    public Categoria getCategoriaByCode(Integer catCodigo) throws CategoriaException {
        return categoriadao.getCategoria(catCodigo);
    }

    public Categoria getCategoriaXNombre(String nombre) throws CategoriaException {
        return categoriadao.getCategoriaXNombre(nombre);
    }

    public List<Categoria> listCategoria() throws CategoriaException {
        return categoriadao.listCategoria();
    }
}
