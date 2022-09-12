package Campeonato.Clases;

import java.util.Scanner;

public class Main {

    public static void main(String[] arg) {
        Jugador j1 = new Jugador("Ilia", "Sarzo", "14125434LP", 20);
        Jugador j2 = new Jugador("Josias", "Leon", "10631942Lp", 23);

        Jugador[] jugadores = new Jugador[2];
        jugadores[0] = j1;
        jugadores[1] = j2;

        Jugador h1 = new Jugador("Iris", "Velasco", "13249996Lp", 19);
        Jugador h2 = new Jugador("Andres", "Quiroga", "1412343Lp", 23);

        Jugador[] jugadores2 = new Jugador[2];
        jugadores2[0] = h1;
        jugadores2[1] = h2;

        Equipo eq1 = new Equipo("Always Ready","mujeres",jugadores);
        eq1.mostrarEquipo();

        Equipo eq2 = new Equipo("El Alto FC","varones",jugadores2);

        Equipo[] equipos = new Equipo[2];
        equipos[0] = eq1;
        equipos[1] = eq2;

        Campeonato camp = new Campeonato("Unifranzitos",equipos);
        camp.mostrarCampeonato();

        Scanner leer = new Scanner(System.in);
    }
}
