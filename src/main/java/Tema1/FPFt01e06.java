/*
*Ejercicio calculo coste automovil
*Fernando Parga Fernandez
*/
package Tema1;
import java.util.Scanner;
public class FPFt01e06 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in); 
        double ganancia,impuesto,fabrica;
        final double tienda = 1.1;
        final double estado = 1.2;
        System.out.println("Introduzca el valor de fabrica del coche: ");
        fabrica = teclado.nextFloat();
        ganancia = fabrica * tienda;
        impuesto = ganancia * estado;    
        System.out.printf("El coche tendra un precio para del consumidor de %.2f Euros", impuesto);
   }
}


