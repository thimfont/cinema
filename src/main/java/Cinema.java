import sala.GerenciadorDeSalas;
import sala.Sala;

import java.util.Collection;

public class Cinema {
    public static void main(String[] args) {
        GerenciadorDeSalas gerenciadorDeSalas = new GerenciadorDeSalas();
        Sala s1 = new Sala("1", 10);
        gerenciadorDeSalas.adiciona(s1);

        Sala s2 = new Sala("2", 10);
        gerenciadorDeSalas.adiciona(s2);

        Collection<Sala> salas = gerenciadorDeSalas.listaTodasAsSalas();
        salas.forEach(System.out::println);

    }
}
