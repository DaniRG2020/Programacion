package U2.T7;

import java.util.Scanner;

public class Actividad7_1 {
    public static void main(String[] args) {
        //Realiza un programa que dadas dos variables a y b, intercambie los valores de a y b.

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce primer y segundo numero para invertirlo");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int aux = a;
        a=b;
        b=aux;
        System.out.println(a);
        System.out.println(b);


    }
}
