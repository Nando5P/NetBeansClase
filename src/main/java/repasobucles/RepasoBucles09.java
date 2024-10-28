package repasobucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez
 * Repaso Bules ejercicio 9:
 * 
 */
public class RepasoBucles09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

  System.out.println("Bucle While: ");
 
 
  int num = 20;
        while (num <=100){
            System.out.println(num);
           num+=4;
        }
        
        System.out.println("\n");
        System.out.println("Bucle For: ");
        
        
       
        for (int j=20;j<=100;j+=4){
          
    System.out.println(j);
        }
        
    }
}
