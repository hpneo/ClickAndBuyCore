package clickandbuy.edu.upc.core.test.business;

import clickandbuy.upc.edu.core.business.CategoriaBusiness;
import clickandbuy.upc.edu.core.entity.Categoria;
import junit.framework.TestCase;

/**
 *
 * @author cpuellesc
 */
public class CategoriaBusinessTest extends TestCase {

    public CategoriaBusinessTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    public void testExisteCategoria() throws Exception {
        System.out.println("Existe categoría");
        String nomCategoria = "ANIMALES";
        CategoriaBusiness instance = new CategoriaBusiness();
        Categoria categoria = instance.getCategoriaXNombre(nomCategoria);
        assertEquals(categoria.getCatNombre(), nomCategoria);
    }
}
