/*
*Ejercicio Media de edades 2 variables
*Fernando Parga Fernandez
*/
package Tema1;
import java.util.Scanner;
public class FPFt01e08B {
   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in); 
        float edad,media;
        
        System.out.println("Introduzca la edad de la primera persona: ");
        edad = teclado.nextFloat();
        media = edad;
        System.out.println("Introduzca la edad de la segunda persona: ");
        edad = teclado.nextFloat();
        media += edad;
        System.out.println("Introduzca la edad de la tercera persona: ");
        edad = teclado.nextFloat();
        media += edad;
        System.out.println("Introduzca la edad de la cuarta persona: ");
        edad = teclado.nextFloat();
        media += edad;
        media /= 4;
        System.out.printf("La edad edia es de %.2f años", media);
}
}
        
        
     
  
