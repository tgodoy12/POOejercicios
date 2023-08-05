package extra6.service;


import extra6.entidad.Ahorcado;

import java.util.Scanner;

/**
 * Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
 * Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
 * vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
 * de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
 * máximas, el valor que ingresó el usuario y encontradas en 0.
 *
 *  Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
 * buscar como se usa el vector.length.
 *
 *  Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
 * letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
 *
 *  Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
 * cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
 * devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
 * busque una letra que no esté, se le restará uno a sus oportunidades.
 *
 *  Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
 *
 *  Método juego(): el método juego se encargará de llamar todos los métodos
 * previamente mencionados e informará cuando el usuario descubra toda la palabra o
 * se quede sin intentos. Este método se llamará en el main.
 */

public class ServiceAhorcado {


    public Ahorcado crearJuego() {
        Ahorcado newAhorcado = new Ahorcado();

        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Introducir la cantidad de intentos.");
        newAhorcado.setJugadasMaximas(scanner.nextInt());

        newAhorcado.setListaPalabras(listaPalabras());
        newAhorcado.setPalabraBuscada(palabraAleatoria(newAhorcado));

        return newAhorcado;
    }

    private String[] listaPalabras() {
        String[] lista = new String[10];

        lista[0] = "Jirafa";
        lista[1] = "Hipopotamo";
        lista[2] = "Tigre";
        lista[3] = "Oso";
        lista[4] = "Caracol";
        lista[5] = "Perro";
        lista[6] = "Comadreja";
        lista[7] = "Bisonte";
        lista[8] = "Aguila";
        lista[9] = "Papagayo";

        return lista;
    }

    private String[] palabraAleatoria(Ahorcado newAhorcado) {
        //indice aleatorio que nos dirá la posición del arreglo de la lista de palabras
        int indice = (int) (Math.random() * 10);

        String[] lista = newAhorcado.getListaPalabras();
        String palabra = lista[indice];

        char[] arregloPalabra = palabra.toCharArray();
        String[] arregloPalabraString = new String[palabra.length()];

        for (int i=0; i<palabra.length(); i++) {
            arregloPalabraString[i] = String.valueOf(arregloPalabra[i]);
        }

        return arregloPalabraString;
    }

    private int longitud(Ahorcado newAhorcado) {
        int longitud = newAhorcado.getPalabraBuscada().length;

        return longitud;
    }


    public String[] buscarLetra(Ahorcado newAhorcado) {
        Scanner scanner = new Scanner(System.in);
        String[] palabraBuscada = newAhorcado.getPalabraBuscada();
        String[] letrasIngresadas = new String[newAhorcado.getJugadasMaximas()];
        String[] letrasEncontradas = new String[palabraBuscada.length];
        String letra;


        for (int i=0; i<palabraBuscada.length; i++) {
            System.out.println("Introducir una letra");
            letra = scanner.next();
            letrasIngresadas[i] = letra;

            for (int j=0; j< palabraBuscada.length; j++) {
                if (letra.equalsIgnoreCase(palabraBuscada[j])) {
                    letrasEncontradas[j] = letra;
                } else {
                        newAhorcado.setJugadasMaximas(newAhorcado.getJugadasMaximas()-1);
                }
            }

        }

        return letrasEncontradas;
    }

    public void juego(Ahorcado newAhorcado) {

    }

/**
    private String[] encontradas(String[] letrasIngresadas, Ahorcado newAhorcado) {
        for (int i=0; i< letrasIngresadas.length; i++) {
           // if (letrasIngresadas[i].equalsIgnoreCase())
        }
        return
    }


*/

}
