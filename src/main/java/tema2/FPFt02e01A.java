

package tema2;
import java.util.Scanner;
/**
 *Fernando Parga Fernandez
 * Ejercicio 1A Determinar si un número es mayor o menor a 10
 */
public class FPFt02e01A {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num;
        
        System.out.print("Buenos dias, introduzca un numero: ");
        num = teclado.nextInt();
        
        if (num > 10) System.out.println("EL numero  es mayor a diez");
        else if (num < 10) System.out.print("El numero es menos a diez");
        
    }
}
