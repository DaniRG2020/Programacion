package U2.T5;

import java.util.Scanner;

public class Ejercicio5_2 {
    public static void main(String[] args) {
        //Crea un programa que pida al usuario que introduzca el número 12. Después debe decirle
        // si lo ha hecho correctamente o no.

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero 12");
        int numero = sc.nextInt();
        if (numero==12){
            System.out.println("El numero introducido es correcto");
        }else{
            System.out.println("El numero no es correcto");
        }

    }
}
