package inicioobjetosclases;

public class Libro {

    private String ISBN;
    private String titulo;
    private String autor;
    private int numPaginas;
    public static int contadorLibros = 0;

    public Libro() {
        contadorLibros++;
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        contadorLibros++;
    }

    public Libro(String ISBN, String titulo, String autor, int numPaginas) {
        this.ISBN = ISBN;
        this.autor = autor;
        this.titulo = titulo;
        this.numPaginas = numPaginas;
        contadorLibros++;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String toString() {
        return "El libro con ISBN " + ISBN + " creado por " + autor + " y de nombre " + titulo + " tiene " + numPaginas + "paginas";
    }

}
