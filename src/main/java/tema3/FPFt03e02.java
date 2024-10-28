package tema3;

import java.util.Scanner;

public class FPFt03e02 {
/*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 2: Mostrar por pantalla los n primeros números naturales, siendo n el valor tecleado 
previamente.  
 */
 public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
       
        System.out.print("Introduce el numero que quieras: ");
        int n = teclado.nextInt();
        for (int i = 1; i <= n; i++) {
        System.out.println(i);
            }
           

    }
}


