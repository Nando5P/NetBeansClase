package repasobucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez
 * Repaso Bules ejercicio 5:
 * 
 */
public class RepasoBucles05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
 int num = 5;
  System.out.println("Bucle While: ");
        while (num <= 100){
            System.out.print(num + " - ");
            num+=5;
        }
        
        System.out.println("\n");
        System.out.println("Bucle For: ");
        int multiplo=0;
        for (int i=1;i<=20;i++){
           multiplo +=5;
    System.out.print(multiplo + " - ");
        }
        
    }
}
