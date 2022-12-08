package Proyecto_X;

public class Carrera {
    private String nombreCarrera;
    private int noEstudiantes;
    private Estudiante[] estudiantes;

    public Carrera(String nombreCarrera, int noEstudiantes, Estudiante[] estudiantes) {
        this.nombreCarrera = nombreCarrera;
        this.noEstudiantes = noEstudiantes;
        this.estudiantes = estudiantes;
    }
    public Carrera () {}

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public int getNoEstudiantes() {
        return noEstudiantes;
    }

    public Estudiante[] getEstudiantes() {
        return estudiantes;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public void setNoEstudiantes(int noEstudiantes) {
        this.noEstudiantes = noEstudiantes;
    }

    public void setEstudiantes(Estudiante[] estudiantes) {
        this.estudiantes = estudiantes;
    }

    public void mostrarDepartamento() {
        System.out.println("\nMOSTRANDO DATOS DE LA CARRERA");
        System.out.println("Nombre de la carrera: " + this.getNombreCarrera());
        System.out.println("No de estudiantes: " + this.getNoEstudiantes());
        for (int i=0; i < this.noEstudiantes; i++) {
            this.getEstudiantes()[i].mostrarEstudiante();
        }
    }
}
