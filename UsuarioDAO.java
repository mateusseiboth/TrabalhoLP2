package trabalholp2;

import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO implements DAO<Usuario> {
    
    private ArrayList<Usuario> users = new
            ArrayList<Usuario>();

    public UsuarioDAO() {
        users.add(new Usuario("Flavão", "12345"));
        users.add(new Usuario("Lorayne", "12345"));
        users.add(new Usuario("Benegripe", "12345"));
        users.add(new Usuario("Mateus", "12345"));
        users.add(new Usuario("Gael", "12345"));
        users.add(new Usuario("Marcos", "12345"));
    }
    
    
    
    @Override
    public void add(Usuario user) {
      users.add(user);
    }

    @Override
    public Usuario get(int indice) {
        if ((users.size()>indice) && (indice>-1)){
            return users.get(indice);
        }
        return null;
    }

    @Override
    public List<Usuario> getAll() {
        return users;
    }

    @Override
    public void delete(Usuario user) {
      int indice = users.indexOf(user);
      if (indice != -1) {
          users.remove(indice);
      }
    }

    @Override
    public void update(Usuario user) {
      int indice = users.indexOf(user);
      if (indice != -1) {
          users.set(indice, user);
      }
    }

    @Override
    public int size() {
        return users.size();
    }
    
}
