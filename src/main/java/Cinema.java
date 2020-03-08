import filme.Filme;
import filme.GerenciadorDeFilmes;
import sala.GerenciadorDeSalas;
import sala.Sala;

import java.time.Duration;
import java.util.Collection;

import static filme.Categoria.ACAO;
import static java.time.temporal.ChronoUnit.*;

public class Cinema {
    public static void main(String[] args) {
        GerenciadorDeSalas gerenciadorDeSalas = new GerenciadorDeSalas();
        Sala s1 = new Sala("1", 10);
        gerenciadorDeSalas.adiciona(s1);

        Sala s2 = new Sala("2", 10);
        gerenciadorDeSalas.adiciona(s2);

        Collection<Sala> salas = gerenciadorDeSalas.listaTodasAsSalas();
        salas.forEach(System.out::println);

        Filme vingadores = new Filme("Vingadores",
                Duration.ZERO.plus(2, HOURS).plus(45, MINUTES).plus(25, SECONDS));
        vingadores.setCategoria(ACAO);
        vingadores.setDescricao("Os heróis vão atrás de Tanus pela galaxia profunda");

        GerenciadorDeFilmes gerenciadorDeFilmes = new GerenciadorDeFilmes();
        gerenciadorDeFilmes.adiciona(vingadores);
        Collection<Filme> filmes = gerenciadorDeFilmes.listaTodosOsFilmes();
        filmes.forEach(System.out::println);
    }
}
