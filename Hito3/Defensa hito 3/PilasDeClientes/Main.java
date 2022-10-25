package PilasDeClientes;

public class Main {
    public static void main( String[] arg){
        Cliente cli1 = new Cliente("Micaela", "Romero", 20, "LaPaz", "Femenino");
        Cliente cli2 = new Cliente("Iris", "Velasco", 19, "Cochabamba", "Femenino");
        Cliente cli3 = new Cliente("Miguel", "Estrada", 23, "Oruro", "Masculino");
        Cliente cli4 = new Cliente("Andres", "Quiroga", 22, "LaPaz", "Masculino");
        Cliente cli5 = new Cliente("Josias", "Leon", 21, "Tarija", "Masculino");


        PilaCliente pila = new PilaCliente(10);
        pila.adicionar(cli1);
        pila.adicionar(cli2);
        pila.adicionar(cli3);
        pila.adicionar(cli4);
        pila.adicionar(cli5);

        //pila.mostrar();
      //MayorCiertaEdad(pila,20);
        //kEsimoPosicion(pila,3);
        asignaDireccion(pila,"Santa Cruz");





    }
    // determinar cuantos clientes son mayores de 20 años
    public static void MayorCiertaEdad(PilaCliente pila, int edadMayor){
        PilaCliente aux = new PilaCliente(10);
        int MayorEdad = 0;
        Cliente Valorestraido = null;
        while (pila.esVacio() == false){
            Valorestraido = pila.eliminar();
            if (Valorestraido.getEdad() > edadMayor){
                MayorEdad = MayorEdad +1;
            }
            aux.adicionar(Valorestraido);
        }
        System.out.println("Clientes de mas de " + edadMayor + "son: " + MayorEdad);
    }

    public static void kEsimoPosicion(PilaCliente pila, int valorTope){
        PilaCliente aux = new PilaCliente(10);
        Cliente valor = null;

        while (pila.esVacio() == false){
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
    // calbiar la direccion de algunos clientes de la pila

     public static void asignaDireccion (PilaCliente pila, String nuevaDireccion) {
        PilaCliente aux = new PilaCliente(10);
        Cliente valor = null;
        while (!pila.esVacio()) {
            valor = pila.eliminar();
            if(valor.getGenero() == "Femenino"){
                valor.setDireccion(nuevaDireccion);
                aux.adicionar(valor);
            }
            else{
                aux.adicionar(valor);
            }
        }
         pila.vaciar(aux);
         pila.adicionar(valor);
         pila.mostrar();
     }
     // Mover ITEMS de la Pila

    public static void reordenaPila(PilaCliente pila,String reacomodar){
        PilaCliente aux1 = new PilaCliente(10);
        PilaCliente aux2 = new PilaCliente(10);
        Cliente valor = null;

        while (!pila.esVacio()){
            valor = pila.eliminar();
            if (valor.getGenero() != "Femenino"){
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
