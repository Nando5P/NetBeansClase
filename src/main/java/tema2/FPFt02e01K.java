package tema2;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 1K Leer un número y decir si es múltiplo
 * de 2, de 3 y/o de 10. Si no es múltiplo de 2 ya no hay que mirar si lo es de
 * 10.
 *
 */
public class FPFt02e01K {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;

        System.out.println("Buenos dias, introduzca numero enteros para saber si ees multiplo de 2, 3 y/o 10: ");
        System.out.print("Introduzca el numero: ");
        num = teclado.nextInt();

        if ((num % 10 == 0) && (num % 3 == 0)) {
            System.out.printf("El numero es multiplo de 2, 3 y 10");
        } else if ((num % 2 == 0) && (num % 3 == 0)) {
            System.out.printf("El numero es multiplo de 2 y 3");
        } else if (num % 10 == 0) {
            System.out.printf("El numero es multiplo de 2 y 10");
        } else if (num % 3 == 0) {
            System.out.printf("El numero es multiplo de 3");
        } else if (num % 2 == 0) {
            System.out.printf("El numero es multiplo de 2");
        } else {
            System.out.printf("El no es multiplo de 2, 3 y/o 10");
        }

    }
}
