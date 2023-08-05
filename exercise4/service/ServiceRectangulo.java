package exercise4.service;

import exercise4.entidad.Rectangulo;

import java.util.Scanner;

/**
 *  La clase incluirá un método para crear el rectángulo
 * con los datos del Rectángulo dados por el usuario. También incluirá un método para
 * calcular la superficie del rectángulo y un método para calcular el perímetro del
 * rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
 * asteriscos usando la base y la altura.
 * Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
public class ServiceRectangulo {
    private Scanner scanner = new Scanner(System.in);

    /**
     * Función que retorna el objeto instanciado de la clase Rectangulo
     *
     * @return new Rectangulo(base, altura)
     */
    public Rectangulo crearRectangulo() {
        System.out.println("Introducir base");
        double base = scanner.nextDouble();

        System.out.println("Introducir altura");
        double altura = scanner.nextDouble();

        return new Rectangulo(base, altura);
    }

    /**
     * Función que retorna la superficie del rectangulo
     *
     * @param rect1
     * @return superficie
     */
    public double calcularSuperficie(Rectangulo rect1) {
        double superficie = rect1.getBase() * rect1.getAltura();
        return superficie;
    }

    /**
     * función que retorna el perímetro del rectángulo
     *
     * @param rect1
     * @return perimetro
     */
    public double calcularPerimetro(Rectangulo rect1) {
        double perimetro = (rect1.getBase() * rect1.getAltura()) / 2;
        return perimetro;
    }

    /**
     * Método void que imprime en pantalla el rectángulo con asteriscos.
     * Se toman los atributos base y altura para cuantificar la cantidad de asteriscos.
     * @param rect1
     */
    public void dibujarRectangulo(Rectangulo rect1) {

        for (int i = 0; i < rect1.getAltura(); i++) {
            for (int j = 0; j < rect1.getBase(); j++) {
                // Verifica si es el borde superior, inferior o lateral
                if (i == 0 || i == rect1.getAltura() - 1 || j == 0 || j == rect1.getBase() - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Espacio en blanco para el relleno
                }
            }
            System.out.println();
        }
    }
}
