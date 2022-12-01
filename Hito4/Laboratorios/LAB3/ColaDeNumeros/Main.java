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
        // moverMenorValor(Num);
        // moverMayorValor(Num);
        EliminarRepetidos(Num);
    }
    public static int mostrarNumeroMenor(Numeros cola) {
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
        return menor;
    }
    public static void moverMenosValor(Numeros cola){
        int valorMenor = mostrarNumeroMenor(cola);
        int valorEliminado;

        System.out.println("Menor valor: " + valorMenor);
        Numeros aux = new Numeros(100);
        while (!cola.esVacia()) {
            valorEliminado = cola.eliminar();
            if (valorMenor != valorEliminado){
                aux.adicionar(valorEliminado);
            }
        }
        cola.adicionar(valorMenor);
        cola.vaciar(aux);
        cola.mostrar();
    }
    public static int mostrarNumeroMayor (Numeros cola) {
        Numeros aux = new Numeros(10);
        int Mayor = cola.eliminar();
        int Valor;
        aux.adicionar(Mayor);
        while (!cola.esVacia()) {
            Valor = cola.eliminar();
            if (Valor > Mayor) {
                Mayor = Valor;
            }
            aux.adicionar(Valor);
        }
        cola.vaciar(aux);
        return Mayor;
    }

    public static void moverMayorValor(Numeros cola) {
        int valorMayor = mostrarNumeroMayor(cola);
        int valorEliminado;

        System.out.println("Mayor valor: " + valorMayor);
        Numeros aux = new Numeros(100);
        while (!cola.esVacia()) {
            valorEliminado = cola.eliminar();
            if (valorMayor != valorEliminado) {
                aux.adicionar(valorEliminado);
            }
        }
        cola.vaciar(aux);
        cola.adicionar(valorMayor);
        cola.mostrar();
    }

    public static void EliminarRepetidos(Numeros cola) {
        int elemento = cola.eliminar();
        int elemigual;
        int h;
        Numeros aux = new Numeros(100);
        while (!cola.esVacia()) {
            elemigual = cola.eliminar();
            if (elemento != elemigual) {
                aux.adicionar(elemigual);
                elemento = elemigual;
            } else {
                elemento = cola.eliminar();
            }
        }

        cola.vaciar(aux);
        cola.mostrar();
    }

    public static void moverMenorValor(Numeros cola){
        int valorMenor = mostrarNumeroMenor(cola);
        int valorEliminado;

        System.out.println("Menor valor: " + valorMenor);
        Numeros aux = new Numeros(100);
        while (!cola.esVacia()) {
            valorEliminado = cola.eliminar();
            if (valorMenor != valorEliminado){
                aux.adicionar(valorEliminado);
            }
        }
        cola.adicionar(valorMenor);
        cola.vaciar(aux);
        cola.mostrar();
    }
    public static int mostrarNumeroMayor(Numeros cola) {
        Numeros aux = new Numeros(10);
        int Mayor = cola.eliminar();
        int Valor;
        aux.adicionar(Mayor);
        while (!cola.esVacia()) {
            Valor = cola.eliminar();
            if (Valor > Mayor) {
                Mayor = Valor;
            }
            aux.adicionar(Valor);
        }
        cola.vaciar(aux);
        return Mayor;
    }

    public static void moverMayorValor(Numeros cola) {
        int valorMayor = mostrarNumeroMayor(cola);
        int valorEliminado;

        System.out.println("Mayor valor: " + valorMayor);
        Numeros aux = new Numeros(100);
        while (!cola.esVacia()) {
            valorEliminado = cola.eliminar();
            if (valorMayor != valorEliminado) {
                aux.adicionar(valorEliminado);
            }
        }
        cola.vaciar(aux);
        cola.adicionar(valorMayor);
        cola.mostrar();
    }

    public static void EliminarRepetidos(Numeros cola) {
        int elemento = cola.eliminar();
        int elemigual;
        int h;
        Numeros aux = new Numeros(100);
        while (!cola.esVacia()) {
            elemigual = cola.eliminar();
            if (elemento != elemigual) {
                aux.adicionar(elemigual);
                elemento = elemigual;
            } else {
                elemento = cola.eliminar();
            }
        }

        cola.vaciar(aux);
        cola.mostrar();
    }

    public static void eliminaRepetidosV2(Numeros cola){
        int Valor = 0;
        int nroElementos = cola.nroElem();
        int i;

        for (i=1; i<=nroElementos; i++) {
            Valor = cola.eliminar();
            System.out.println("Cola Valor: " + Valor);
            cola.adicionar(Valor);
        }
        cola.mostrar();
    }

    public static void eliminaRepetidosV3(Numeros cola){
        int Valor = 0;
        int nroElementos = cola.nroElem();
        int i;

        for (i=1; i<=nroElementos; i++) {
            Valor = cola.eliminar();
            if (!verificaSiExisteUnoMas(Valor, cola)) {
                cola.adicionar(Valor);
            }
        }
        cola.mostrar();
    }

    public static boolean verificaSiExisteUnoMas(int numeroBuscar, Numeros cola){
        int ValorExtraido;
        int nroElementos = cola.nroElem();
        int i;
        int repetidos = 0;
        for (i=1;i<=nroElementos;i++){
            ValorExtraido = cola.eliminar();
            if (numeroBuscar == ValorExtraido){
                repetidos = repetidos + 1;
            } else {
                cola.adicionar(ValorExtraido);
            }
        }
        if (repetidos > 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void intercambiaMax(Numeros colaA, Numeros colaB) {

        int maxColaA = mostrarNumeroMayor(colaA);
        int maxColaB = mostrarNumeroMayor(colaB);

        int nroElemColaA = colaA.nroElem();
        int nroElemColaB = colaB.nroElem();

        int valorEliminado;

        for (int i = 1; i <= nroElemColaA; i++) {
            valorEliminado = colaA.eliminar();
            if (valorEliminado == maxColaA) {
                colaA.adicionar(maxColaB);
            } else {
                colaA.adicionar(valorEliminado);
            }
        }
        for (int i = 1; i <= nroElemColaB; i++) {
            valorEliminado = colaB.eliminar();
            if (valorEliminado == maxColaB) {
                colaB.adicionar(maxColaA);
            } else {
                colaB.adicionar(valorEliminado);
            }
        }
        colaA.mostrar();
        colaB.mostrar();

    }
}
