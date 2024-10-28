/*
*Ejercicio ordenador a bordo
*Fernando Parga Fernandez
*/
package Tema1;
import java.util.Scanner;
public class FPFt01e07 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in); 
        double inicio,fin,litrosA,litrosB,consumo;
        
        System.out.println("Introduzca los Km iniciales del coche: ");
        inicio = teclado.nextFloat();
        System.out.println("Introduzca los Km finales del coche: ");
        fin = teclado.nextFloat();
        System.out.println("Introduzca los litros iniciales en el deposito: ");
        litrosA = teclado.nextFloat();
        System.out.println("Introduzca los litros finales en el deposito: ");
        litrosB = teclado.nextFloat();
        consumo = ((litrosA - litrosB) * 100)/(fin - inicio);
        System.out.printf("El coche tendra un precio para del consumidor de %.2f Litros", consumo);
   }
}


