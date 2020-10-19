package U2.T5;

import java.util.Scanner;

public class Ejercicio5_6 {
    public static void main(String[] args) {
        //Crea un programa que contenga una constante llamada gravedad=9,8, solicite al usuario el valor de "tiempo", y
        // calcule y muestre la velocidad (velocidad=gravedad x tiempo). Nota: si el valor del tiempo es negativo o 0,
        // se mostrará el mensaje "Tiempo incorrecto"

        Scanner sc = new Scanner(System.in);
        double gravedad = 9.8;
        int tiempo = sc.nextInt();

        if (tiempo >0){
            System.out.println(tiempo * gravedad);
        }else{
            System.out.println();
        }



    }
}
