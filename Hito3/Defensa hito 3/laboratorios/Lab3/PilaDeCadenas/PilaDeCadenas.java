package Hito3.PilaDeCadenas;

public class PilaDeCadenas {
    private int max;
    private String [] Nombres;
    private int tope;

    public PilaDeCadenas(int max) {
        this.tope = 0;
        this.max = max;
        Nombres = new String[this.max + 1];
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
    public void adicionar (String nuevoItem) {
        if (this.esLleno() == false) {
            this.tope = this.tope + 1;
            this.Nombres[this.tope] = nuevoItem;
        } else {
            System.out.println("La pila de cadenas está llena");
        }
    }
    public String eliminar () {
        String elementoEliminado= "";

        if (!this.esVacio()) {
            elementoEliminado = (this.Nombres[this.tope]);
            this.tope = this.tope - 1;
        } else {
            System.out.println("La pila de cadenas está vacia");
        }
        return elementoEliminado;

    }
    public void llenar () {


    }
    public void mostrar () {
        String elem;
        if (esVacio())
            System.out.println("Pila Vacia");
        else {
            System.out.println(" Datos de la Pila de cadenas");
            PilaDeCadenas aux = new PilaDeCadenas(this.max);
            while (!esVacio()) {
                elem = this.eliminar();
                aux.adicionar (elem);
                System.out.println("Elem " + elem);
            }
            vaciar(aux);
        }

    }
    public void vaciar (PilaDeCadenas a) {
        while (!a.esVacio())
            adicionar(String.valueOf(a.eliminar()));
    }
}
