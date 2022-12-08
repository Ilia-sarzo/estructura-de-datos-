package Proyecto_X;

public class Libro {
    private String titulo;
    private String autor;
    private int nroPag;
    private int CodigoLibro;
    private String categoria;

    public Libro(String titulo, String autor, int nroPag, int CodigoLibro, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroPag = nroPag;
        this.CodigoLibro = CodigoLibro;
        this.categoria = categoria;

    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNroPag() {
        return nroPag;
    }

    public int getCodigoLibro() {
        return CodigoLibro;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNroPag(int nroPag) {
        this.nroPag = nroPag;
    }

    public void setCodigoLibro(int codigoLibro) {
        CodigoLibro = codigoLibro;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void mostrarLibro(){
        System.out.println("\nMostrando libro");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Nro de paginas: " + this.getNroPag());
        System.out.println("Precio: " + this.getCodigoLibro());
        System.out.println("Categoria: " + this.getCategoria());

    }
}
