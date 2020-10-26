package U2.T9;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Actividad9_2 {
    public static void main(String[] args) {
        //Diseñar el juego "Acierta la contraseña". El primer jugador introduce una contraseña, el segundo, debe
        // insertar otra intentando acertarla con las pistas que le dará el programa: número de caracteres, primera
        // y última letra. El programa debe escribir "Acertaste" o "Fallaste".

        Scanner sc = new Scanner(System.in);
        String J1 = sc.nextLine();
        System.out.println("Pistas");
        System.out.println("contiene " + J1.length() + " Caracteres");
        System.out.println("La primera letra es " + J1.charAt(0));
        String ultimo = J1.substring(J1.length() - 1);
        System.out.println(ultimo + " Es la ultima letra");


        String J2 = sc.nextLine();
        if (J2.equalsIgnoreCase(J1) ){
            System.out.println("Acertaste");
        }else{
            System.out.println("Fallaste");
        }
    }
}
