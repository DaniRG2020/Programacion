package U2.T6;

import java.util.Scanner;

public class Ejercicio6_2 {
    public static void main(String[] args) {
        //Crea un programa que escriba como texto cualquier número del 1 al 10 que introduzca el usuario.
        // Por ejemplo, si el usuario introduce 3, deberá escribir "tres".

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero del 1 al 10");
        int numero = sc.nextInt();
        switch (numero){
            case 1:
                System.out.println("Uno");
                break;
            case 2 :
                System.out.println("Dos");
                break;
            case 3 :
                System.out.println("Tres");
                break;
            case 4 :
                System.out.println("Cuatro");
                break;
            case 5:
                System.out.println("Cinco");
                break;
            case 6 :
                System.out.println("Seis");
                break;
            case 7 :
                System.out.println("Siete");
                break;
            case 8 :
                System.out.println("Ocho");
                break;
            case 9:
                System.out.println("Nueve");
                break;
            case 10 :
                System.out.println("Diez");
                break;
            default:
                System.out.println(numero + " No es un numero del 1 al 10");


        }

    }
}
