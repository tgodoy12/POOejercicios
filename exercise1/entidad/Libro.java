package exercise1.entidad;

/**
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
 * Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
 * constructor vacío.
 */
public class Libro {
    private String ISBN;
    private String titulo;
    private String autor;
    private String numPaginas;

    /**
     * Constructor vacío
     */
    public Libro() {
    }

    /**
     * Constructor con todos sus atributos como parámetros
     * @param ISBN
     * @param titulo
     * @param autor
     * @param numPaginas
     */
    public Libro(String ISBN, String titulo, String autor, String numPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    /**
     * Get ISBN
     * @return ISBN
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Get titulo
     * @return titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Get autor
     * @return autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Get numPaginas
     * @return numPaginas
     */
    public String getNumPaginas() {
        return numPaginas;
    }

    /**
     * Set ISBN
     * @param ISBN
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Set titulo
     * @param titulo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Set autor
     * @param autor
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Set numPaginas
     * @param numPaginas
     */
    public void setNumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
    }

    /**
     * muestran todos los atributos ordenados del objeto creado
     * @return
     */
    @Override
    public String toString() {
        return "Libro{" +
                "ISBN=" + ISBN +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
