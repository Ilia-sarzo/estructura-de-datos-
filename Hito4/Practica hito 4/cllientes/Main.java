package ColaClientes.cllientes;

public class Main {
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("Josias", "Leon", 33, "Bolivia", "Masculino", "SILVER");
        Cliente cli2 = new Cliente("Adolf", "Hitler", 56, "Bolivia", "Masculino", "GOLD");
        Cliente cli3 = new Cliente("Alejandra", "Maine", 19, "Chile", "Femenino", "VIP");
        Cliente cli4 = new Cliente("Josef", "Stalin", 74, "Argentina", "Masculino", "GOLD");
        Cliente cli5 = new Cliente("Saul", "Saulero", 42, "Rusia", "Masculino", "VIP");

        ColaClientes Cola = new ColaClientes(100);
        Cola.adicionar(cli1);
        Cola.adicionar(cli2);
        Cola.adicionar(cli3);
        Cola.adicionar(cli4);
        Cola.adicionar(cli5);

        Cliente cli6 = new Cliente("Natalia", "Poklonskaya", 33, "Rusia", "Femenino", "SILVER");
        Cliente cli7 = new Cliente("Adrian", "Fernandez", 56, "Bolivia", "Masculino", "GOLD");
        Cliente cli8 = new Cliente("Leo", "Gallardo", 19, "Chile", "Masculino", "VIP");
        Cliente cli9 = new Cliente("Len", "Bluxen", 74, "Estados Unidos", "Masculino", "GOLD");
        Cliente cli10 = new Cliente("Alice", "Wright", 42, "Canada", "Femenino", "VIP");

        ColaClientes Cola2 = new ColaClientes(100);
        Cola2.adicionar(cli6);
        Cola2.adicionar(cli7);
        Cola2.adicionar(cli8);
        Cola2.adicionar(cli9);
        Cola2.adicionar(cli10);
        //cambiarTipo(Cola, "Bolivia", "GOLD","VIP");
        //MoverClientesMayores(Cola, 60);
        Cambiarcolaclientes(Cola,Cola2, "Saul");
    }


    // En el mes de diciembre a todos los clientes de Bolivia se les dará una promoción
// en cuanto a precios en viajes a nivel nacional.
// A todos los clientes que sean de nacionalidad boliviana y además el tipo
// de cliente GOLD, convertir a estos clientes en VIP
// Es decir si es de Bolivia y es GOLD deberá ser ahora un cliente VIP
// El método estático dentro de la clase MAIN recibe 3 atributos
// La cola de clientes
// El tipo de cliente
// La nacionalidad del cliente
    public static void cambiarTipo(ColaClientes cola, String pais, String tipo,String NewTipo) {
        ColaClientes aux = new ColaClientes(10);
        Cliente Valorextraido = null;
        while (!cola.esVacia()) {
            Valorextraido = cola.eliminar();
            if (Valorextraido.getPais().equals(pais) && Valorextraido.getTipo().equals(tipo)) {
                Valorextraido.setTipo(NewTipo);
                aux.adicionar(Valorextraido);
            }
            aux.adicionar(Valorextraido);
        }
        cola.vaciar(aux);
        cola.mostrar();
    }

    //Determinar cuantos clientes son mayores a 60 años
    public static void MoverClientesMayores(ColaClientes cola, int edadMayor) {
        ColaClientes aux = new ColaClientes(100);
        ColaClientes aux2 = new ColaClientes(100);
        Cliente Valorextraido = null;
        while (!cola.esVacia()) {
            Valorextraido = cola.eliminar();
            if (Valorextraido.getEdad() >= edadMayor) {
                aux2.adicionar(Valorextraido);
            }
            aux.adicionar(Valorextraido);
        }
        cola.vaciar(aux2);
        cola.vaciar(aux);
        cola.mostrar();
    }


    public static void Cambiarcolaclientes(ColaClientes colaA, ColaClientes colaB,String Nombre) {
        int nroElemColaA = colaA.nroElem();
        int nroElemColaB = colaB.nroElem();
        ColaClientes aux = new ColaClientes(100);
        ColaClientes aux2 = new ColaClientes(100);

        Cliente valorEliminado = null;
        for (int i = 1; i <= nroElemColaA; i++) {
            valorEliminado = colaA.eliminar();
            if (valorEliminado.getNombres().equals(Nombre)) {
                colaB.adicionar(valorEliminado);
            } else {
                colaA.adicionar(valorEliminado);
            }
        }
        for (int i = 1; i <= nroElemColaB; i++) {
            valorEliminado = colaB.eliminar();
            if (valorEliminado.getNombres().equals(Nombre)) {
                colaB.adicionar(valorEliminado);
            } else {
                aux2.adicionar(valorEliminado);
            }
        }
        colaA.vaciar(aux);
        colaB.vaciar(aux2);
        colaA.mostrar();
        colaB.mostrar();
    }
}

