package filme;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeFilmes {
    private static Map<Long, Filme> filmes = new HashMap<>();


    public void adiciona(Filme filme) {
        Long id = Filme.getId();
        filmes.put(id, filme);
    }

    public Collection<Filme> listaTodosOsFilmes() {
        return Collections.unmodifiableCollection(filmes.values());
    }
}
