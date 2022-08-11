package ejercicio_1;

public class vehiculo {
    // Atributos de la clase
    private String nombre;
   private String color;
    private String modelo;
    private String tamano;
    private String marca;

    //Contructor de la clase vehiculo
    public vehiculo(){
        System.out.println("soy el contructor");
    }

    public vehiculo(String nom, String col, String mod, String tam, String mar){
        this.nombre = nom;
        this.color = col;
        this.modelo = mod;
        this.tamano = tam;
        this.marca = mar;
    }

    public void mover(){
        System.out.println("Soy el metodo mover");
    }

    public void Frenar(){
        System.out.println("Soy el metodo frenar");
    }

    public void Girar_a_la_derecha(){
        System.out.println("Girara_a_la_derecha");
    }

    public void Girar_a_la_izquierda(){
        System.out.println("Girar_a_la_izquierda");
    }

    public  void  Cmbinar_de_carril(){
        System.out.println("Cambiar_de_carril");
    }
     public void mostrar(){
         System.out.println("el nombre es: " + this.nombre);
         System.out.println("el color  es: " + this.color);
         System.out.println("el modelo  es: " + this.modelo);
         System.out.println("el tamaño  es: " + this.tamano);
         System.out.println("la marca  es: " + this.marca);

     }

     //crear un metodo que permita retormar el
    // nombre del vehiculo

    public String  getNombre() {
        return this.nombre;
    }

    public void setColor(String nuevoColor){
        this.color = nuevoColor;
    }
}

