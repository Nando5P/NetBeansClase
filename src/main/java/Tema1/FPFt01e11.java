/*
*Ejercicio Calculo hipotenusa
*Fernando Parga Fernandez
*/
package Tema1;
import java.util.Scanner;
public class FPFt01e11 {
   public static void main(String[] args) { 
       
 Scanner teclado = new Scanner (System.in);/* faltaba esta linea de teclado*/
 double cat1, cat2,hipo; 
 
 System.out.print("Introduce valor para el cateto 1: "); 
 cat1 = teclado.nextInt(); 
 System.out.print("Introduce valor para el cateto 2: "); 
 cat2 = teclado.nextInt(); 
 hipo = Math.sqrt(Math.pow(cat1, 2) + Math.pow(cat2, 2));
 System.out.printf("El area del rectangulo es %.2f ", hipo);
 
 /*l codigo que utiliza JAVA para calcular directamente la hipotenusa seria el siguiente:
 *
 *  hipo = Math.hypot(cat1, cat2);
 */
}
}
        
        
     
  
