package Defensa_Pilas_Hito3;

public class PilaDeEstudiante {

    private int max;
    private int tope;
    private Estudiante[] Estudiantes;

    public PilaDeEstudiante(int max) {
        this.tope = 0;
        this.max = max;
        this.Estudiantes = new Estudiante[this.max + 1];
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
    public void adicionar (Estudiante nuevoLCliente) {
        if (this.esLleno() == false) {
            this.tope = this.tope + 1;
            this.Estudiantes[this.tope] = nuevoLCliente;
        } else {
            System.out.println("La pila de Estudiantes está llena");
        }
    }
    public Estudiante eliminar () {
        Estudiante elementoEliminado = null;

        if (!this.esVacio()) {
            elementoEliminado = (this.Estudiantes[this.tope]);
            this.tope = this.tope - 1;
        } else {
            System.out.println("La pila de Estudiantes está vacia");
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
            System.out.println(" Datos de la Pila de Estudiantes");
            PilaDeEstudiante aux = new PilaDeEstudiante(this.max);
            while (!esVacio()) {
                elem = this.eliminar();
                aux.adicionar (elem);
                elem.musestraEstudiantes();
            }
            vaciar(aux);
        }

    }
    public void vaciar (PilaDeEstudiante pila) {
        while (!pila.esVacio()) {
            adicionar(pila.eliminar());
        }
    }
}
