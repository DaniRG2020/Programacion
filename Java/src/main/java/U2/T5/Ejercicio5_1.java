package U2.T5;

import java.util.Scanner;

public class Ejercicio5_1 {

    public static void main(String[] args) {
        // Crea un programa que pida un número entero al usuario y diga si es positivo (mayor que cero) o si, por el
        // contrario, no lo es (usando "else").

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero para saber si es positivo o no");
        int numero = sc.nextInt();
        if (numero >= 0){
            System.out.println(numero + " Es positivo" );
        }else{
            System.out.println(numero + " No es positivo");
        }

    }
}