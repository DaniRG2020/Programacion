package U2.T8;

import java.util.Scanner;

public class Actividad1_1 {
    public static void main(String[] args) {
        //Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si es positivo, y su
        // cuadrado. El proceso terminará cuando el número introducido por teclado sea 0.

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 0 ){
            if (n%2 == 0 && n>=0 ){
                System.out.println("Es positivo");
                System.out.println("Es par");
                System.out.println("Su cuadrado es " + n*n);
            }else if (n<0){
                System.out.println("Es negativo");

            }else{
                System.out.println("Es Impar");
                System.out.println("Su cuadrado es " + n*n);
            }
            n=sc.nextInt();



        }
    }
}
