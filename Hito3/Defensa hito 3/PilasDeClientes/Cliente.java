package PilasDeClientes;

public class Cliente {
    private String nombre;
    private String apellidos;
    private int edad;
    private String direccion;
    private String genero;

    public Cliente(String nombre, String apellidos, int edad, String direccion, String genero){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = direccion;
        this.genero = genero;

    }
    public Cliente(){
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
        this.direccion = "";
        this.genero = "";
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public int getEdad() {
        return this.edad;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void mostrarCliente(){
        System.out.println("\nMostrando datos del jugador");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellidos: " + this.getApellidos());
        System.out.println("Edad " + this.getEdad());
        System.out.println("Direcccion: " + this.getDireccion());
        System.out.println("Genero: " + this.getGenero());

        System.out.println("\n");
    }
}
