package extra6.main;
/**
 * Aún falta terminar el ejercicio
 */


import extra6.entidad.Ahorcado;
import extra6.service.ServiceAhorcado;

public class Main {
    public static void main(String[] args) {
        ServiceAhorcado servAhorcado = new ServiceAhorcado();
        Ahorcado newAhorcado = servAhorcado.crearJuego();
        System.out.println(newAhorcado.toString());

        String[] letras= servAhorcado.buscarLetra(newAhorcado);



        //int longitudPalabra = servAhorcado.longitud(newAhorcado);
        //System.out.println(longitudPalabra);

        //servAhorcado.buscarLetra(newAhorcado);
        

    }
}
