package exercise7.service;

import exercise7.entidad.Persona;

import java.util.Scanner;

/**
 * Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
 * al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
 * Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
 * O. Si no es correcto se deberá mostrar un mensaje
 *
 *  Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
 * kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
 * significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
 * Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
 * persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
 * de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
 * función devuelve un 1.
 *
 *  Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
 * devuelve un booleano.
 */
public class ServicePersona {
    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona() {
        Persona pNueva = new Persona();

        System.out.println("Introducir nombre");
        pNueva.setNombre(scanner.next());

        System.out.println("Introducir edad");
        pNueva.setEdad(scanner.nextInt());

        System.out.println("Introducir sexo:");
        System.out.println("H: hombre");
        System.out.println("M: mujer");
        System.out.println("O: otro");
        pNueva.setSexo(scanner.next());

        while (!(pNueva.getSexo().equalsIgnoreCase("H") || pNueva.getSexo().equalsIgnoreCase("M") || pNueva.getSexo().equalsIgnoreCase("O"))) {
            System.out.println("ERROR: Vuelva a ingresar el sexo.");
            System.out.println("H: hombre, M: mujer, O: otro");
            pNueva.setSexo(scanner.next());
        }

        System.out.println("Introducir peso en kg");
        pNueva.setPeso(scanner.nextDouble());

        System.out.println("Introducir altura en metros"); //crear condicion para que la altura sea en metros y no en cm
        pNueva.setAltura(scanner.nextDouble());

        return pNueva;
    }

    public int calcularIMC(Persona p1) {
        int imc = 0;
        double imcorporal = p1.getPeso() / (Math.pow(p1.getAltura(), 2));

        if (imcorporal < 20) {
            imc = -1;
        } else if (imcorporal >=20 && imcorporal <= 25) {
            imc = 0;
        } else {
            imc = 1;
        }

        return imc;
    }

    public boolean esMayorDeEdad(Persona p1) {
        boolean esMayor = false;

        if (p1.getEdad()>=18) {
            esMayor = true;
        }

        return esMayor;
    }
}
