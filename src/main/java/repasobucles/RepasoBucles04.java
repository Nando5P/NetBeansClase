package repasobucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez
 * Repaso Bules ejercicio 1:
 * 
 */
public class RepasoBucles04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
 int num = 2;
  System.out.println("Bucle While: ");
        while (num <= 40){
            System.out.print(num + " - ");
            num+=2;
        }
        
        System.out.println("\n");
        System.out.println("Bucle For: ");
        int multiplo=0;
        for (int i=1;i<=20;i++){
           multiplo +=2;
    System.out.print(multiplo + " - ");
        }
        
    }
}
