package U2.T6;

import java.util.Scanner;

public class Ejercicio6_3 {
    public static void main(String[] args) {
        //Crea un programa que pida un número entero al usuario y dé a una variable par el valor 1 si ese número es par
        // o el valor 0 si no es par. Hazlo primero con un "if" y luego con un "operador condicional".

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Dime un numero");
            if (n%2 == 0){

            int par = 1;
            //System.out.println("Tu numero es " + par );
        }else{

            int par = 0;
        System.out.println(par + " Es tu numero");


        }





    }
}
