package exercise12.entidad;

import java.util.Date;

/**
 * Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
 * (Tipo Date), constructor vacío, constructor parametrizado, get y set.
 */

public class Persona {
    private String nombre;
    private Date fechaNac;

    /**
     * Constructor vacío
     */
    public Persona() {
    }

    /**
     * Constructor parametrizado
     * @param nombre
     * @param fechaNac
     */
    public Persona(String nombre, Date fechaNac) {
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }

    //Getters & Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    //toString

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fechaNac=" + fechaNac +
                '}';
    }
}
