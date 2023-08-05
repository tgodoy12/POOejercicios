package exercise8.main;


import exercise8.entidad.Cadena;
import exercise8.service.ServiceCadena;

/**
 * En el main se creará el objeto y se le pedirá al usuario que ingrese
 * una frase que puede ser una palabra o varias palabras separadas por un espacio en
 * blanco y a través de los métodos set, se guardará la frase y la longitud de manera
 * automática según la longitud de la frase ingresada.
 */

public class Main {
    public static void main(String[] args) {
        ServiceCadena servCadena = new ServiceCadena();
        Cadena newCadena = servCadena.crearCadena();

        System.out.println(newCadena.toString());

        //Método mostrarVocal() que contabiliza las vocales de la frase o palabra
        //int vocales = servCadena.mostrarVocales(newCadena);

        //Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla
        //servCadena.invertirFrase(newCadena);

        //Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
        //contabilizar cuántas veces se repite el carácter en la frase
        //servCadena.vecesRepetido(newCadena);

        //Método compararLongitud(), deberá comparar la longitud de la frase que
        //compone la clase con otra nueva frase ingresada por el usuario.
        //boolean comparar = servCadena.compararLongitud(newCadena);

        //Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
        //con una nueva frase ingresada por el usuario y mostrar la frase resultante.
        //servCadena.unirFrases(newCadena);

        //Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
        //encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
        //la frase resultante.
        //servCadena.reemplazar(newCadena);

        //Método contiene(String letra), deberá comprobar si la frase contiene una letra que
        //ingresa el usuario y devuelve verdadero si la contiene y falso si no.
        //boolean contieneLetra = servCadena.contiene(newCadena);








    }
}
