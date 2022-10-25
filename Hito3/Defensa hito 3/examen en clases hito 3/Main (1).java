package Defensa_Pilas_Hito3;

public class Main {
    public static void main(String[] arg) {
        Estudiante est1 = new Estudiante("Micaela", "Sarzo", 20, "La Paz", 70, "14125434");
        Estudiante est2 = new Estudiante("Jose", "Velasco", 24, "Cochabamba", 88, "234534");
        Estudiante est3 = new Estudiante("Josia", "Leon", 21, "El Alto", 45, "14125434");
        Estudiante est4 = new Estudiante("kevin", "mamani", 19, "El Alto", 51, "13154546");
        Estudiante est5 = new Estudiante("Andres", "Quiroga", 19, "La Paz", 51, "13154546");

        PilaDeEstudiante pila = new PilaDeEstudiante(10);
        pila.adicionar(est1);
        pila.adicionar(est2);
        pila.adicionar(est3);
        pila.adicionar(est4);
        pila.adicionar(est5);

        // pila.mostrar();
         Aprovado(pila,51);
        //  kesimo(pila,2);
        //menornota(pila, 51);
        //mostraraprovados(pila, );
    }
    // determinar cuantos estudiantes de la sede El Alto APROVARON

    public static void Aprovado(PilaDeEstudiante pila, int notaAprovada) {
        PilaDeEstudiante aux = new PilaDeEstudiante(10);
        Estudiante valor = null;
        int mayores = 0;

        while (!pila.esVacio()) {
            valor = pila.eliminar();
            if (valor.getSede() == valor.getSede() & valor.getNotaFinal()  >=  notaAprovada) {
                mayores = mayores + 1;

            }
            aux.adicionar(valor);
        }
        System.out.println("cantidad  de estudiantes mayor a 51 es: " + mayores);
    }

    // K-esimo
    public static void kesimo(PilaDeEstudiante pila, int valorTope) {
        PilaDeEstudiante aux = new PilaDeEstudiante(10);
        Estudiante valor = null;

        while (pila.esVacio() == false) {
            if (pila.nroElem() != valorTope) {
                aux.adicionar(pila.eliminar());
            } else {
                valor = pila.eliminar();
            }
        }
        pila.vaciar(aux);
        pila.adicionar(valor);
        pila.mostrar();
    }

    // mover a la base el menor notadel  estudiante

    public static void menornota(PilaDeEstudiante pila, int valorTope) {
        PilaDeEstudiante aux = new PilaDeEstudiante(10);
        Estudiante valor = null;
        int menor = 0;


        while (pila.esVacio()) {
            valor = pila.eliminar();

            if (valor.getNotaFinal() < valorTope) {
                menor = menor + 1;
            }
            aux.adicionar(valor);
        }

        while (pila.esVacio() == false) {
            if (pila.nroElem() != valorTope) {
                aux.adicionar(pila.eliminar());
            } else {
                valor = pila.eliminar();
            }
            pila.vaciar(aux);
            System.out.println("cantidad menor a 51 es: " + menor);
        }

        pila.vaciar(aux);
        pila.adicionar(valor);
        pila.mostrar();
    }

    public static void mostraraprovados(PilaDeEstudiante pila,String reacomodar){
        PilaDeEstudiante aux1 = new PilaDeEstudiante(10);
        PilaDeEstudiante aux2 = new PilaDeEstudiante(10);
        Estudiante valor = null;

        while (!pila.esVacio()){
            valor = pila.eliminar();
            if (valor.getNotaFinal() != "51"){
                aux1.adicionar(valor);

            }
            else{
                aux2.adicionar(valor);

            }

            pila.vaciar(aux1);
            pila.vaciar(aux2);
            pila.mostrar();
        }
    }

}

