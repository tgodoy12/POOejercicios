package extra2.main;

import extra2.entidad.Puntos;
import extra2.service.ServicePuntos;

public class Main {
    public static void main(String[] args) {
        ServicePuntos servPuntos = new ServicePuntos();
        Puntos newPuntos = servPuntos.crearPuntos();
        System.out.println(newPuntos.toString());
        System.out.println("----");

        double distancia = servPuntos.calcularDistancia(newPuntos);

    }
}
