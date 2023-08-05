package extra4.entidad;

/**
 * Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
 * correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
 * letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
 *  Métodos getters y setters para el número de DNI y la letra.
 */

public class NIF {
    private long DNIs;
    private String letra;

    public NIF() {
    }

    public NIF(long DNIs, String letra) {
        this.DNIs = DNIs;
        this.letra = letra;
    }

    public long getDNIs() {
        return DNIs;
    }

    public void setDNIs(long DNIs) {
        this.DNIs = DNIs;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "NIF{" +
                "DNIs=" + DNIs +
                ", letra='" + letra + '\'' +
                '}';
    }
}
