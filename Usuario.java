package trabalholp2;

/**
 *
 * @author mateusseiboth
 */
public class Usuario {

    private int codigo;
    private String nome;
    private String senha;
    private static int nextCodigo = 1;

    public Usuario() {
    }

    public Usuario(String nome, String senha) {
        codigo = nextCodigo;
        nextCodigo++;
        this.nome = nome;
        this.senha = senha;
    }
    
     public Usuario(int id, String nome, String senha) {
        codigo = id;
        this.nome = nome;
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        final Usuario other = (Usuario) obj;
        if (this.codigo != other.codigo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return codigo + "-" + nome;
    }

}
