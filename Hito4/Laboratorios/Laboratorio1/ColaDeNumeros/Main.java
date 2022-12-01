package Colas.ColaDeNumeros;

public class Main {
    public static void main(String [] args) {
        int i;
        Numeros Num = new Numeros(100);
        Num.adicionar(10);
        Num.adicionar(100);
        Num.adicionar(200);
        Num.adicionar(400);
        Num.adicionar(500);
        Num.mostrar();
        mostrarNumeroMenor(Num);
    }
    public static void mostrarNumeroMenor(Numeros cola) {
        Numeros aux = new Numeros(10);
        int menor = 1000;
        int Valor = 0;

        while (cola.esVacia() == false) {
            Valor = cola.eliminar();
            if (Valor < menor) {
                menor = Valor;
            }
            aux.adicionar(Valor);
        }
        cola.vaciar(aux);
        System.out.println("El numero mayor de la cola es: " + menor);
    }
}
