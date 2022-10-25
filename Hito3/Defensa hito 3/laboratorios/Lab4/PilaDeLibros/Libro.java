package Hito3.PilaDeLibros;
public class Libro {
    private String titulo;
    private String autor;
    private int nroPag;
    private double precio;
    private String categoria;

    public Libro(String titulo, String autor, int nroPag, double precio, String categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.nroPag = nroPag;
        this.precio = precio;
        this.categoria = categoria;

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

    public int getNroPag() {
        return nroPag;
    }

    public void setNroPag(int nroPag) {
        this.nroPag = nroPag;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public void mostrarLibro(){
        System.out.println("\nMostrando libro");
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Nro de paginas: " + this.getNroPag());
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("Categoria: " + this.getCategoria());

    }
}
