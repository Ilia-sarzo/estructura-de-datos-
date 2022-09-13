package H2DEFENSA;

public class Provincia {
    private String NombreProvincia;

    public Provincia (String NombreProvincia) {
        this.NombreProvincia = NombreProvincia;
    }
    public Provincia() {
        this.NombreProvincia = "";
    }
    public void setNombreProvincia(String NuevoNombre) {
        NombreProvincia = NuevoNombre;
    }
    public String getNombreProvincia() {
        return this.NombreProvincia;
    }
    public void mostrarProvincia() {
        System.out.println("Mostrando datos de la provincia");
        System.out.println("Nombre Provincia: " + this.getNombreProvincia());
        System.out.println("\n");
    }

}
