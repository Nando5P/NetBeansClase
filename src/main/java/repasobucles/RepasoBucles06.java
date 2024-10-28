package repasobucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez
 * Repaso Bules ejercicio 6:
 * 
 */
public class RepasoBucles06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

  System.out.println("Bucle While: ");
 
  int resultado;
  int num = 1;
        while (num <=20){
            resultado = num*num;
            System.out.println(num + " al cuadrado = " + resultado);
            num++;
           
        }
        
        System.out.println("\n");
        System.out.println("Bucle For: ");
        
        
        num=1;
        for (int j=1;j<=20;j++){
           resultado = num*num;
    System.out.println(num + " al cuadrado = " + resultado);
    num++;
        }
        
    }
}
