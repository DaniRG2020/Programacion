package Entregable_U2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int temp;
        boolean primo=true;

        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = sc.nextInt();
        for (int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if (temp==0)
            {
                primo=false;
                break;
            }
        }
        if(primo)
            System.out.println(num +" Es primo");
        else
            System.out.println(num +" No es primo");
    }
}
