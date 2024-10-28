/*
*Ejercicio intercambio de valores
*Fernando Parga Fernandez
*/
package Tema1;
import java.util.Scanner;
public class FPFt01e09 {
   public static void main(String[] args) { 
       
 Scanner teclado = new Scanner (System.in);/* faltaba esta linea de teclado*/
 int var1, var2; 
 
 System.out.print("Introduce var1: "); 
 var1 = teclado.nextInt(); 
 System.out.print("Introduce var2: "); 
 var2 = teclado.nextInt(); 
 
 int temp = var1;/*linea añadida con una nueva variable*/
  
 var1 = var2; 
 var2= temp; /*linea modificada*/
 System.out.println("Ahora var1 es igual a var2: " + var1); /*Esta linea estaba mal escrita*/
 System.out.println("Ahora var2 es igual a var1: " + var2); /*Esta linea estaba mal escrita*/

}
}
        
        
     
  
