package exercise8.entidad;

/**
 * Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
 * String) y su longitud.
 */

public class Cadena {
    String frase;
    int longitud;

    /**
     * constructor vacío
     */
    public Cadena() {
    }

    /**
     * Constructor por parámetros
     * @param frase
     * @param longitud
     */
    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    //Getters & Setters
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    @Override
    public String toString() {
        return "Cadena{" +
                "frase='" + frase + '\'' +
                ", longitud=" + longitud +
                '}';
    }
}
