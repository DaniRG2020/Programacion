package Entregable_U2;

import java.util.Scanner;

public class Ej2_borrador {
    public static void main(String[] args) {
        //dividir entre 10 el numero completo
        System.out.println("Introduce n");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int contadorp = 0 ;
        int contadorimp = 0;

        while (n > 0){
            int cifra = n%10 ;
            if (cifra %2 == 0){
                contadorp++;

            }else{
                    contadorimp++;

            }
            n = n - cifra;
            n = n / 10 ;
       }
        System.out.println("Numero de impares " + contadorimp + " Numero de pares " + contadorp );
    }
}
