package U2.T8;

public class Actividad1_7 {
    public static void main(String[] args) {
        // Diseñar un programa que muestre el producto de los 10 primeros números impares.

        int n = 1;
        int contador = 1;

        while (contador <= 19 ){

           n = n * contador;
           contador = contador + 2 ;

        }
        System.out.println(n);



    }
}
