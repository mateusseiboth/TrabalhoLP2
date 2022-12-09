package trabalholp2;

import java.util.List;

public interface DAO<T> {
    public void add(T t);

    public T get(int indice);

    public List<T> getAll();

    public void delete(T t);

    public void update(T t);

    public int size();
}
