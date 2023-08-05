package exercise14.service;

import exercise14.entidad.Movil;

import java.util.Scanner;

/**
 *
 * 
 */
public class ServiceMovil {
    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    /**
     * Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
     * instanciar un objeto Celular y poder cargarlo en nuestro programa.
     * @return newMovil
     */
    public Movil cargarMovil() {
        Movil newMovil = new Movil();

        System.out.println("Marca:");
        newMovil.setMarca(scanner.next());

        System.out.println("Precio:");
        newMovil.setPrecio(scanner.nextDouble());

        System.out.println("Modelo:");
        newMovil.setModelo(scanner.next());

        System.out.println("Memoria RAM:");
        newMovil.setMemoriaRam(scanner.nextDouble());

        System.out.println("Almacenamiento:");
        newMovil.setAlmacenamiento(scanner.nextDouble());

        return newMovil;
    }

    /**
     * Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
     * números de un celular. Para ello, puede utilizarse un bucle repetitivo
     * @param newMovil
     */
    public void ingresarCodigo(Movil newMovil) {
        int[] codigo = new int[7];

        for (int i=0; i<7; i++) {   //mejorar la forma de agregar el codigo para que no sea uno por uno.
            System.out.println("Ingrese código de 7 números");
            codigo[i] = scanner.nextInt();
        }

        newMovil.setCodigo(codigo);

    }

}
