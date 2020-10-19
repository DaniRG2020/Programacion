package U2.T2;

import java.util.Scanner;

public class Ejercicio2_4 {
    //Crea un programa que pida al usuario una longitud en millas (por ejemplo, 3) y calcule su equivalencia en metros (1 milla = 1609 m).

    public static void main(String[] args) {
        System.out.println("Dime metros");
        Scanner sc = new Scanner(System.in);
        int numeromillas;
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Introduce longitud ");
        numeromillas = sc.nextInt();
        int equivalencia = numeromillas * 1609;
        if (numeromillas == 1) {

            System.out.println(numeromillas + "milla son" + equivalencia + "Metros");
        } else {

            System.out.println(numeromillas + "millas son " + equivalencia + "metros");


        }


    }
}
