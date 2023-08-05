package extra5.main;

import extra5.entidad.MesSecreto;
import extra5.service.ServiceMesSecreto;

public class Main {
    public static void main(String[] args) {
        ServiceMesSecreto servMes = new ServiceMesSecreto();
        MesSecreto newMes = servMes.crearMes();
        servMes.adivinar(newMes);

        System.out.println("----");
        System.out.println(newMes.toString());

    }
}
