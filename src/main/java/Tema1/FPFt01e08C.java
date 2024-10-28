/*
*Ejercicio Media de edades 1 variable
*Fernando Parga Fernandez
*/
package Tema1;
import java.util.Scanner;
public class FPFt01e08C {
   public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in); 
        float sumaedad;
        
        System.out.println("Introduzca la edad de la primera persona: ");
        sumaedad = teclado.nextFloat();
        
        System.out.println("Introduzca la edad de la segunda persona: ");
        sumaedad += teclado.nextFloat();
        System.out.println("Introduzca la edad de la tercera persona: ");
        sumaedad += teclado.nextFloat();
        System.out.println("Introduzca la edad de la cuarta persona: ");
        sumaedad += teclado.nextFloat();
        
        sumaedad /= 4;
        System.out.printf("La edad edia es de %.2f años", sumaedad);
}
}
    
        
     
  
