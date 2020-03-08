package filme;

import java.time.Duration;

public class Filme {
    private static Long id = 0l;
    private String nome;
    private String descricao;
    private Categoria categoria;
    private Duration duracao;

    public Filme(String nome, Duration duracao) {
        this.nome = nome;
        this.duracao = duracao;
    }

    public static Long getId() {
        return id;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", categoria=" + categoria +
                ", duracao=" + duracao +
                '}';
    }
}
