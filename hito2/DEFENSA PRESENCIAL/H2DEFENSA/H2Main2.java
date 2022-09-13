package H2DEFENSA;

import java.util.Scanner;

public class H2Main2 {

    public static void main(String [] args) {
        Scanner leer = new Scanner(System.in);

        //Pregunta 4

        String nombreProvincia;
        int i, nProvincias;
        nProvincias = 2;

        String nombreDepartamento;
        int j, nDepartamentos = 2;

        Departamento[] departamentos = new Departamento[100];

        for (j = 0; j < nDepartamentos; j = j + 1) {
            System.out.println("Ingrese el nombre del departamento " + (j + 1) + ": ");
            nombreDepartamento = leer.next();
            System.out.println("Ingrese el numero de provincias");

            Provincia[] provincias = new Provincia[100];

            for (i = 0; i < nProvincias; i = i + 1) {
                System.out.println("Ingrese el nombre de la provincia " + (i + 1) + ": ");
                nombreProvincia = leer.next();

                Provincia prov = new Provincia();
                prov.setNombreProvincia(nombreProvincia);

                provincias[i] = prov;
            }
            System.out.println("Ingrese el nombre de la nueva provincia: ");
            nombreProvincia = leer.next();

            Provincia prov = new Provincia();
            prov.setNombreProvincia(nombreProvincia);

            provincias[nProvincias] = prov;

            Departamento dep = new Departamento();
            dep.setNombreDepartamento(nombreDepartamento);
            dep.setProvincias(provincias);
            dep.setNoProvincias(nProvincias + 1);
            departamentos[j] = dep;
        }

        System.out.println("Ingrese el nombre del nuevo departamento: ");
        nombreDepartamento = leer.next();

        Departamento dep = new Departamento();
        dep.setNombreDepartamento(nombreDepartamento);

        departamentos[nDepartamentos] = dep;
        Pais pais = new Pais("BOLIVIA", nDepartamentos + 1, departamentos);
        pais.mostrarPais();

    }

}
