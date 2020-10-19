package U2.T2;

import java.util.Scanner;

public class Ejercicio2_5 {
    //Crea un programa que pida al usuario una temperatura en grados centígrados y calcule (y muestre) a cuántos grados Fahrenheit equivalen (F = 9*C/5 + 32).

    public static void main(String[] args) {
        System.out.println("Dime los grados Cº");
        Scanner sc = new Scanner(System.in);
        int F = sc.nextInt();
        System.out.println("El resultado es: ");
        System.out.println(F * 1.8 + 32);

    }

}
