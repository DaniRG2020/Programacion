package Entregable_U2;

import java.util.Scanner;

public class EJercicio3 {
    public static void main(String[] args) {
        //Ejercicio 3
        //Escribe un programa que sea capaz de insertar un dígito dentro de un número
        //indicando la posición. El nuevo dígito se colocará en la posición indicada y el
        //resto de dígitos se desplazará hacia la derecha. Las posiciones se cuentan de
        //izquierda a derecha empezando por el 1. Suponemos que el usuario introduce
        //correctamente los datos. Se recomienda usar long en lugar de int ya que el
        //primero admite números más largos.
        //
        //Ejemplo:
        //Por favor, introduzca un número entero positivo: 406783
        //Introduzca la posición donde quiere insertar: 3
        //Introduzca el dígito que quiere insertar: 5
        //El número resultante es 4056783.


        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo:");
        String num = sc.next();
        System.out.println("Introduce la posición donde quieres insertar");
        int pos = sc.nextInt();
        System.out.println("Introduce el digito que quieres insertar");
        String dig = sc.next();

        String parte1 = num.substring(0, pos);
        String parte2 = num.substring(pos);
        String result = parte1+dig+parte2;

        System.out.println(result);


    }
}
