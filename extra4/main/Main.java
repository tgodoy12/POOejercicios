package extra4.main;

import extra4.entidad.NIF;
import extra4.service.NIFservice;

public class Main {
    public static void main(String[] args) {
        NIFservice nifService = new NIFservice();
        NIF newNif = nifService.crearNif();

        System.out.println(newNif.toString());

        nifService.mostrar(newNif);

    }
}
