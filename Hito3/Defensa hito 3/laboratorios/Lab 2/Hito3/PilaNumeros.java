package Hito3;

public class PilaNumeros {
    private int max;
    private int []p;
    private int tope;

    public PilaNumeros(int max) {
        this.max = max;
        p = new int[this.max + 1];
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
    public void adicionar (int nuevoItem) {
        if (this.esLleno() == false) {
            this.tope = this.tope + 1;
            this.p[this.tope] = nuevoItem;
        } else {
            System.out.println("La pila de numeros está llena");
        }
    }
    public int eliminar () {
        int elementoEliminado = 0;
        elementoEliminado = this.p[this.tope];
        this.tope = this.tope -1;
        return elementoEliminado;
    }
    public void llenar () {

    }
    public void mostrar () {
        int elem;
        if (esVacio())
            System.out.println("Pila Vacia");
        else {
            System.out.println(" Datos de la Pila");
            PilaNumeros aux = new PilaNumeros(10);
            while (!esVacio()) {
                elem = eliminar();
                aux.adicionar (elem);
                System.out.println("Elem " + elem);
            }
            vaciar(aux);
        }

    }
    public void vaciar (PilaNumeros a) {
        while (!a.esVacio())
            adicionar(a.eliminar());
    }
}
