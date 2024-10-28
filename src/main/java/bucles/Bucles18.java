
package bucles;
import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 18: Escribe un programa que obtenga los
 * números enteros comprendidos entre dos números introducidos por teclado y
 * validados como distintos, el programa debe empezar por el menor de los
 * enteros introducidos e ir incrementando de 7 en 7.
 *
 */
public class Bucles18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num1, num2;

        System.out.println("Introduce dos numeros enteros distintos: ");
        System.out.println("Numero 1: ");
        num1 = teclado.nextInt();
        System.out.println("Numero 2: ");
        num2 = teclado.nextInt();

        if (num1 == num2) {
            System.out.println("Error, deben ser distintos.");
        } else {
            if (num1 < num2) {
                for (int i = num1; i <= num2; i += 7) {
                    System.out.println(i);
                }
            } else {
                for (int i = num2; i <= num1; i += 7) {
                    System.out.println(i);
                }
            }
        }
    }
}
