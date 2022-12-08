package Proyecto_X;

public class PilaClientes {

    private int max;
    private int tope;
    private Estudiante[] Clientes;


    public PilaClientes(int max) {
        this.tope = 0;
        this.max = max;
        this.Clientes = new Estudiante[this.max + 1];
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
    public void adicionar (Estudiante nuevoCliente) {
        if (!this.esLleno()) {
            this.tope = this.tope + 1;
            this.Clientes[this.tope] = nuevoCliente;
        } else {
            System.out.println("La pila de numeros está llena");
        }
    }
    public Estudiante eliminar () {
        Estudiante elementoEliminado = null;

        if (!this.esVacio()) {
            elementoEliminado = (this.Clientes[this.tope]);
            this.tope = this.tope - 1;
        } else {
            System.out.println("La pila de libros está vacia");
        }
        return elementoEliminado;
    }
    public void llenar () {


    }
    public void mostrar () {
        Estudiante elem = null;
        if (esVacio())
            System.out.println("Pila Vacia");
        else {
            System.out.println("\nDatos de la Pila de clientes");
            PilaClientes aux = new PilaClientes(this.max);
            while (!esVacio()) {
                elem = this.eliminar();
                aux.adicionar (elem);
                elem.mostrarEstudiante();
            }
            vaciar(aux);
        }

    }
    public void vaciar (PilaClientes pila) {
        while (!pila.esVacio())
            adicionar(pila.eliminar());
    }
}
