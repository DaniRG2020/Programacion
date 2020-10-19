package U2.T3;

import java.util.Scanner;

public class Ejercicio3_4 {
    public static void main(String[] args) {
        // Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y calcule su equivalencia en kilómetros, usando datos de tipo float (1 milla = 1.609 km).


        System.out.println("Dime metros");
        Scanner sc = new Scanner(System.in);
        float numeromillas;
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Introduce longitud ");
        numeromillas = sc.nextInt();
        float equivalencia = numeromillas * 1609;
        if (numeromillas == 1) {

            System.out.println(numeromillas + "milla son " + equivalencia + "Km");
        } else {

            System.out.println(numeromillas + "millas son " + equivalencia + "Km");


        }


    }
}

