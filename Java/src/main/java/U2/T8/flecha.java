package U2.T8;

import java.util.Scanner;

public class flecha {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int aux = n/2;
        for (int i = 0;i<=aux; i++) {
            for ( int j = 0; j <= aux;j++ ){
                if (i+j == aux){
                    System.out.print("*     *");
                }else{
                    System.out.print(" ");
                }


            }
            System.out.println();

        }
        for (int i = 1;i<=aux; i++) {
            for ( int j = 0; j <= aux;j++ ){
                if (i-j == 0){
                    System.out.print("*     *");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
    }
}
