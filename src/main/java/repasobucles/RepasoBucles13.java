package repasobucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez
 * Repaso Bules ejercicio 13:
 * 
 */
public class RepasoBucles13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

  System.out.println("Bucle While: ");
 
 
  int num = 100;
  int i = 2;
        while (num <=120){
            System.out.println(num);
           num +=i;
           i+=2;
        }
        
        System.out.println("\n");
        System.out.println("Bucle For: ");
        
        
       
      int j = 0;
        for (int numero = 100; numero <= 120; numero+=(j+=2)){
            
          
    System.out.println(numero);
        }
        
    }
}
