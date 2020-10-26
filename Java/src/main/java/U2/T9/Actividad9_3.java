package U2.T9;

import java.util.Scanner;

public class Actividad9_3 {
    public static void main(String[] args) {
        //En una segunda versión del programa anterior, se debe escribir "Acertaste" o "Menor" o "Mayor",
        // según la palabra introducida sea menor alfabéticamente que la contraseña, o mayor.

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
        } else if(J2.length() > J1.length()){


            System.out.println("Mayor");
            System.out.println("Fallaste");

        }else {
            System.out.println("Fallaste");
            System.out.println("Menor");
        }





        }


    }

