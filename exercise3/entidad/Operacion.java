package exercise3.entidad;

/**
 * Crear una clase llamada Operacion que tenga como atributos privados numero1 y
 * numero2. A continuación, se deben crear los siguientes métodos:
 * a) Método constructor con todos los atributos pasados por parámetro.
 * b) Metodo constructor sin los atributos pasados por parámetro.
 * c) Métodos get y set.
 */
public class Operacion {
    private double numero1;
    private double numero2;

    /**
     * constructor vacío
     */
    public Operacion() {
    }

    /**
     * constructor
     * @param numero1
     * @param numero2
     */
    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    /**
     * get numero1
     * @return numero1
     */
    public double getNumero1() {
        return numero1;
    }

    /**
     * get numero2
     * @return numero2
     */
    public double getNumero2() {
        return numero2;
    }

    /**
     * set numero1
     * @param numero1
     */
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    /**
     * set numero2
     * @param numero2
     */
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }


}
