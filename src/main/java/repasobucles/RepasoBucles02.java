package repasobucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez
 * Repaso Bules ejercicio 1:
 * 
 */
public class RepasoBucles02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
 int num = 0;
  System.out.println("Bucle While: ");
        while (num <= 20){
            System.out.print(num + " - ");
            num++;
        }
        System.out.println("\n");
        System.out.println("Bucle For: ");
        for (int i=0;i<=20;i++){
            System.out.print(i + " - ");
        }
        
    }
}
