package Hito3.PilaDeCadenas;

public class Main {
    public static void main(String[] args) {
        int i;
        PilaDeCadenas pila1 = new PilaDeCadenas(10);
        pila1.adicionar("William");
        pila1.adicionar("Andres");
        pila1.adicionar("Josias");
        pila1.adicionar("Iris");
        pila1.adicionar("Jonathan");
        pila1.adicionar("Ilia");
        pila1.adicionar("Andres");
        pila1.mostrar();

        //determinarlosPorNombre(pila1, "Andres");
        // AnadirNombre(pila1, "Ana");
        MoverPosicion(pila1, "Josias");
    }

    //Crear un metodo en la clase main que me permita ver cuantos nombres son iguales a Andres

    public static void determinarlosPorNombre(PilaDeCadenas pila1, String nombre) {
        int Nnombres = 0;
        String buscarNombre = "";
        PilaDeCadenas aux = new PilaDeCadenas(10);
        String valorExtraidoDeLaPila = "";

        while (pila1.esVacio() == false) {
            valorExtraidoDeLaPila = pila1.eliminar();
            if(valorExtraidoDeLaPila.equals(buscarNombre)) {
                Nnombres = Nnombres + 1;
            }
            aux.adicionar(valorExtraidoDeLaPila);
        }
        pila1.vaciar(aux);
        System.out.println("La cantidad de nombres es " + Nnombres);
    }
    public static void AnadirNombre(PilaDeCadenas pila1, String nombre) {
        PilaDeCadenas aux = new PilaDeCadenas(10);
        String valorExtraidoDeLaPila = "";

        while (pila1.esVacio() == false) {
            valorExtraidoDeLaPila = pila1.eliminar();
            aux.adicionar(valorExtraidoDeLaPila);
        }
        aux.adicionar(nombre);
        pila1.vaciar(aux);
        pila1.mostrar();
    }
    public static void MoverPosicion(PilaDeCadenas pila1, String kesimo) {
        PilaDeCadenas aux = new PilaDeCadenas(10);
        String valorExtraidoDeLaPila = "";
        while (pila1.esVacio() == false) {
            valorExtraidoDeLaPila = pila1.eliminar();
            if (valorExtraidoDeLaPila != kesimo) {
                aux.adicionar(valorExtraidoDeLaPila);
            }
        }
        pila1.vaciar(aux);
        pila1.adicionar(kesimo);
        pila1.mostrar();
    }
}
