package U2.T8;

import java.util.Scanner;

public class Actividad1_3 {
    public static void main(String[] args) {
        // Realizar un aplicación que genere un número aleatorio entre 1 y 100. El jugador debe ir probando números
        // tratando de acertarlo. El programa debe indicar "mayor" o "menor" según el número secreto sea mayor o menor
        // que el introducido por el usuario. El proceso finaliza cuando el usuario acierta o cuando se rinde
        // (introduciendo un -1).

   Scanner sc = new Scanner(System.in);

   int nrandom = (int) (Math.random()*(100+1));


        int n = sc.nextInt();
        while (n != nrandom && n > -1){
            if (n < nrandom ){

                System.out.println(n + "Es menor");

            }else if (n > nrandom){
                System.out.println(n + " Es mayor");
            }else{
                System.out.println(n + "Acertastes");
            }n=sc.nextInt();


        }



}
    }
