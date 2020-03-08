package sala;

import java.util.Objects;

public class Sala {
    private static Long id = 0l;
    private String numero;
    private int totalDeAssentos;

    public Sala(String numero, int totalDeAssentos) {
        this.numero = numero;
        this.totalDeAssentos = totalDeAssentos;
        id += 1;
    }

    public static Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sala sala = (Sala) o;
        return Objects.equals(numero, sala.numero);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }

    @Override
    public String toString() {
        return "Sala{" +
                "numero='" + numero + '\'' +
                ", totalDeAssentos=" + totalDeAssentos +
                '}';
    }
}