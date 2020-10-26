package U2.T9;

import java.util.Scanner;

public class Actividad9_1 {
    public static void main(String[] args) {
        // Introducir por teclado dos palabras e indicar cuál de ellas es la más corta.
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (a.compareTo(b) < b.compareTo(a)){
            a.compareTo(b);
            System.out.println( a+ " Es más corta ");
        }else{
            b.compareTo(a);
            System.out.println( b + " es la mas corta " );
        }




    }
}
