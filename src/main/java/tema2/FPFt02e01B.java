

package tema2;
import java.util.Scanner;
/**
 *Fernando Parga Fernandez
 * Ejercicio 1B Introducir dos numeros y decir si el primero es mayor o menor
 */
public class FPFt02e01B {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num1,num2;
        
        System.out.print("Buenos dias, introduzca un primer numero: ");
        num1 = teclado.nextInt();
        System.out.print("Introduzca un segundo numero: ");
        num2 = teclado.nextInt();
        
        if (num1 > num2) System.out.println("EL numero " + num1 + " es mayor que " + num2);
        else if (num1 < num2) System.out.print("EL numero " + num1 + " es menor que " + num2);
        
    }
}
