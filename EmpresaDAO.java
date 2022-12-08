package trabalholp2;

import java.util.ArrayList;
import java.util.List;

public class EmpresaDAO implements DAO<Empresa> {
  private ArrayList<Empresa> empresas = new ArrayList<Empresa>();  

    public EmpresaDAO() {
        CategoriaDAO categoriaDAO = new CategoriaDAO();
        UsuarioDAO userDAO = new UsuarioDAO();
        
        List<Categoria>categorias = categoriaDAO.getAll();
        List<Usuario> usuarios = userDAO.getAll();
        
        empresas.add(new Empresa("Flávio ", categorias.get(0), usuarios.get(0)));
        empresas.add(new Empresa("Benedito", categorias.get(1), usuarios.get(1)));
        empresas.add(new Empresa("LoRayne ", categorias.get(2), usuarios.get(2)));
        empresas.add(new Empresa("Mateus ", categorias.get(3), usuarios.get(3)));
        empresas.add(new Empresa(" Rapha ", categorias.get(4), usuarios.get(4)));
        empresas.add(new Empresa("Maria ", categorias.get(5), usuarios.get(5)));
    }
  
  
  
  public void add(Empresa empresa) {
      empresas.add(empresa);
  }   
  
  public Empresa get(int indice) {
      if (indice >=0 && indice<empresas.size()) {
          return empresas.get(indice);
      }
      return null;
  }
  
  public void delete(Empresa empresa) {
      int indice = empresas.indexOf(empresa);
      if (indice != -1) {
          empresas.remove(indice);
      }
  }
  
  public void update(Empresa empresa) {
      int indice = empresas.indexOf(empresa);
      if (indice != -1) {
          empresas.set(indice, empresa);
      }
  }
  
  public int size() {
      return empresas.size();
  }

  @Override
  public List<Empresa> getAll() {
      return empresas;
  }
  
  
}
