package Proyecto_X;

public class PilaDeLibros {
    private int max;
    private int tope;
    private Libro[] Libros;

    public PilaDeLibros(int max) {
        this.tope = 0;
        this.max = max;
        this.Libros = new Libro[this.max + 1];
    }
    public boolean esVacio () {
        if (tope == 0) {
            return true;
        } else {
            return false;
        }

    }
    public boolean esLleno () {
        if (tope == max) {
            return true;
        } else {
            return false;
        }

    }
    public int nroElem () {
        return this.tope;
    }
    public void adicionar (Libro nuevoLibro) {
        if (!this.esLleno()) {
            this.tope = this.tope + 1;
            this.Libros[this.tope] = nuevoLibro;
        } else {
            System.out.println("La pila de libros está llena");
        }
    }
    public Libro eliminar () {
        Libro elementoEliminado = null;

        if (!this.esVacio()) {
            elementoEliminado = (this.Libros[this.tope]);
            this.tope = this.tope - 1;
        } else {
            System.out.println("La pila de libros está vacia");
        }
        return elementoEliminado;

    }
    public void llenar () {


    }
    public void mostrar () {
        Libro elem = null;
        if (esVacio())
            System.out.println("Pila Vacia");
        else {
            System.out.println(" Datos de la Pila de libros");
            PilaDeLibros aux = new PilaDeLibros(this.max);
            while (!esVacio()) {
                elem = this.eliminar();
                aux.adicionar (elem);
                elem.mostrarLibro();
            }
            vaciar(aux);
        }

    }
    public void vaciar (PilaDeLibros pila) {
        while (!pila.esVacio()) {
            adicionar(pila.eliminar());
        }
    }
}
