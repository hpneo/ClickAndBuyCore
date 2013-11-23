package clickandbuy.upc.edu.core.dao;

import clickandbuy.upc.edu.core.entity.Categoria;
import clickandbuy.upc.edu.core.exception.CategoriaException;
import java.util.List;

public interface CategoriaDAO {

    public void addCategoria(Categoria categoria) throws CategoriaException;

    public Categoria getCategoria(Integer catCodigo) throws CategoriaException;

    public Categoria getCategoriaXNombre(String nombre) throws CategoriaException;

    public List<Categoria> listCategoria() throws CategoriaException;
}
