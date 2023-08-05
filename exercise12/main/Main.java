package exercise12.main;

import exercise12.entidad.Persona;
import exercise12.service.ServicePersona;

public class Main {
    public static void main(String[] args) {
        ServicePersona servPersona = new ServicePersona();
        Persona newPersona = servPersona.crearPersona();
        System.out.println(newPersona.toString());
        System.out.println("----");

        //calcular calcularEdad
        int edad = servPersona.calcularEdad(newPersona);

        Persona newPerson = servPersona.crearPersona();
        System.out.println(newPerson.toString());
        System.out.println("----");

        //compara dos edades de dos objetos diferentes de la clase persona
        boolean esMenor = servPersona.menorQue(newPersona, newPerson);


    }
}
