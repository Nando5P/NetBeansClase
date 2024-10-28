package tema3;

import java.util.Scanner;

public class FPFt03e03A {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 3: Diseñar un algoritmo que permita introducir números positivos y nos vaya informando uno a 
uno si es par o impar. El programa finalizará cuando se introduzca un número negativo. Hacer dos 
versiones, una primera con una lectura de teclado adelantada (antes de entrar en el bucle) y otra 
versión en la que la lectura de datos se haga únicamente al principio del bucle.  
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el numero que quieras para saber si es par o impar (nº negativo cierra el proceso): ");
        int n = teclado.nextInt();
        while (n > 0) {
            if (n % 2 == 0) {
                System.out.println(n + " Es par");
            } else {
                System.out.println(n + " Es impar");
            }

            System.out.print("Introduce el numero que quieras para saber si es par o impar: ");
            n = teclado.nextInt();
        }

    }
}
