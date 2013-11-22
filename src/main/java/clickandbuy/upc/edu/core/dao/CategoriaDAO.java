package clickandbuy.upc.edu.core.dao;

import clickandbuy.upc.edu.core.entity.Categoria;
import java.util.List;

public interface CategoriaDAO {

    public void addCategoria(Categoria categoria) throws Exception;

    public Categoria getCategoria(Integer cat_codigo) throws Exception;
    
    public Categoria getCategoriaXNombre(String nombre) throws Exception;
    
    public List<Categoria> listCategoria() throws Exception;
}
