package Proyecto_X;

public class ColaEstudiantes {

    private int max;
    private int fin;
    private int ini;
    private Estudiante[] Clientes;


    public ColaEstudiantes(int max) {
        this.max = max;
        this.Clientes  = new Estudiante[this.max + 1];
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

    public void adicionar(Estudiante NuevoCliente) {
        if (!esLlena()) {
            fin++;
            Clientes[fin] = NuevoCliente;
        } else {
            System.out.println("Cola de numeros llena");
        }
    }
    public Estudiante eliminar() {
        Estudiante elementoEliminado = null;
        if (!esVacia()) {
            this.ini++;
            elementoEliminado = this.Clientes[ini];
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
    public void mostrar () {
        Estudiante elem = null;
        if (esVacia())
            System.out.println("Cola Vacia");
        else {
            System.out.println("\nDatos de la Cola de clientes");
            ColaEstudiantes aux = new ColaEstudiantes(fin);
            while (!esVacia()) {
                elem = this.eliminar();
                aux.adicionar (elem);
                elem.mostrarEstudiante();
            }
            vaciar(aux);
        }

    }
    public void vaciar (ColaEstudiantes cola) {
        while (!cola.esVacia())
            adicionar(cola.eliminar());
    }
}
