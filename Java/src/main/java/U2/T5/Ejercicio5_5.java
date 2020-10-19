package U2.T5;

import java.util.Scanner;

public class Ejercicio5_5 {
    public static void main(String[] args) {
        //Crea un programa que pida tres números enteros largos al usuario y diga cuál es el mayor de los tres.
        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextInt();
        long n2 = sc.nextInt();
        long n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3 ){
            System.out.println(n1 + " Es el mayor");

        }if (n2 > n1 && n2 > n3){
            System.out.println(n2 + " Es el mayor");
        }else if (n3 > n1 && n3 > n2) {
            System.out.println(n3 + " Es el mayor");
        }


    }
}
