package extra6.entidad;

import java.util.Arrays;

/**
 * Crear una clase Ahorcado (como el juego), la cual deberá contener
 * como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
 * cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
 * con los parámetros que sean necesarios:
 */

public class Ahorcado {
    private String[] palabraBuscada;
    private int letrasEncontradas;
    private int jugadasMaximas;
    private String[] listaPalabras;

    //constructores
    public Ahorcado() {
    }

    public Ahorcado(String[] palabraBuscada, int letrasEncontradas, int jugadasMaximas, String[] listaPalabras) {
        this.palabraBuscada = palabraBuscada;
        this.letrasEncontradas = letrasEncontradas;
        this.jugadasMaximas = jugadasMaximas;
        this.listaPalabras = listaPalabras;
    }

    //getters&setters
    public String[] getPalabraBuscada() {
        return palabraBuscada;
    }

    public void setPalabraBuscada(String[] palabraBuscada) {
        this.palabraBuscada = palabraBuscada;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getJugadasMaximas() {
        return jugadasMaximas;
    }

    public void setJugadasMaximas(int jugadasMaximas) {
        this.jugadasMaximas = jugadasMaximas;
    }

    public String[] getListaPalabras() {
        return listaPalabras;
    }

    public void setListaPalabras(String[] listaPalabras) {
        this.listaPalabras = listaPalabras;
    }

    //toString

    @Override
    public String toString() {
        return "Ahorcado{" +
                "palabraBuscada=" + Arrays.toString(palabraBuscada) +
                ", letrasEncontradas=" + letrasEncontradas +
                ", jugadasMaximas=" + jugadasMaximas +
                ", listaPalabras=" + Arrays.toString(listaPalabras) +
                '}';
    }
}
