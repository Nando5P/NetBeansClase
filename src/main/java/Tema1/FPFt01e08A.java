/*
*Ejercicio Media de edades
*Fernando Parga Fernandez
*/
package Tema1;
import java.util.Scanner;
public class FPFt01e08A {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in); 
        float a,b,c,d,media;
        
        System.out.println("Introduzca la edad de la primera persona: ");
        a = teclado.nextFloat();
        System.out.println("Introduzca la edad de la segunda persona: ");
        b = teclado.nextFloat();
        System.out.println("Introduzca la edad de la tercera persona: ");
        c = teclado.nextFloat();
        System.out.println("Introduzca la edad de la cuarta persona: ");
        d = teclado.nextFloat();
        media = (a + b + c + d) / 4;
        System.out.printf("La edad edia es de %.2f años", media);
}
}
        
        
     
  
