package sala;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeSalas {
    private static Map<Long, Sala> salas = new HashMap<>();

    public void adiciona(Sala sala) {
        Long id = Sala.getId();
        salas.put(id, sala);
    }

    public Collection<Sala> listaTodasAsSalas() {
        return Collections.unmodifiableCollection(salas.values());
    }
}
