package Campeonato.Clases;

import java.util.Scanner;

public class Main3 {
    public static void main(String [] args) {
        Scanner leer = new Scanner(System.in);

        System.out.println("INGRESE DATOS DE JUGADORES");
        String nombreCompleto, apellidos, ci;
        int edad, i, nJugadores = 1;

        System.out.println("INGRESE DATOS DE EQUIPOS");
        String nombreEquipo, categoria;
        int j, nEquipos = 2;

        Equipo[] equipos = new Equipo[nEquipos];

        for (j = 0; j < nEquipos; j = j + 1) {
            System.out.println("Ingrese el nombre del equipo " + (j + 1) + ": ");
            nombreEquipo = leer.next();
            System.out.println("Ingrese la categoria del equipo " + (j + 1) + ": ");
            categoria = leer.next();
            Jugador[] jugadores = new Jugador[nJugadores];
            for (i = 0; i < nJugadores; i = i + 1) {
                System.out.println("Ingrese el nombre del jugador " + (i + 1) + ": ");
                nombreCompleto = leer.next();
                System.out.println("Ingrese el apellidos del jugador " + (i + 1) + ": ");
                apellidos = leer.next();
                System.out.println("Ingrese el CI del jugador " + (i + 1) + ": ");
                ci = leer.next();
                System.out.println("Ingrese edad del jugador " + (i + 1) + ": ");
                edad = leer.nextInt();

                Jugador jug = new Jugador();
                jug.setNombreCompleto(nombreCompleto);
                jug.setApellidos(apellidos);
                jug.setCi(ci);
                jug.setEdad(edad);
                //  Pijamada con el inge

                jugadores[i] = jug;
            }

            Equipo Eq = new Equipo();
            Eq.setNombreEquipo(nombreEquipo);
            Eq.setCategoria(categoria);
            Eq.setJugadores(jugadores);
            //
            equipos[j] = Eq;
        }
        Campeonato Camp1 = new Campeonato("UNIFRANZITOS", equipos);
        Camp1.mostrarCampeonato();

    }
}
