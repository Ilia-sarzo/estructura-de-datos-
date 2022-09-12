package Campeonato.Clases;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("INGRESE DATOS DE JUGADORES");

        String nombreCompleto1, apellidos1, ci1;
        int edad1;

        System.out.println("Ingrese el nombre del jugador 1: ");
        nombreCompleto1 = leer.next();
        System.out.println("El nombre del jugador es: " + nombreCompleto1);

        System.out.println("Ingrese el apellido del jugador 1: ");
        apellidos1 = leer.next();
        System.out.println("El apellido del jugador es: " + apellidos1);

        System.out.println("Ingrese el ci del jugador 1: ");
        ci1 = leer.next();
        System.out.println("El Ci del jugador es: " + ci1);

        System.out.println("Ingrese la edad del jugador 1: ");
        edad1 = leer.nextInt();
        System.out.println("El edad del jugador es: " + edad1);

        //Jugador jug1 = new Jugador(nombreCompleto1, apellidos1,ci1,edad1);
        //jug1.mostrarJugador();

        Jugador jug1 = new Jugador();
        jug1.setNombreCompleto(nombreCompleto1);
        jug1.setApellidos(apellidos1);
        jug1.setCi(ci1);
        jug1.setEdad(edad1);

        jug1.mostrarJugador();

        String nombreCompleto2, apellidos2, ci2;
        int edad2;

        System.out.println("Ingrese el nombre del jugador 2: ");
        nombreCompleto2 = leer.next();
        System.out.println("El nombre del jugador es: " + nombreCompleto2);

        System.out.println("Ingrese el apellido del jugador 2: ");
        apellidos2 = leer.next();
        System.out.println("El nombre del jugador es: " + apellidos2);

        System.out.println("Ingrese el Ci del jugador 2: ");
        ci2 = leer.next();
        System.out.println("El nombre del jugador es: " + ci2);

        System.out.println("Ingrese la edad del jugador 2: ");
        edad2 = leer.nextInt();
        System.out.println("El nombre del jugador es: " + edad2);


        Jugador jug2 = new Jugador();
        jug2.setNombreCompleto(nombreCompleto2);
        jug2.setApellidos(apellidos2);
        jug2.setCi(ci2);
        jug2.setEdad(edad2);

        jug2.mostrarJugador();
    }
}
