package exercise14.entidad;

import java.util.Arrays;

/**
 * Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
 * posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
 * almacenar cada producto con su información. Crear una entidad Movil con los atributos
 * marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
 * un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
 * correspondiente al código.
 */
public class Movil {
    private String marca;
    private double precio;
    private String modelo;
    private double memoriaRam;
    private double almacenamiento;
    private int[] codigo = new int[7];

    //Contructores
    public Movil() {
    }

    public Movil(String marca, double precio, String modelo, double memoriaRam, double almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    //Getters & Setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(double memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public double getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    //toString
    @Override
    public String toString() {
        return "Movil{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", modelo='" + modelo + '\'' +
                ", memoriaRam=" + memoriaRam +
                ", almacenamiento=" + almacenamiento +
                ", codigo=" + Arrays.toString(codigo) +
                '}';
    }
}
