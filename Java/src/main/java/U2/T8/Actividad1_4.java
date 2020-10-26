package U2.T8;

import java.util.Scanner;

public class Actividad1_4 {
    public static void main(String[] args) {
        //Escribir una aplicación que pida un número n, y escriba los números desde 1 hasta n.
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime n");
        int n = sc.nextInt();
        System.out.println("n numeros del 1 al " + n + " :");
        int i = 1;
        while (i<=n){
            System.out.println(i);
            i++;
        }

    }
}
