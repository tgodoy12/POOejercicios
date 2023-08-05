package extra5.service;


import extra5.entidad.MesSecreto;

import java.util.Scanner;

public class ServiceMesSecreto {
    public MesSecreto crearMes() {
        MesSecreto newMes = new MesSecreto();
        newMes.setMesesAnio(setMeses());
        newMes.setMesSecreto(secretMes(newMes));

        return newMes;
        }

    private String[] setMeses() {
        String[] mesesAnio = new String[12];
        mesesAnio[0] = "Enero";
        mesesAnio[1] = "Febrero";
        mesesAnio[2] = "Marzo";
        mesesAnio[3] = "Abril";
        mesesAnio[4] = "Mayo";
        mesesAnio[5] = "Junio";
        mesesAnio[6] = "Julio";
        mesesAnio[7] = "Agosto";
        mesesAnio[8] = "Septiembre";
        mesesAnio[9] = "Octubre";
        mesesAnio[10] = "Noviembre";
        mesesAnio[11] = "Diciembre";
        return mesesAnio;
    }

    private String secretMes(MesSecreto newMes) {
        String[] mesesAnio = newMes.getMesesAnio();
        int indice = (int) (Math.random() * 12);

        return mesesAnio[indice];
    }

    public void adivinar(MesSecreto newMes) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Adivina el mes");
        String mes = scanner.next();

        while ((!mes.equalsIgnoreCase(newMes.getMesSecreto())) && (!mes.equalsIgnoreCase("s"))) {
            System.out.println(" ¡No ha acertado! Vuelve a intentarlo");
            System.out.println("Para salir, introduce la letra 's'.");
            mes = scanner.next();

        }

        if (mes.equalsIgnoreCase(newMes.getMesSecreto())) {
            System.out.println("¡Felicidades, usted ha adivinado!. El mes secreto es: " + newMes.getMesSecreto());
        }

    }


}
