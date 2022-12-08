package Proyecto_X;

import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Colas de estudiantes
        Estudiante cli1 = new Estudiante("Josias", "Leon", 33, "Tercero", "Masculino");
        Estudiante cli2 = new Estudiante("Adolf", "Hitler", 56, "Quinto", "Masculino");
        Estudiante cli3 = new Estudiante("Alejandra", "Maine", 19, "Segundo", "Femenino");
        Estudiante cli4 = new Estudiante("Josef", "Stalin", 74, "Quinto", "Masculino");
        Estudiante cli5 = new Estudiante("Saul", "Saulero", 22, "Primero", "Masculino");

        ColaEstudiantes Cola = new ColaEstudiantes(100);
        Cola.adicionar(cli1);
        Cola.adicionar(cli2);
        Cola.adicionar(cli3);
        Cola.adicionar(cli4);
        Cola.adicionar(cli5);

        Estudiante cli6 = new Estudiante("Natalia", "Poklonskaya", 22, "Segundo", "Femenino");
        Estudiante cli7 = new Estudiante("Adrian", "Fernandez", 23, "Quinto", "Masculino");
        Estudiante cli8 = new Estudiante("Leo", "Gallardo", 24, "Septimo", "Masculino");
        Estudiante cli9 = new Estudiante("Len", "Bluxen", 20, "Cuarto", "Masculino");
        Estudiante cli10 = new Estudiante("Alice", "Wright", 19, "Segundo", "Femenino");

        ColaEstudiantes Cola2 = new ColaEstudiantes(100);
        Cola2.adicionar(cli6);
        Cola2.adicionar(cli7);
        Cola2.adicionar(cli8);
        Cola2.adicionar(cli9);
        Cola2.adicionar(cli10);

        Estudiante cli11 = new Estudiante("Ilia", "Sarzo", 20, "Tercero", "Femenino");
        Estudiante cli12 = new Estudiante("Andres", "Quiroga", 172, "Tercero", "Masculino");
        Estudiante cli13 = new Estudiante("Marco", "Calle", 19, "Cuarto", "Masculino");
        Estudiante cli14 = new Estudiante("Iris", "Velasco", 5, "Octavo", "Femenino");
        Estudiante cli15 = new Estudiante("Cristian", "Machicado", 42, "Quinto", "Masculino");

        ColaEstudiantes Cola3 = new ColaEstudiantes(100);
        Cola3.adicionar(cli11);
        Cola3.adicionar(cli12);
        Cola3.adicionar(cli13);
        Cola3.adicionar(cli14);
        Cola3.adicionar(cli15);

        Estudiante cli16 = new Estudiante("Pepe", "Mamani", 25, "Cuarto", "Masculino");
        Estudiante cli17 = new Estudiante("Armando", "Casas", 17, "Tercero", "Masculino");
        Estudiante cli18 = new Estudiante("Domingo", "Calisaya", 21, "Sexto", "Masculino");
        Estudiante cli19 = new Estudiante("Roberta", "Siñani", 25, "Septimo", "Femenino");
        Estudiante cli20 = new Estudiante("Emma", "Stone", 22, "Tercero", "Femenino");

        ColaEstudiantes Cola4 = new ColaEstudiantes(100);
        Cola4.adicionar(cli16);
        Cola4.adicionar(cli17);
        Cola4.adicionar(cli18);
        Cola4.adicionar(cli19);
        Cola4.adicionar(cli20);

        //Pilas de Libros
        Libro li1 = new Libro("Boulevard","Flor",300,131,"Novela");
        Libro li2 = new Libro("la fabula de Esopo","anonimo",150,512,"Cuentos");
        Libro li3 = new Libro("Geografia","Santillan",400,842,"Educativo");
        Libro li4 = new Libro("Guerra y paz","Leon toistoi",244,312,"Novela");
        Libro li5 = new Libro("Don Quijote","Miguel Servantes",300,122,"Novela");

        PilaDeLibros estante1 = new PilaDeLibros(100);

        estante1.adicionar(li1);
        estante1.adicionar(li2);
        estante1.adicionar(li3);
        estante1.adicionar(li4);
        estante1.adicionar(li5);

        Libro li6 = new Libro("Kamasutra","Bráhmana Vatsiaiana",200,2469,"Cuentos");
        Libro li7 = new Libro("Kamehasutra","Pandora's Box",150,443,"Cuentos");
        Libro li8 = new Libro("La caja de Pandora","Pablo Riba",164,746,"Educativo");
        Libro li9 = new Libro("Luna de Plutón","Angel David Revilla",472,464,"Novela");
        Libro li10 = new Libro("Anatomia Humana","Frank H",300,263,"Educativo");

        PilaDeLibros estante2 = new PilaDeLibros(100);

        estante2.adicionar(li6);
        estante2.adicionar(li7);
        estante2.adicionar(li8);
        estante2.adicionar(li9);
        estante2.adicionar(li10);

        Libro li11 = new Libro("El gato negro","Edgar Allan Poe",288,659,"Novela");
        Libro li12 = new Libro("It","Stephen King",200,575,"Terror");
        Libro li13 = new Libro("Romeo y Julieta","Shakespeare",200,646,"Novela");
        Libro li14 = new Libro("Free Sex","Carlos Cuautemoc Sanchez",152,652,"Educativo");
        Libro li15 = new Libro("Sangre de Campeon","Carlos Cuautemoc Sanchez",200,444,"Novela");

        PilaDeLibros estante3 = new PilaDeLibros(100);

        estante3.adicionar(li11);
        estante3.adicionar(li12);
        estante3.adicionar(li13);
        estante3.adicionar(li14);
        estante3.adicionar(li15);

        Libro li16 = new Libro("Tempestad en la cordillera","Walter Guevara Arce",100,564,"Novela");
        Libro li17 = new Libro("Perdon a la lluvia","Sara Buho",100,534,"Poesia");
        Libro li18 = new Libro("Biblia","varios",600,7777777,"Historico");
        Libro li19 = new Libro("Hamlet","Shakespeare",300,746,"Novela");
        Libro li20 = new Libro("Energia en Bolivia","Anonimo",10,563,"Informativo");

        PilaDeLibros estante4 = new PilaDeLibros(100);

        estante4.adicionar(li16);
        estante4.adicionar(li17);
        estante4.adicionar(li18);
        estante4.adicionar(li19);
        estante4.adicionar(li20);

        //kEsimo
        //CambiarSentido
        //anadirLibro(estante3);
        //cambiarColaEstudiantes(Cola,Cola2,"Quinto","Segundo");
        organizarLibros(estante1,estante2,"Novela","Educativo");

    }

    public static void kEsimoCliente(PilaDeLibros pila, int valorTope){
        PilaDeLibros aux = new PilaDeLibros(10);
        Libro valor = null;

        while (!pila.esVacio()){
            if (pila.nroElem() != valorTope){
                aux.adicionar(pila.eliminar());
            }
            else {
                valor = pila.eliminar();
            }
        }
        pila.vaciar(aux);
        pila.adicionar(valor);
        pila.mostrar();
    }

    public static void CambiarSentido(PilaDeLibros pila) {
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

    public static void  anadirLibro(PilaDeLibros pila){
        Scanner leer = new Scanner(System.in);
        System.out.println("INGRESE EL NUEVO LIBRO");
        System.out.println("ingrese el titulo del libro: ");
        String titulo = leer.nextLine();
        System.out.println("ingrese el autor del libro: ");
        String autor = leer.nextLine();
        System.out.println("ingrese el numero de paginas del libro: ");
        int nroPag = Integer.parseInt(leer.next());
        System.out.println("ingrese el codigo del libro: ");
        int CodigoLibro = Integer.parseInt(leer.next());
        System.out.println("ingrese la categoria del libro: ");
        String categoria = leer.next();

        Libro nuevolibro = new Libro(titulo,autor,nroPag,CodigoLibro,categoria);
        pila.adicionar(nuevolibro);
        pila.mostrar();
    }

    //Este método sirve para ordenar de mejor forma a los estudiantes de las colas, al ordenarlos por semestre
    public static void cambiarColaEstudiantes(ColaEstudiantes cola1, ColaEstudiantes cola2,String Semestre1,String Semestre2) {
        int nroElemColaA = cola1.nroElem();
        int nroElemColaB = cola2.nroElem();
        ColaEstudiantes aux = new ColaEstudiantes(100);
        ColaEstudiantes aux2 = new ColaEstudiantes(100);

        Estudiante valorEliminado = null;
        for (int i = 1; i <= nroElemColaA; i++) {
            valorEliminado = cola1.eliminar();
            if (valorEliminado.getSemestre().equals(Semestre1)) {
                cola2.adicionar(valorEliminado);
            } else {
                aux.adicionar(valorEliminado);
            }
        }
        for (int i = 1; i <= nroElemColaB; i++) {
            valorEliminado = cola2.eliminar();
            if (valorEliminado.getSemestre().equals(Semestre2)) {
                cola1.adicionar(valorEliminado);
            } else {
                aux2.adicionar(valorEliminado);
            }
        }
        cola1.vaciar(aux);
        cola2.vaciar(aux2);
        cola1.mostrar();
        cola2.mostrar();
    }

    public static void organizarLibros(PilaDeLibros pila1, PilaDeLibros pila2, String Categoria1,String Categoria2) {
        int nrodeLibro1 = pila1.nroElem();
        int nrodeLibro2 = pila2.nroElem();
        PilaDeLibros aux = new PilaDeLibros(100);
        PilaDeLibros aux2 = new PilaDeLibros(100);

        Libro valorEliminado = null;
        for (int i = 1; i <= nrodeLibro1; i++) {
            valorEliminado = pila1.eliminar();
            if (valorEliminado.getCategoria().equals(Categoria2)) {
                pila2.adicionar(valorEliminado);
            } else {
                aux.adicionar(valorEliminado);
            }
        }
        for (int i = 1; i <= nrodeLibro2; i++) {
            valorEliminado = pila2.eliminar();
            if (valorEliminado.getCategoria().equals(Categoria1)) {
                pila1.adicionar(valorEliminado);
            } else {
                aux2.adicionar(valorEliminado);
            }
        }
        pila1.vaciar(aux);
        pila2.vaciar(aux2);

        pila1.mostrar();
        pila2.mostrar();
    }

    //cambiar datos de un estudiante de una cola a otra

    public static void cambiarDatos ( ColaEstudiantes cola1, ColaEstudiantes cola2 ) {
        Estudiante estudiante = cola1.eliminar();
        cola2.adicionar(estudiante);
        cola1.mostrar();
        cola2.mostrar();
    }

    //crear un metodo que elimine un libro por su posicion
    //recibe como parametro el estante y la posicion del libro a eliminar

    public static void eliminarLibro ( PilaDeLibros estante, int posicion ) {
        PilaDeLibros aux = new PilaDeLibros(10);
        Libro libro = null;
        while (!estante.esVacio()) {
            libro = estante.eliminar();
            if (estante.nroElem() != posicion) {
                aux.adicionar(libro);
            }
        }
        estante.vaciar(aux);
        estante.mostrar();
    }

    //crear un metodo que elija un libro al azar de un estante
    //recibe como parametro el estante y retorna el libro elegido

    public static Libro libroAlAzar ( PilaDeLibros estante ) {
        Random random = new Random();
        int posicion = random.nextInt(estante.nroElem());
        PilaDeLibros aux = new PilaDeLibros(10);
        Libro libro = null;
        while (!estante.esVacio()) {
            libro = estante.eliminar();
            if (estante.nroElem() != posicion) {
                aux.adicionar(libro);
            }
        }
        estante.vaciar(aux);
        return libro;
    }

    //metodo que elimina el ultimo estudiante de la cola
    public static void eliminarUltimoEstudiante ( ColaEstudiantes cola ) {
        ColaEstudiantes aux = new ColaEstudiantes(10);
        Estudiante estudiante = null;
        while (!cola.esVacia()) {
            estudiante = cola.eliminar();
            if (!cola.esVacia()) {
                aux.adicionar(estudiante);
            }
        }
        cola.vaciar(aux);
        cola.mostrar();
    }


    //crear un metodo que busque libros por su categoria
    //y muestre el numero de libros que hay en el estante

    public static void buscarLibrosPorCategoria ( PilaDeLibros estante, String categoria ) {
        PilaDeLibros aux = new PilaDeLibros(10);
        Libro libro = null;
        int contador = 0;
        while (!estante.esVacio()) {
            libro = estante.eliminar();
            if (libro.getCategoria().equals(categoria)) {
                contador++;
            }
            aux.adicionar(libro);
        }
        estante.vaciar(aux);
        System.out.println("Hay " + contador + " libros de la categoria " + categoria);
    }

    //crear un metodo que busque libros por su autor
    //y muestre el numero de libros que hay en el estante

    public static void buscarLibrosPorAutor ( PilaDeLibros estante, String autor ) {
        PilaDeLibros aux = new PilaDeLibros(10);
        Libro libro = null;
        int contador = 0;
        while (!estante.esVacio()) {
            libro = estante.eliminar();
            if (libro.getAutor().equals(autor)) {
                contador++;
            }
            aux.adicionar(libro);
        }
        estante.vaciar(aux);
        System.out.println("Hay " + contador + " libros del autor " + autor);
    }

}