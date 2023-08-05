package exercise1;

import exercise1.entidad.Libro;
import exercise1.service.LibraryService;

public class Main {
    public static void main(String[] args) {
        LibraryService sLibro = new LibraryService();

        Libro l1 = sLibro.cargarLibro();

        System.out.println(l1.toString());

        sLibro.mostrarInfo(l1);

    }
}
