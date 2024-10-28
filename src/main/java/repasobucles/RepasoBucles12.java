package repasobucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez
 * Repaso Bules ejercicio 12:
 * 
 */
public class RepasoBucles12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

  System.out.println("Bucle While: ");
 
 
  int num = 100;
  int i = 1;
        while (num <=120){
            System.out.println(num);
           num +=i;
           i++;
        }
        
        System.out.println("\n");
        System.out.println("Bucle For: ");
        
        
       
      int j = 1;
        for (int numero = 100; numero <= 120; numero+=(j++)){
            
          
    System.out.println(numero);
        }
        
    }
}
