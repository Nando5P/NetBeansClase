package repasobucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez
 * Repaso Bules ejercicio 11:
 * 
 */
public class RepasoBucles11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

  System.out.println("Bucle While: ");
 
 
  int num = 100;
        while (num >=20){
            System.out.println(num);
           num-=4;
        }
        
        System.out.println("\n");
        System.out.println("Bucle For: ");
        
        
       
        for (int j=100;j>=20;j-=4){
          
    System.out.println(j);
        }
        
    }
}
