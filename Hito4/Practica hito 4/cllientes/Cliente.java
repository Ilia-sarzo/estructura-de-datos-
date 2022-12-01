package ColaClientes.cllientes;

public class Cliente {

    private String Nombres;
    private String Apellidos;
    private int Edad;
    private String Pais;
    private String Genero;
    private String tipo;

    public Cliente(String Nombres, String Apellidos, int Edad, String Pais, String Genero, String tipo) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Edad = Edad;
        this.Pais = Pais;
        this.Genero = Genero;
        this.tipo = tipo;

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

    public String getPais() {
        return Pais;
    }

    public String getGenero() {
        return Genero;
    }

    public String getTipo() {
        return tipo;
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

    public void setPais(String pais) {
        Pais = pais;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mostrarCliente() {
        System.out.println("\nMostrando datos del jugador");
        System.out.println("Nombre: " + this.getNombres());
        System.out.println("Apellidos: " + this.getApellidos());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Pais: " + this.getPais());
        System.out.println("Genero: " + this.getGenero());
        System.out.println("Tipo: " + this.getTipo());

        System.out.println("\n");
    }
}
