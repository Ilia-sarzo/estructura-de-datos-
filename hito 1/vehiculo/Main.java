package ejercicio_1;

public class Main {
    public  static  void main(String[] arg){
        vehiculo v1 = new vehiculo();

        //v1.Girar_a_la_derecha();
        //v1.Cmbinar_de_carril();

       vehiculo v2 = new vehiculo("Turbo", "Blanco", "Vagoneta", "4x4", "Toyota");
       v2.mover();


       v2.mostrar();

       //v2.getNombre();

      // System.out.println("nombre:" +v2.getNombre());

       v2.setColor("ROjo");
       v2.mostrar();
    }
}
