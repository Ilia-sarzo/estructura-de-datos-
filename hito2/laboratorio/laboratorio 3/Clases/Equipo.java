package Campeonato.Clases;

public class Equipo {
    private  String nombreEquipo;
    private String categoria;
    private Jugador[] jugadores;

    public Equipo(String nombreEquipo, String categoria, Jugador[] jugadores){
        this.nombreEquipo = nombreEquipo;
        this.categoria = categoria;
        this.jugadores = jugadores;
    }


    public Equipo(){}

    public String getNombreEquipo(){
        return this.nombreEquipo;
    }

    public String getCategoria(){
        return this.categoria;
    }

    public Jugador[] getJugadores(){
        return this.jugadores;
    }

    public void setNombreEquipo(String nombreEquipo){

        this.nombreEquipo = nombreEquipo;
    }
    public void setCategoria(String categoria) {

        this.categoria = categoria;
    }
    public void setJugadores(Jugador[] jugadores){

        this.jugadores = jugadores;
    }

    public void mostrarEquipo(){
        System .out.println("\nMostrar datos del Equipo");
        System.out.println("Nombre Equipo:" + this.getNombreEquipo());
        System.out.println("Categoria Equipo:" + this.getCategoria());

        for(int i=0; i < this.getJugadores().length; i++){
            this.getJugadores()[i].mostrarJugador();
        }
    }
}
