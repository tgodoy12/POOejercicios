package exercise12.service;

import exercise12.entidad.Persona;

import java.util.Date;
import java.util.Scanner;

public class ServicePersona {
    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    /**
     * Constructor de un nuevo objeto Persona
     * Este método rellena el objeto mediante un Scanner y le pregunta al
     * usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
     * fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
     * @return newPersona
     */
    public Persona crearPersona() {
        Persona newPersona = new Persona();
        System.out.println("Introducir nombre");
        newPersona.setNombre(scanner.next());

        System.out.println("Introducir fecha de nacimiento");
        System.out.println("Día: ");
        int dia = scanner.nextInt();
        System.out.println("Mes: ");
        int mes = scanner.nextInt();
        System.out.println("Año: ");
        int anio = scanner.nextInt();

        Date fechaNac = new Date(anio-1900, mes-1, dia);
        newPersona.setFechaNac(fechaNac);

        return newPersona;
    }

    /**
     * Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
     * en cuenta que para conocer la edad de la persona también se debe conocer la fecha
     * actual.
     * @param newPersona
     * @return
     */
    public int calcularEdad(Persona newPersona) {
        Date fechaActual = new Date();
        int edad = fechaActual.getYear() - newPersona.getFechaNac().getYear();

        if ((fechaActual.getMonth() - newPersona.getFechaNac().getMonth() < 0) || (fechaActual.getDate() - newPersona.getFechaNac().getDate() < 0)) {
            edad--;
        } else if ((fechaActual.getMonth() - newPersona.getFechaNac().getMonth() == 0) && (fechaActual.getDate() - newPersona.getFechaNac().getDate() == 0)) {
            System.out.println("Happy Birthday!");
        }
        System.out.println(edad);
        return edad;
    }

    /**
     * Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
     * edad y retorna true en caso de que el receptor tenga menor edad que la persona que
     * se recibe como parámetro, o false en caso contrario.
     * @param persona1
     * @param personaX
     * @return edad
     *
     */
    public boolean menorQue(Persona persona1, Persona personaX) {
        boolean edad = false;

        if (calcularEdad(persona1)<calcularEdad(personaX)) {
            edad = true;
        }
        System.out.println(edad);

        return edad;
    }

    /**
     * Metodo mostrarPersona(): este método muestra la persona creada en el método
     * anterior
     * @param newPersona
     */
    public void mostrarPersona(Persona newPersona) {
        System.out.println(newPersona.toString());
    }




}
