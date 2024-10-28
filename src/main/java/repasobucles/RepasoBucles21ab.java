package repasobucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Repaso Bules ejercicio 21 :
 *
 */
public class RepasoBucles21ab {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce un numero: ");

        int num = teclado.nextInt();
        
        if (num == 5) {
            System.out.println("El numero es = a 5");
        } else { System.out.println("El numero es != a 5");
        }
      
    }
}
