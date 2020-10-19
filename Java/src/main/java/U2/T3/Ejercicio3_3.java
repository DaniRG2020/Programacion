package U2T3;

import java.util.Scanner;

public class Ejercicio3_3 {
    public static void main(String[] args) {
        //Crea un programa que calcule y muestre la división de dos números reales de doble precisión introducidos por el usuario.
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el primer numero");
        double n1 = sc.nextDouble();
        System.out.println("Dime el segundo numero");
        double n2 = sc.nextDouble();
        System.out.println("El resultado de la division es " + n1 / n2);

    }
}
