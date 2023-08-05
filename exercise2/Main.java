package exercise2;

import exercise2.entidad.Circunferencia;
import exercise2.service.ServiceCircunferencia;

public class Main {
    public static void main(String[] args) {
        // Instancio la clase servicio para acceder a los métodos que ésta contiene
        ServiceCircunferencia servCirc = new ServiceCircunferencia();

        // Creo un variable c1 de la clase circunferencia
        //llamo la funcion crearCircunferencia de la clase servicio y asigno el objeto a c1
        Circunferencia c1 = servCirc.CrearCircunferencia();

        // Creo variable area donde guardo el retorno de la función area() de la clase servicio
        double area = servCirc.area(c1);
        System.out.println(area);

        // Llamo al metodo void perímetro de la clase servicio
        servCirc.perimetro(c1);

    }
}
