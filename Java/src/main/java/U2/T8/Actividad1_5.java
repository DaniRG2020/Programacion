package U2.T8;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Actividad1_5 {
    public static void main(String[] args) {
        //Desarrollar un programa que solicite los valores mínimo y máximo de un rango. A continuación, solicitará por
        // teclado un valor que debe estar dentro del rango. Si no es asi, volverá a solicitar un número, y así
        // repetidas veces hasta que el valor esté dentro del rango.

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer valor limitante");
        int a = sc.nextInt();
        System.out.println("Introduzca el segundo valor limitante");
        int b = sc.nextInt();
        System.out.println("Introduzca el valor comprendido entre los dos valores anteriores");
        int n = sc.nextInt();

        while (n<=a || n>=b){

            if (n>=a && n<=b){
                System.out.println(n + " está dentro de los valores");
            }
            else{
                System.out.println(n + "Fuera de rango");
                n = sc.nextInt();
            }
            System.out.println("Fin");

        }

    }
}

