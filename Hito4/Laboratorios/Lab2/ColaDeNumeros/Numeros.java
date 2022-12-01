package Colas.ColaDeNumeros;

public class Numeros {
    private int max;
    private int fin;
    private int ini;
    private int cNum[];

    public Numeros(int max) {
        this.max = max;
        this.cNum  = new int[this.max + 1];
        this.ini = 0;
        this.fin = 0;
    }

    public boolean esVacia() {
        if (this.ini == 0 & this.fin == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean esLlena() {
        if (this.fin == this.max) {
            return true;
        } else {
            return false;
        }
    }

    public int nroElem() {
        return fin - ini;
    }

    public void adicionar(int elem) {
        if (!esLlena()) {
            fin++;
            cNum[fin] = elem;
        } else {
            System.out.println("Cola de numeros llena");
        }
    }
    public int eliminar() {
        int elementoEliminado = 0;
        if (!esVacia()) {
            this.ini++;
            elementoEliminado = this.cNum[ini];
            if (ini == fin) {
                ini = 0;
                fin = 0;
            }
            return elementoEliminado;
        } else {
            System.out.println("Cola de numeros vacia");
        }
        return elementoEliminado;
    }
    public void mostrar(){
        if (esVacia()) {
            System.out.println("No hay nada que mostrar, fraile");
        } else {
            int elementoeliminado = 0;
            System.out.println("\nMostrando datos de la cola");
            Numeros aux = new Numeros(max);
            while (!esVacia()) {
                elementoeliminado = eliminar();
                aux.adicionar(elementoeliminado);
                System.out.println("Valor = " + elementoeliminado);
            }
            vaciar(aux);
        }
    }

    public void vaciar (Numeros vaciar) {
        while (!vaciar.esVacia())
            adicionar(vaciar.eliminar());
    }
}
