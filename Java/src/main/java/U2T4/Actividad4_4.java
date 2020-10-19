package U2T4;

import java.util.Scanner;

public class Actividad4_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero a redondear");
        double n = sc.nextDouble();

        System.out.println(Math.round(n));

    }
}
