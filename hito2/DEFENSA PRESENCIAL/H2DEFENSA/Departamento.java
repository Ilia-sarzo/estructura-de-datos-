package H2DEFENSA;

public class Departamento {
    private String nombreDepartamento;
    private int noProvincias;
    private Provincia[] provincias;

    public Departamento(String nombreDepartamento, int noProvincias, Provincia[] provincias) {
        this.nombreDepartamento = nombreDepartamento;
        this.noProvincias = noProvincias;
        this.provincias = provincias;
    }
    public Departamento () {}
    public String getNombreDepartamento() {
        return this.nombreDepartamento;
    }
    public Provincia[] getProvincias() {
        return this.provincias;
    }

    public int getNoProvincias() {
        return noProvincias;
    }

    public void setNoProvincias(int noProvincias) {
        this.noProvincias = noProvincias;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }

    public void setProvincias(Provincia[] provincias) {
        this.provincias = provincias;
    }

    public void mostrarDepartamento() {
        System.out.println("\nMOSTRANDO DATOS DEL DEPARTAMENTO");
        System.out.println("Nombre Departamento: " + this.getNombreDepartamento());
        System.out.println("No Provincias: " + this.noProvincias);
        for (int i=0; i < this.noProvincias; i++) {
            this.getProvincias()[i].mostrarProvincia();
        }
    }
}
