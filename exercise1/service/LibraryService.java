package exercise1.service;

import exercise1.entidad.Libro;

import java.util.Scanner;

/**
 * Crear un método para cargar un libro pidiendo los datos al usuario y
 * luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
 * numero de páginas.
 */
public class LibraryService {
    private Scanner scanner = new Scanner(System.in).useDelimiter("\n");

    /**
     * Crear un objeto Libro
     * @return Libro
     */
    public Libro cargarLibro() {
        System.out.println("Introducir ISBN");
        String ISBN = scanner.next();

        System.out.println("Introducir título");
        String titulo = scanner.next();

        System.out.println("Introducir autor");
        String autor = scanner.next();

        System.out.println("Introducir número de páginas");
        String numPaginas = scanner.next();

        return new Libro(ISBN, titulo, autor, numPaginas);
    }

    /**
     * Mostrar los atributos del objeto creado
     * @param libroInfo
     */
    public void mostrarInfo(Libro libroInfo) {
        System.out.println("ISBN: " + libroInfo.getISBN());
        System.out.println("Título: " + libroInfo.getTitulo());
        System.out.println("Autor: " + libroInfo.getAutor());
        System.out.println("Número de páginas: " + libroInfo.getNumPaginas());

    }
}
