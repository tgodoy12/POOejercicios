package exercise14.main;

import exercise14.entidad.Movil;
import exercise14.service.ServiceMovil;

public class Main {
    public static void main(String[] args) {
        ServiceMovil servMovil = new ServiceMovil();
        Movil newMovil = servMovil.cargarMovil();
        System.out.println(newMovil.toString());
        System.out.println("----");

        servMovil.ingresarCodigo(newMovil);
        System.out.println(newMovil.toString());


    }
}
