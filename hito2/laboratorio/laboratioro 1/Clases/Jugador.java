package Campeonato.Clases;

public class Jugador {

        private String apellidos;
        private String ci;
        private int edad;
        private String nombreCompleto;

        public Jugador(String nombreCompleto, String apellidos, String ci, int edad) {
            this.nombreCompleto = nombreCompleto;
            this.apellidos = apellidos;
            this.ci = ci;
            this.edad = edad;
        }
        // para determinar los parametros
        public Jugador() {
        this.nombreCompleto = "";
        this.apellidos = "";
        this.ci = "";
        this.edad = 0;
        }

        public String getNombreCompleto(){
            return this.nombreCompleto;
        }

        public String getApellidos(){
            return this.apellidos;
        }

        public String getCi(){
            return this.ci;
        }

        public int getEdad(){
            return this.edad;
        }

        public void setNombreCompleto(String nuevonombreCompleto){
            this.nombreCompleto = nuevonombreCompleto;
        }

        public void setApellidos(String nuevoapellido){
            this.apellidos = nuevoapellido;
        }

        public void setCi(String nuevoCi){
            this.ci =nuevoCi;
        }

        public void setEdad(int nuevaedad){
            this.edad = nuevaedad;
        }

        public void mostrarJugador(){
            System.out.println("\nMostrar datos del Jugador");
            System.out.println("Nombre jugador: " + this.getNombreCompleto());
            System.out.println("Apellidos Jugador: " + this.getApellidos());
            System.out.println("Ci Jugador" + this.getCi());
            System.out.println("Edad Jugador" + this.getEdad());
        }
    }


