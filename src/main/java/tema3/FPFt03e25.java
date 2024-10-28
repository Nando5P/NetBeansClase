package tema3;

import java.util.Scanner;

public class FPFt03e25 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 25: Mostrar por pantalla alternativamente “hola” y “adiós” hasta completar x líneas, siendo x un 
número entero positivo tecleado previamente (ojo: el número x puede ser par o impar).
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int repeticiones;
        
        System.out.println("Introduce el numero de lineas que quieres imprimir \"Hola\" y \"Adios\": ");
        repeticiones = teclado.nextInt();
        
        for (int i = 1; i <= repeticiones; i++) {
            if (i % 2 == 0) {
                System.out.println("\"Adios\"");
            }else {System.out.println("\"Hola\"");}
        }
    }
}
