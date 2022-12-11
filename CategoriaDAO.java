package trabalholp2;

/**
 *
 * @author mateusseiboth
 */

import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO implements DAO<Categoria> {
    private ArrayList<Categoria> categorias = new ArrayList<Categoria>();

    public CategoriaDAO() {
        categorias.add(new Categoria("Municipal"));
        categorias.add(new Categoria("Estadual"));
        categorias.add(new Categoria("Federal"));
        categorias.add(new Categoria("DAS"));
        categorias.add(new Categoria("MEI"));
        categorias.add(new Categoria("CEFIP"));
    }

    @Override
    public void add(Categoria categoria) {
        categorias.add(categoria);
    }

    @Override
    public Categoria get(int indice) {
        if ((categorias.size() > indice) && (indice > -1)) {
            return categorias.get(indice);
        }
        return null;
    }

    @Override
    public List<Categoria> getAll() {
        return categorias;
    }

    @Override
    public void delete(Categoria categoria) {
        int indice = categorias.indexOf(categoria);
        if (indice != -1) {
            categorias.remove(indice);
        }
    }

    @Override
    public void update(Categoria categoria) {
        int indice = categorias.indexOf(categoria);
        if (indice != -1) {
            categorias.set(indice, categoria);
        }
    }

    @Override
    public int size() {
        return categorias.size();
    }

}
