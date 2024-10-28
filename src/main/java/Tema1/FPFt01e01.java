/*
*Conversor Euros a Dolares
*Fernando Parga Fernandez
*/
package Tema1;
import java.util.Scanner;
public class FPFt01e01 {
public static void main(String[] args) {
        float eur,dolar;
        final float conv = (float) 1.14;
         try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Conversor de Euros a Dolares. ");
            System.out.print("Cuantos euros quieres convertir?: ");
             eur = teclado.nextFloat();
        }
         dolar = eur * conv;
         System.out.println("Total: " + dolar + "$") ;
   }
}


