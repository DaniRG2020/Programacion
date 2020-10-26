package U2.T7;

import java.util.Scanner;

public class Actividad7_2 {
    public static void main(String[] args) {
        /*Tenemos las variables enteras "edad", "nivel_de_estudios", e "ingresos". Necesitamos almacenar en la variable
        booleana "jasp" el valor:

        verdadero. Si la edad es menor o igual a 28, el nivel de estudios es mayor que 3, y los ingresos superan
        los 28000 (euros).
        falso. En caso contrario.
        escribe el código necesario para inicializar "jasp" en una línea.

         */
        Scanner sc = new Scanner(System.in);

        int edad= sc.nextInt();

        int N_estudios = sc.nextInt();
        int ingresos = sc.nextInt();
        boolean jasp ;

       if (edad <= 28 && N_estudios >=3 && ingresos >= 28000 ){
           jasp = true;
           System.out.println("Verdadero");
        }else{

        jasp = false;
           System.out.println("Falso");
        }


    }
}
