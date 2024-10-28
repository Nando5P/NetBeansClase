package tema3;

import java.util.Scanner;

public class FPFt03e05 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 5: Sumar una cantidad de números que se van introduciendo, siempre que sean positivos hasta 
que se teclee el -1. 
Para sumar valores e ir acumulando esa suma se suele emplear una estructura 
con la siguiente forma. Antes del bucle: acumulador = 0. Y dentro del bucle 
acumulador = acumulador + nuevo valor.   
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n = 1;
        int suma = 0;

        while (n != -1) {
            System.out.print("Introduce el numero que quieras para ssumarlo al anterior (-1 para finalizar): ");
            n = teclado.nextInt();
            suma += n;
            System.out.println("Total: " + suma);
        }
    }
}
