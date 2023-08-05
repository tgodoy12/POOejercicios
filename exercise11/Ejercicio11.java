package exercise11;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11 {
    /**
     * Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
     * clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
     * Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
     * usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
     * deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
     * se puede conseguir instanciando un objeto Date con constructor vacío.
     * Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
     * Ejemplo fecha actual: Date fechaActual = new Date();
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introducir día");
        int dia = scanner.nextInt();
        System.out.println("Introducir mes");
        int mes = scanner.nextInt();;
        System.out.println("Introducir año");
        int anio = scanner.nextInt();

        //Según chatGPT la clase date estaría obsoleta.
        //Recomienda usar la clase calendar.
        Date fecha = new Date(anio-1900, mes-1, dia); //al año se le resta 1900, y al mes se le resta 1
        System.out.println(fecha.toString());

        Date fechaActual = new Date();
        System.out.println(fechaActual.toString());

        int diferenciaAnios = fechaActual.getYear() - fecha.getYear();
        System.out.println("Diferencia de años: " + diferenciaAnios);
    }

}
