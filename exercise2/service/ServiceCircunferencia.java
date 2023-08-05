package exercise2.service;


import exercise2.entidad.Circunferencia;

import java.util.Scanner;

/**
 * c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
 * objeto.
 * d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
 * e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
public class ServiceCircunferencia {
    private Scanner scanner = new Scanner(System.in);

    /**
     * Crea un objeto de la clase Circunferencia
     * @return new Circunferencia(radio)
     */
    public Circunferencia CrearCircunferencia() {
        System.out.println("Introducir el radio");
        double radio = scanner.nextDouble();

        return new Circunferencia(radio);
    }

    /**
     * función que retorna el área de la circunferencia
     * @param c1
     * @return area
     */
    public double area(Circunferencia c1) {
        double area = Math.PI * Math.pow(c1.getRadio(), 2);

        return area;
    }

    /**
     * método void que imprime el perímetro de la circunferencia
     * @param c1
     */
    public void perimetro(Circunferencia c1) {
        double perimetro = 2 * Math.PI * c1.getRadio();

        System.out.println("Perimetro: " + perimetro);
    }

}
