package trabalholp2;

/**
 *
 * @author mateusseiboth
 */

public class Empresa {
    private static int nextCodigo = 1;
    private int codigo;
    private String descricao;
    private Categoria categoria;
    private Usuario user;

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

        this.user = user;
    }

    public Empresa(int codigo, String descricao, Categoria categoria, Usuario user) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.categoria = categoria;
        this.user = user;

    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
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
