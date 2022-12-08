package trabalholp2;


public class Empresa {
  private static int nextCodigo = 1;
  private int codigo;
  private String descricao;
  private Categoria categoria;
  private double valor_unitario;
  private int estoque;
  public Usuario user;

  public Categoria getCategoria() {
    return categoria;
  }
  
  public Usuario getUsuario() {
    return user;
  }

    public Empresa(String descricao, Categoria categoria, Usuario user) {
        this.codigo = nextCodigo;
        nextCodigo++;
        this.descricao = descricao;
        this.categoria = categoria;
        this.valor_unitario = valor_unitario;
        this.estoque = estoque;
        this.user = user;
    }

    public Empresa(int codigo, String descricao, Categoria categoria, Usuario user) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.valor_unitario = valor_unitario;
        this.estoque = estoque;
    }

    
    
    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor_unitario() {
        return valor_unitario;
    }

    public int getEstoque() {
        return estoque;
    }
    
    public double getValor_total() {
        return valor_unitario * estoque;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }
    
    
}
