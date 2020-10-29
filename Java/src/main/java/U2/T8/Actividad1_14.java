package U2.T8;

import java.util.Scanner;

public class Actividad1_14 {
    public static void main(String[] args) {
        //Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para ello asteriscos
        // (*). Por ejemplo, para n=4:

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0;i<=n; i++) {
            for ( int j = 0; j <= n;j++ ){
                if (i+j == n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }


            }
            System.out.println();
        }

    }


}
