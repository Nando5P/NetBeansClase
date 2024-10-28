package tema3;

import java.util.Scanner;

public class FPFt03e06 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 6: Diseñar un programa que muestre los números pares comprendidos entre 100 y 1 en orden 
descendente.   
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        for (int i = 100; i >= 1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
