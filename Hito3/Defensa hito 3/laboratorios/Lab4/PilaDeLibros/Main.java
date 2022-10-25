package Hito3.PilaDeLibros;

public class Main {
    public static void main(String[] args) {
        Libro lib1 = new Libro("La odisea", "Homero", 40, 20.50, "Novela");
        Libro lib2 = new Libro("DBA I", "Saul", 50, 30, "BaseDeDatos");
        Libro lib3 = new Libro("DBA II", "Ana", 60, 40.50, "BaseDedatos");
        Libro lib4 = new Libro("Progra Intro", "Micaela", 70, 55.50, "Logica");
        Libro lib5 = new Libro("Analisis y diseno", "Juan", 80, 65.50, "Analisis");

        PilaDeLibros pilaLibros = new PilaDeLibros(10);
        pilaLibros.adicionar(lib1);
        pilaLibros.adicionar(lib2);
        pilaLibros.adicionar(lib3);
        pilaLibros.adicionar(lib4);
        pilaLibros.adicionar(lib5);

        pilaLibros.mostrar();
        //CantidadPaginas(pilaLibros, 50);
        CambiarSentido(pilaLibros);

    }

    //Determinar cuantos libros tienen una cantidad de paginas mayor a 50
    public static void CantidadPaginas(PilaDeLibros pila, int Totalpag) {
        PilaDeLibros aux = new PilaDeLibros(10);
        int librosmayor50 = 0;
        Libro Valorextraido = null;
        while (pila.esVacio() == false) {
            Valorextraido = pila.eliminar();
            if (Valorextraido.getNroPag() > Totalpag) {
                librosmayor50 = librosmayor50 + 1;
            }
            aux.adicionar(Valorextraido);
        }
        System.out.println("La cantidad de libros con mas de 50 paginas son " +librosmayor50);

    }

    public static void CambiarSentido(PilaDeLibros pila)  {
        PilaDeLibros aux = new PilaDeLibros(10);
        Libro ultimolibroEliminado = pila.eliminar();
        Libro libroEliminado = null;
        Libro primerLibroEliminado = null;
        while (!pila.esVacio()) {
            aux.adicionar(pila.eliminar());
        }

        primerLibroEliminado = aux.eliminar();
        aux.adicionar(ultimolibroEliminado);
        pila.vaciar(aux);
        pila.adicionar(primerLibroEliminado);
        pila.mostrar();
    }

}
