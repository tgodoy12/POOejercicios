package extra3.main;

import extra3.entidad.Raices;
import extra3.service.ServiceRaices;

public class Main {
    public static void main(String[] args) {
        ServiceRaices servRaices = new ServiceRaices();
        Raices newRaiz = servRaices.crearRaiz(1,4,4);

        double discriminate = servRaices.getDiscriminate(newRaiz);
        System.out.println(discriminate);

        servRaices.calcular(newRaiz);

    }
}
