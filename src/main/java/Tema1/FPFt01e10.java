/*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
*/
package Tema1;
import java.util.Scanner;
public class FPFt01e10 {
   public static void main(String[] args) { 
       
 Scanner teclado = new Scanner (System.in);/* faltaba esta linea de teclado*/
 double cordx, cordy,area; 
 
 System.out.print("Introduce coordenadas del eje X: "); 
 cordx = teclado.nextInt(); 
 System.out.print("Introduce coordenadas del eje Y: "); 
 cordy = teclado.nextInt(); 
 area = Math.abs(cordx * cordy);
 System.out.printf("El area del rectangulo es %.1f ", area);
 
 
}
}
        
        
     
  
