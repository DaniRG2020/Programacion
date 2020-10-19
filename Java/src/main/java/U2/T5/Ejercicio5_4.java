package U2.T5;

import java.util.Scanner;

public class Ejercicio5_4 {
    public static void main(String[] args) {
        //Crea un programa que pida al usuario dos números enteros y cuántos de ellos son pares.
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce el primer numero");
        int n1 = sc.nextInt();
        System.out.println();
        int n2 = sc.nextInt();
        if (n1%2==0 && n2%2==0){
            System.out.println(n1 + " Los dos son pares");
        }else{
            System.out.println(n1 + " No es par");

        }
        if (n2%2==0){
            System.out.println(n2 + " Es par");
        }else{
            System.out.println(n2 + " No es par");
        }
    }
}
