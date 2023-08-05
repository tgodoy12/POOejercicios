package exercise4.main;

import exercise4.entidad.Rectangulo;
import exercise4.service.ServiceRectangulo;

public class Main {
    public static void main(String[] args) {
        ServiceRectangulo servRect = new ServiceRectangulo();
        Rectangulo rect1 = servRect.crearRectangulo();

        //Métodos de servRect de la clase servicio
        double superficie = servRect.calcularSuperficie(rect1);
        System.out.println(superficie);

        double perimetro = servRect.calcularPerimetro(rect1);
        System.out.println(perimetro);

        servRect.dibujarRectangulo(rect1);
    }
}
