/*
*Ejercicio Metereologia
*Fernando Parga Fernandez
*/
package Tema1;
import java.io.PrintStream;
import java.util.Scanner;
public class FPFt01e05 {
public static void main(String[] args) {
    
    Scanner teclado = new Scanner (System.in);
    double celsius,fahre,pulgada,centimetros;
    
    System.out.println("Bienvenido al sistema de metereologia");
    System.out.print("introduce la temperatura en Celius: ");
    celsius = teclado.nextDouble();
    fahre = (Math.round((9f / 5 * celsius + 32)*100)/100f);
    System.out.printf("Equivalencia en Fahrenheit: %.2f F", fahre);
    System.out.println("");
    System.out.print("introduce la cantidad de pulgadas de agua: ");
    pulgada = teclado.nextDouble();
    centimetros = (double) pulgada * 2.55d;
    System.out.printf("Equivalencia en centimetros: %.1f cm", centimetros);
    
         }

    
}

