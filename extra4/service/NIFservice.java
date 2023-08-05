package extra4.service;

import extra4.entidad.NIF;

import java.util.Scanner;

/**
 * Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
 * corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
 * resultado del calculo.
 *  Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
 * en mayúscula; por ejemplo: 00395469-F).
 * La letra correspondiente al dígito verificador se calculará a traves de un método que
 * funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
 * número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
 * buscar en un array (vector) de caracteres la posición que corresponda al resto de la
 * división para obtener la letra correspondiente.
 */

public class NIFservice {

    public NIF crearNif() {
        Scanner scanner = new Scanner(System.in);
        NIF newNif = new NIF();
        System.out.println("Introducir DNI");
        long dni = scanner.nextLong();
        while (dni > 99999999) {
            System.out.println("El DNI debe ser de 8 dígitos. Vuelva a ingresar.");
            dni = scanner.nextLong();
        }

        newNif.setDNIs(dni);

        newNif.setLetra(calcularLetra(newNif));

        return newNif;
    }

    public String calcularLetra(NIF newNif) {
        String[] letra = vectorLetras();
        int posicion = (int) (newNif.getDNIs() % 23);

        String valor = letra[posicion];

        return valor;
    }

    public String[] vectorLetras() {
        String letra[] = new String[23];
        letra[0] = "T";
        letra[1] = "R";
        letra[2] = "W";
        letra[3] = "A";
        letra[4] = "G";
        letra[5] = "M";
        letra[6] = "Y";
        letra[7] = "F";
        letra[8] = "P";
        letra[9] = "D";
        letra[10] = "X";
        letra[11] = "B";
        letra[12] = "N";
        letra[13] = "J";
        letra[14] = "Z";
        letra[15] = "S";
        letra[16] = "Q";
        letra[17] = "V";
        letra[18] = "H";
        letra[19] = "L";
        letra[20] = "C";
        letra[21] = "K";
        letra[22] = "E";

        return letra;
    }

    /**
     * Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
     * en mayúscula; por ejemplo: 00395469-F).
     */

    public void mostrar(NIF newNif) {
        System.out.println(newNif.getDNIs() + "-" + newNif.getLetra());
    }


}
