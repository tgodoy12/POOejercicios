package exercise2.entidad;

/**
 * Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
 * tipo real. A continuación, se deben crear los siguientes métodos:
 * a) Método constructor que inicialice el radio pasado como parámetro.
 * b) Métodos get y set para el atributo radio de la clase Circunferencia.
 */
public class Circunferencia {
    private double radio;

    /**
     * constructor vacío
     */
    public Circunferencia() {
    }

    /**
     * constructor
     * @param radio
     */
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    /**
     * get radio
     * @return radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * set radio
     * @param radio
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
}

