package U2.T6;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Ejercicio6_4 {

    public static void main(String[] args) {
        //Crea un programa que pida dos números de tipo byte al usuario y cree a una variable "menor", que tenga el
        // valor del menor de esos dos números. Hazlo primero con un "if" y luego con un "operador condicional".
//IF

     /*
       Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 2 numeros");
        byte n1 = sc.nextByte();
        byte n2 = sc.nextByte();

        if (n1>n2 ){
            System.out.println(n2);
        }else{
            System.out.println(n1);
        }
        */

        //Operador condicional
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce 2 numeros");
        byte n1 = sc.nextByte();
        byte n2 = sc.nextByte();
        if (n1<n2 && n2>n1){
            System.out.println(n1);
        }else{
            System.out.println(n2);
        }
    }

}
