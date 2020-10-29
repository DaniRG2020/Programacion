package U2.T8;

import java.util.Scanner;

public class Actividad1_8 {
    public static void main(String[] args) {
        //Pedir un número y calcular su factorial.
        //
        //Ejemplo: Factorial de 5:
        //
        //5! = 5x4x3x2x1 = 120
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero a sacar el factorial");
    int n = sc.nextInt();
    int f = 1;
   while (n!=0){
       f = f * n;
       n--;


   }
        System.out.println(f);



    }
}
