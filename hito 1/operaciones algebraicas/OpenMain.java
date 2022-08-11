import operacionesalgebraicas.Operacionoes;

import java.util.Scanner;

public class OpenMain {
    public static void main(String [] arg){
        System.out.println("Programa que suma 2 numeros usano clase");

        int num1;
        int num2;

        Scanner read = new Scanner(System.in);

        System.out.println("Ingrese el valor del numero 1");
        num1 =read.nextInt();

        System.out.println("Ingrese el valor de numero 2");
        num2 = read.nextInt();

        Operacionoes oper1 = new Operacionoes(num1,num2);

        int suma = oper1.suma();
        int resta  = oper1.resta();
        int multiplicacion = oper1.multiplicacion();
        int diivision = oper1.division();

        System.out.println("la suma es: " + suma);
        System.out.println("la resta  es: " + resta);
        System.out.println("la  multiplicion  es: " + multiplicacion);
        System.out.println("la divsion  es: " + diivision);
    }
}

