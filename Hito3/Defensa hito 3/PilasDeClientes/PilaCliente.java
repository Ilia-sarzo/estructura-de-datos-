package PilasDeClientes;

public class PilaCliente {
    private int max;
    private int tope;
    private Cliente[] Clientes;

    public PilaCliente(int max) {
        this.tope = 0;
        this.max = max;
        this.Clientes = new Cliente[this.max + 1];
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
    public void adicionar (Cliente nuevoLCliente) {
        if (this.esLleno() == false) {
            this.tope = this.tope + 1;
            this.Clientes[this.tope] = nuevoLCliente;
        } else {
            System.out.println("La pila de clientes está llena");
        }
    }
    public Cliente eliminar () {
        Cliente elementoEliminado = null;

        if (!this.esVacio()) {
            elementoEliminado = (this.Clientes[this.tope]);
            this.tope = this.tope - 1;
        } else {
            System.out.println("La pila de Clientes está vacia");
        }
        return elementoEliminado;

    }
    public void llenar () {

    }
    public void mostrar () {
        Cliente elem = null;
        if (esVacio())
            System.out.println("Pila Vacia");
        else {
            System.out.println(" Datos de la Pila de Clientes");
            PilaCliente aux = new PilaCliente(this.max);
            while (!esVacio()) {
                elem = this.eliminar();
                aux.adicionar (elem);
                elem.mostrarCliente();
            }
            vaciar(aux);
        }

    }
    public void vaciar (PilaCliente pila) {
        while (!pila.esVacio()) {
            adicionar(pila.eliminar());
        }
    }

}
