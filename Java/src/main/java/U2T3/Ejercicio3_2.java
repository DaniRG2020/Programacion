package U2T3;

import java.util.Scanner;

public class Ejercicio3_2 {
    public static void main(String[] args) {
        //Crea un programa que pida al usuario su año de nacimiento y el año actual (usando datos de tipo short) y halle la diferencia de ambos para obtener su edad.

//an es año nacimiento aa = año actual
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Año de nacimiento");
        short an = sc.nextShort();
        System.out.println("Año Actual");
        short aa = sc.nextShort();
        int edad = (aa - an);
        System.out.println("Tu edad es " + edad);

    }
}
