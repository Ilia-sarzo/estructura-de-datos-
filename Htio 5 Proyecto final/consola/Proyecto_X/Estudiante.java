package Proyecto_X;

public class Estudiante {
    private String Nombres;
    private String Apellidos;
    private int Edad;
    private String Semestre;
    private String Genero;

    public Estudiante(String Nombres, String Apellidos, int Edad, String Semestre, String Genero) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.Semestre = Semestre;
        this.Genero = Genero;

    }



    public String getNombres() {
        return Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public int getEdad() {
        return Edad;
    }

    public String getSemestre() {
        return Semestre;
    }

    public String getGenero() {
        return Genero;
    }


    public void setNombres(String nombres) {
        Nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public void setSemestre(String semestre) {
        Semestre = semestre;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }


    public void mostrarEstudiante() {
        System.out.println("\nMostrando datos del estudiante");
        System.out.println("Nombre: " + this.getNombres());
        System.out.println("Apellidos: " + this.getApellidos());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Semestre: " + this.getSemestre());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("\n");
    }

}

