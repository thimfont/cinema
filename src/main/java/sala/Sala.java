package sala;

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
    public String toString() {
        return "Sala{" +
                "numero='" + numero + '\'' +
                ", totalDeAssentos=" + totalDeAssentos +
                '}';
    }
}