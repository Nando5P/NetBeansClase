/*
*Conversor Dolares a Euros
*Fernando Parga Fernandez
*/
package Tema1;
import java.util.Scanner;
public class FPFt01e02 {
public static void main(String[] args) {
        float eur,dolar;
        final float conv = (float) 1.14;
         try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Conversor de Dolares a Euros. ");
            System.out.print("Cuantos dolares quieres convertir?: ");
            dolar = teclado.nextFloat();
        }
         eur = dolar / conv;
         System.out.println("Total: " + eur + " euros") ;
   }
}


