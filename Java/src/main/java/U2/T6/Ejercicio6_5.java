package U2.T6;

import java.util.Scanner;

public class Ejercicio6_5 {

    public static void main(String[] args) {
       /* Se nos pide hacer un programa que pida la usuario el valor del radio de una circunferencia, y a
        continuación muestre un pequeño menú con 3 opciones:

        1.Calcular diámetro

        2.Calcular perímetro

        3.Calcular área

        Dependiendo del número que marque el usuario, deberemos mostrar el resultado correspondiente.
        (diametro=2 x radio) (perímetro=2 x pi x radio) (area=pi x radio x radio)
        */
        System.out.println("1. diametro");
        System.out.println("2. Perimetro");
        System.out.println("3. Area");
        System.out.println("Introduce el numero segun las opciones 1-3");
        Scanner sc = new Scanner(System.in);

        int opciones = sc.nextInt();


        switch (opciones){

            case 1 :
                System.out.println("Introduce el radio para calcular el diametro");
                int radio = sc.nextInt();
                System.out.println("El diametro es " + radio * 2  );
                break;
            case 2 :
                System.out.println("Introduce el radio para calcular el perimetro");
                int radio1 = sc.nextInt();
                System.out.println("El diametro es " + 2 * Math.PI * radio1  );
                break;
            case 3 :
                System.out.println("Introduce el radio para calcular el area");
                int radio2 = sc.nextInt();
                System.out.println("El diametro es " + Math.PI * radio2 * radio2 );
                break;
            default:
                System.out.println(opciones + " No es valido");


        }


    }
}
