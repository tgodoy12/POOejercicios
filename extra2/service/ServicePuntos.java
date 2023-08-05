package extra2.service;

import extra2.entidad.Puntos;

import java.util.Scanner;

/**
 * Generar un objeto puntos
 * usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
 * los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
 * que existe entre los dos puntos que existen en la clase Puntos.
 *
 */

public class ServicePuntos {
    Scanner scanner = new Scanner(System.in).useDelimiter("\n");
    public Puntos crearPuntos() {
        Puntos newPuntos = new Puntos();
        System.out.println("x1:");
        newPuntos.setX1(scanner.nextInt());

        System.out.println("y1:");
        newPuntos.setY1(scanner.nextInt());

        System.out.println("x2:");
        newPuntos.setX2(scanner.nextInt());

        System.out.println("y2:");
        newPuntos.setY2(scanner.nextInt());

        return newPuntos;
    }

    public double calcularDistancia(Puntos newPuntos) {
        double distancia = Math.sqrt(Math.pow(newPuntos.getX2() - newPuntos.getX1(), 2) + Math.pow(newPuntos.getY2() - newPuntos.getY1(), 2));

        System.out.println("Distancia: " + distancia);

        return distancia;
    }
}
