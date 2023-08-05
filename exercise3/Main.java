package exercise3;

import exercise3.entidad.Operacion;
import exercise3.service.ServiceOperacion;

public class Main {
    public static void main(String[] args) {
        // se instancia objeto de la clase servicio para acceder a los metodos
        ServiceOperacion servOp = new ServiceOperacion();

        // se crea variable op1 de la clase Operacion y se llama a la funcion crearOperación() del objeto servOp
        // se asigna el retorno de la función a la variable op1
        Operacion op1 = servOp.crearOperacion();

        //Se llaman a las funciones de servOp y se imprimen en pantalla los valores retornados de las operaciones.
        double suma = servOp.sumar(op1);
        System.out.println(suma);

        double resta = servOp.restar(op1);
        System.out.println(resta);

        double producto = servOp.multiplicar(op1);
        System.out.println(producto);

        double cociente = servOp.dividir(op1);
        System.out.println(cociente);
    }
}
