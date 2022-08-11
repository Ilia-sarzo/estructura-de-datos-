import java.util.Scanner;

public class SumadeDosNumeros {
    public static void main(String [] arg){
        System.out.println("Programa que suma 2 numeros");

        int num1;
        int num2;
        int suma;
        int resta;
        int multiplicacion;
        int division;

        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese el valor del numero 1");
        num1 =read.nextInt();

        System.out.println("Ingrese el valor de numero 2");
        num2 = read.nextInt();


        suma = num1 + num2;
        resta = num1 - num2;
        multiplicacion = num1 * num2;
        division = num1 / num2;

        System.out.println("la suma es:" + suma);
        System.out.println("la resta es:" + resta);
        System.out.println("la multiplicacion  es:" + multiplicacion);
        System.out.println("la division  es:" + division);
    }
}
