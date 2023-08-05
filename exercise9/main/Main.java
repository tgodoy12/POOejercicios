package exercise9.main;

import exercise9.entidad.Matematica;
import exercise9.serviceMatematica.ServiceMatematica;

/**
 * En el main se creará el objeto y se usará el
 * Math.random para generar los dos números y se guardaran en el objeto con su
 * respectivos set.
 */

public class Main {
    public static void main(String[] args) {
        ServiceMatematica servMat = new ServiceMatematica();
        Matematica newMat = servMat.crearMatematica();
        //System.out.println(newMat.toString());


        //Método calcularPotencia() para calcular la potencia del mayor valor de la clase
        //elevado al menor número. Previamente se deben redondear ambos valores.
        int potencia = servMat.calcularPotencia(newMat);

        //Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
        //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
        double raiz = servMat.calcularRaiz(newMat);

        //static
        //Llamo al método desde el servicio sin necesidad de instanciar el objeto
        double numero = ServiceMatematica.devolverMayor(6, 2);
        System.out.println(numero);
    }
}
