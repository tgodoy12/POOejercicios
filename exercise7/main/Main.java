package exercise7.main;

import exercise7.entidad.Persona;
import exercise7.service.ServicePersona;

/**
 * Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
 * los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
 * tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
 * persona es mayor de edad.
 * Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
 * distintas variables, para después en el main, calcular un porcentaje de esas 4 personas
 *
 * cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
 * también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores
 */

public class Main {
    public static void main(String[] args) {
        ServicePersona servPersona = new ServicePersona();

        Persona[] pNueva = new Persona[4];
        int imc;
        int porDebajo = 0;
        int ideal = 0;
        int porEncima = 0;

        boolean esMayor;
        int mayor = 0;
        int menor = 0;

        for (int i=0; i<4; i++) {
            pNueva[i] = servPersona.crearPersona();

            imc = servPersona.calcularIMC(pNueva[i]);
            if (imc == 0){
                ideal += 1;
            } else if(imc == -1) {
                porDebajo++;
            } else {
                porEncima++;
            }

            esMayor = servPersona.esMayorDeEdad(pNueva[i]);
            if (esMayor == false) {
                menor++;
            }else {
                mayor++;
            }
        }
        System.out.println("Resultados IMC");
        System.out.println("---------------");
        System.out.println(porDebajo + " personas están por debajo de su peso");
        System.out.println(ideal + " personas están en su peso ideal");
        System.out.println(porEncima + " personas están por encima de su peso");

        System.out.println("Resultados Mayoría edad");
        System.out.println("---------------");
        System.out.println(menor + " personas son menores de edad");
        System.out.println(mayor + " personas son mayores de edad");

    }
}
