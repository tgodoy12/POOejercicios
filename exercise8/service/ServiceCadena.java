package exercise8.service;


import exercise8.entidad.Cadena;

import java.util.Scanner;

public class ServiceCadena {
    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    public Cadena crearCadena() {
        Cadena newCadena = new Cadena();

        System.out.println("Ingrese una palabra o frase");
        newCadena.setFrase(scanner.next());
        newCadena.setLongitud(newCadena.getFrase().length());

        return newCadena;
    }

    /**
     * Método mostrarVocales(), contabiliza la cantidad de vocales que tiene la
     * frase ingresada.
     * @param newCadena
     * @return
     */
    public int mostrarVocales(Cadena newCadena) {
        int vocales = 0;
        String frase = newCadena.getFrase().toLowerCase();

        for (int i=0; i< newCadena.getLongitud(); i++) {
            char v = frase.charAt(i);

            if (v == 'a' || v == 'e' || v == 'i' || v == 'o' || v == 'u') {
                vocales++;
            }
        }
        System.out.println("Cantidad de vocales: " + vocales);

        return vocales;
    }

    /**
     * Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
     * ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
     * @param newCadena
     */
    public void invertirFrase(Cadena newCadena) {
        String fraseInvertida="";
        char letra;

        for (int i=newCadena.getLongitud()-1; i>=0; i--) {
            letra = newCadena.getFrase().charAt(i);
            fraseInvertida = fraseInvertida + letra;
        }

        System.out.println(fraseInvertida);
    }

    /**
     * Método vecesRepetido(), recibirá un carácter ingresado por el usuario y
     * contabilizar cuántas veces se repite el carácter en la frase.
     * @param newCadena
     */
    public void vecesRepetido(Cadena newCadena) {
        System.out.println("Introducir letra");
        String letra = scanner.next();
        int contador = 0;

        for (int i=0; i<newCadena.getLongitud(); i++) {
            if (letra.equalsIgnoreCase(String.valueOf(newCadena.getFrase().charAt(i)))) {
                contador++;
            }
        }
        System.out.println("El caracter " + letra + " se repite " + contador + " veces en la frase");
    }

    /**
     * Método compararLongitud(String frase), deberá comparar la longitud de la frase que
     *  * compone la clase con otra nueva frase ingresada por el usuario.
     * @param newCadena
     * @return
     */
    public boolean compararLongitud(Cadena newCadena) {
        boolean esIgual = false;
        System.out.println("Ingrese una frase a comparar");
        String newFrase = scanner.next();

        if (newFrase.length() == newCadena.getLongitud()) {
            esIgual = true;
            System.out.println("Ambas cadenas contienen " + newFrase.length() + " caracteres.");
        }
        System.out.println(esIgual);
        return esIgual;
    }

    /**
     * Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
     * con una nueva frase ingresada por el usuario y mostrar la frase resultante.
     * @param newCadena
     */
    public void unirFrases(Cadena newCadena) {
        System.out.println("Introduce una palabra o frase");
        String newFrase = scanner.next();

        System.out.println(newCadena.getFrase() + " " + newFrase);
    }

    /**
     * Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
     * encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
     * la frase resultante.
     * @param newCadena
     */
    public void reemplazar(Cadena newCadena) {
        System.out.println("Introducir letra");
        String letra = scanner.next();

        String fraseNueva = newCadena.getFrase().replace("a", letra);
        System.out.println(fraseNueva);
    }

    /**
     * Método contiene(String letra), deberá comprobar si la frase contiene una letra que
     * ingresa el usuario y devuelve verdadero si la contiene y falso si no.
     * @param newCadena
     * @return
     */
    public boolean contiene(Cadena newCadena) {
        boolean contieneLetra = false;
        System.out.println("Introducir letra");
        String letra = scanner.next();

        if (newCadena.getFrase().contains(letra)) {
            contieneLetra = true;
        }
        System.out.println(contieneLetra);

        return contieneLetra;
    }
}
