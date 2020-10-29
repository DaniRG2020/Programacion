package U2.T8;

import java.util.Scanner;

public class Actividad1_9 {
    public static void main(String[] args) {
        //Un centro de investigación de la flora urbana necesita una aplicación que muestre cual es el árbol más alto.
        // Para ello se introducirán por teclado las alturas en cms de cada árbol, terminando cuando se introduzca -1.
        // Los árboles se identifican mediante etiquetas con números correlativos, comenzando en 0.
        Scanner sc = new Scanner(System.in);
        System.out.println("para salir escriba -1");
        System.out.println("Introduce la altura del arbol");
        int altura= sc.nextInt();
        int alturamax = 0 ;

        while(altura > 0){

            if (altura > alturamax){
                alturamax = altura;

            }altura = sc.nextInt();


        }
        System.out.println("El arbol más alto mide: " + alturamax );



    }
}
