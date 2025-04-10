package Prin;

public class Libro {
    private String titulo;
    private String autor;
    private String ISBN;
    private int ejemplares;

    public Libro(String titulo, String autor, String ISBN, int ejemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.ISBN = ISBN;
        this.ejemplares = ejemplares;
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getISBN() { return ISBN; }
    public int getEjemplares() { return ejemplares; }
}
