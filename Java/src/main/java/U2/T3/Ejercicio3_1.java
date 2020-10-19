package U2.T3;

import java.util.Scanner;

public class Ejercicio3_1 {
    public static void main(String[] args) {
        //Crea un programa que calcule y muestre la suma de dos números de dos cifras (de tipo byte) que introduzca el usuario.

        System.out.println("1º NUM");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextByte();
        System.out.println("NUM 2");
        int num2 = sc.nextByte();
        int resultado = (num1 + num2);
        System.out.println("La sumas es: " + resultado);

    }
}
