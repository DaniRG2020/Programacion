package U2.T8;

import java.util.Scanner;

public class Actividad1_2 {
    public static void main(String[] args) {
        //Un centro educativo nos ha pedido que diseñemos una aplicación para calcular datos estadísticos de los
        // alumnos. Se introducirán las edades de los elumnos hasta que una de ellas sea negativa. La aplicación
        // mostrará la suma de las edades, la media, de cuántos alumnos hemos introducido su edad, y cuántos alumnos
        // son mayores de edad.

        Scanner sc = new Scanner(System.in);
        int edad = sc.nextInt();
        int alumno = 0;
        int medad = 0;
        int media = 0;
        while (edad>=0){

            if (edad >= 18){
                medad++;
                alumno++;
                media = media + edad;
            }else{
                alumno++;
                media = media + edad;
            }
            edad = sc.nextInt();
        }
        System.out.println("Media de edad " + media/alumno + " mayores de edad " + medad + " cantidad alumnos " + alumno );
    }
}
