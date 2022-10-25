package Hito3;

public class Main {
    public static void main(String [] args) {
        int i;
        PilaNumeros pila1 = new PilaNumeros(10);
        pila1.adicionar(4);
        pila1.adicionar(5);
        pila1.adicionar(23);
        pila1.adicionar(7);
        pila1.adicionar(12);

       // pila1.mostrar();
        //muestraNumeroMayor(pila1);
        // muestraNumeroMenor(pila1);
        // NumerosPares(pila1);
        //MoverPosicion(pila1, 5);
        AnadirNumero(pila1, 100);

    }

    public static void muestraNumeroMayor(PilaNumeros pila){
        PilaNumeros aux = new PilaNumeros(10);
        int mayor = -1;
        int valorExtraidoDeLaPila = 0;

        while (pila.esVacio() == false) {
            valorExtraidoDeLaPila = pila.eliminar();
            if (valorExtraidoDeLaPila > mayor) {
                mayor = valorExtraidoDeLaPila;
            }
            aux.adicionar(valorExtraidoDeLaPila);
        }
        pila.vaciar(aux);
        System.out.println("El numero mayor de la pila es: " + mayor);
    }

    public static void muestraNumeroMenor(PilaNumeros pila) {
        PilaNumeros aux = new PilaNumeros(10);
        int menor = 100;
        int valorExtraidoDeLaPila = 0;

        while (pila.esVacio() == false) {
            valorExtraidoDeLaPila = pila.eliminar();
            if (valorExtraidoDeLaPila < menor) {
                menor = valorExtraidoDeLaPila;
            }
            aux.adicionar(valorExtraidoDeLaPila);
        }
        pila.vaciar(aux);
        System.out.println("El numero menor de la pila es: " + menor);
    }
    public static void NumerosPares(PilaNumeros pila) {
        PilaNumeros aux = new PilaNumeros(10);
        int NumerosPares = 0;
        int NumerosImpares = 0;
        int valorExtraidoDeLaPila = 0;
        while (pila.esVacio() == false) {
            valorExtraidoDeLaPila = pila.eliminar();
            if (valorExtraidoDeLaPila % 2 == 0) {
                NumerosPares = NumerosPares + 1;
            } else {
                NumerosImpares = NumerosImpares + 1;
            }
            aux.adicionar(valorExtraidoDeLaPila);
        }
        pila.vaciar(aux);
        System.out.println("Numeros pares: " + NumerosPares);
        System.out.println("Numeros impares: " + NumerosImpares);
    }
    public static void MoverPosicion(PilaNumeros pila, int elemento)  {
        PilaNumeros aux = new PilaNumeros(10);
        int valorExtraidoDeLaPila = 0;
        while (pila.esVacio() == false) {
            valorExtraidoDeLaPila = pila.eliminar();
            if (valorExtraidoDeLaPila !=  elemento) {
                aux.adicionar(valorExtraidoDeLaPila);
            }
        }
        pila.vaciar(aux);
        pila.adicionar(elemento);
        pila.mostrar();
    }

    public static void AnadirNumero(PilaNumeros pila, int elemento) {
        PilaNumeros aux = new PilaNumeros(10);
        int valorExtraidoDeLaPila = 0;
        while (pila.esVacio() == false) {
            valorExtraidoDeLaPila = pila.eliminar();
            aux.adicionar(valorExtraidoDeLaPila);
        }
        aux.adicionar(100);
        pila.vaciar(aux);
        pila.mostrar();
    }

}

