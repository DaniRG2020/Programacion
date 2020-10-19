package U2.T5;

import java.util.Scanner;

public class Ejercicio5_3 {
    public static void main(String[] args) {
        // Crea un programa que diga si el número introducido por el usuario es impar o no lo es.
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int numero = sc.nextInt();
        //realizo la operacion para saber el resto, si el resto de la division es 0 es par, en casa contrario será impar.

        if (numero%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("No es par");
        }
    }
}
