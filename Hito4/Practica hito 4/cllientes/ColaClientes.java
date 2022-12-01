package ColaClientes.cllientes;

public class ColaClientes {
    private int max;
    private int fin;
    private int ini;
    private Cliente[] Clientes;


    public ColaClientes(int max) {
        this.max = max;
        this.Clientes  = new Cliente[this.max + 1];
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

    public void adicionar(Cliente NuevoCliente) {
        if (!esLlena()) {
            fin++;
            Clientes[fin] = NuevoCliente;
        } else {
            System.out.println("Cola de numeros llena");
        }
    }
    public Cliente eliminar() {
        Cliente elementoEliminado = null;
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
        Cliente elem = null;
        if (esVacia())
            System.out.println("Cola Vacia");
        else {
            System.out.println("\nDatos de la Cola de clientes");
            ColaClientes aux = new ColaClientes(fin);
            while (!esVacia()) {
                elem = this.eliminar();
                aux.adicionar (elem);
                elem.mostrarCliente();
            }
            vaciar(aux);
        }

    }
    public void vaciar (ColaClientes cola) {
        while (!cola.esVacia())
            adicionar(cola.eliminar());
    }
}
