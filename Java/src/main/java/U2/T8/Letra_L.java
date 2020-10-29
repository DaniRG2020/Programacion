package U2.T8;

import java.util.Scanner;

public class Letra_L {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura = sc.nextInt();
        int base = altura/2+1;
        for (int i = 0; i <=altura ; i++) {
            for (int j = 0; j <=base ; j++) {
                if (i==0){
                    System.out.print("*");
                }else{
                    System.out.print("");
                }

            }
            System.out.println();

        }
    }
}
