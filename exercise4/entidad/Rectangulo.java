package exercise4.entidad;

/**
 * Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
 * base y un atributo privado altura.
 * Se deberán además definir los métodos getters, setters y constructores correspondientes.
 */
public class Rectangulo {
    private double base;
    private double altura;

    /**
     * constructor vacío
     */
    public Rectangulo() {
    }

    /**
     * constructor
     * @param base
     * @param altura
     */
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    /**
     * get base
     * @return base
     */
    public double getBase() {
        return base;
    }

    /**
     * get altura
     * @return altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * set base
     * @param base
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * set altura
     * @param altura
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
