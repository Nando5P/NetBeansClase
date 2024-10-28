

package tema2;
import java.util.Scanner;
/**
 *Fernando Parga Fernandez
 * Ejercicio 1C Introducir un numero y decir si es par o impar
 */
public class FPFt02e01C {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num;
        
        System.out.print("Buenos dias, introduzca un numero: ");
        num = teclado.nextInt();
        
        
        if (num  % 2 == 0) System.out.println("EL numero es par");
        else  System.out.print("EL numero es impar");
        /*
        *Otra manera sería:
        * if (num  % 2 == 0) System.out.println("EL numero es par");
        * else  if (num  % 2 != 0) System.out.print("EL numero es impar");
        *
        */
    }
}
