package exercise3.service;

import exercise3.entidad.Operacion;

import java.util.Scanner;

/**
 * d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
 * en los atributos del objeto.
 * e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
 * f) Método restar(): calcular la resta de los números y devolver el resultado al main.
 * g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
 * fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
 * Si no, se hace la multiplicación y se devuelve el resultado al main
 * h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
 * una división por cero, el método devuelve 0 y se le informa al usuario el error se le
 * informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
public class ServiceOperacion {
    private Scanner scanner = new Scanner(System.in);

    /**
     * Función que instancia objeto de la clase Operacion. Se introducen por teclado
     * dos numeros que seran guardados en sus atributos correspondientes.
     * @return new Operacion(numero1, numero2)
     */
    public Operacion crearOperacion() {
        System.out.println("Introducir número");
        double numero1 = scanner.nextDouble();

        System.out.println("Introducir número");
        double numero2 = scanner.nextDouble();

        return new Operacion(numero1, numero2);
    }

    /**
     * Función que retorna la suma de los atributos numero1 y numero2.
     * @param op1
     * @return suma
     */
    public double sumar(Operacion op1) {
        double suma = op1.getNumero1() + op1.getNumero2();
        //System.out.println("Suma: " + suma);
        return suma;
    }

    /**
     * Función que retorna la resta de los atributos numero1 y numero2.
     * @param op1
     * @return resta
     */
    public double restar(Operacion op1) {
        double resta = op1.getNumero1() - op1.getNumero2();
        //System.out.println("Resta: " + resta);
        return resta;
    }

    /**
     * Función que retorna el producto de los atributos numero1 y numero2.
     * Si uno o ambos de los numeros es 0, se imprime en pantalla un mensaje de error.
     * @param op1
     * @return producto
     */
    public double multiplicar(Operacion op1) {
        double producto = 0;
        if (op1.getNumero1() == 0 || op1.getNumero2() == 0) {
            System.out.println("ERROR al realizar operación:");
            System.out.println("Uno o ambos de los numeros es 0");
            return producto;
        }else {
            producto = op1.getNumero1() * op1.getNumero2();
            //System.out.println("Producto: " + producto);
            return producto;
        }

    }

    /**
     * Función que retorna la el cociente de los atributos numero1 y numero2.
     * Si uno o ambos de los atributos es 0, se imprime en pantalla un mensaje de error.
     * @param op1
     * @return cociente
     */
    public double dividir(Operacion op1) {
        double cociente = 0;

        if (op1.getNumero1() == 0) {
            System.out.println("ERROR al realizar operación:");
            System.out.println("El primer número (dividendo) es cero");
            return cociente;
        }else if(op1.getNumero2() == 0) {
            System.out.println("ERROR al realizar operación:");
            System.out.println("El segundo número (divisor) es cero");
            return cociente;
        }else {
            cociente = op1.getNumero1() / op1.getNumero2();
            //System.out.println("Cociente: " + cociente);
            return cociente;
        }

    }


}
