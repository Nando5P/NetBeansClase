

package tema2;
import java.util.Scanner;
/**
 *Fernando Parga Fernandez
 * Ejercicio 1L  Leer tres números enteros y diga hay alguno mayor que cero

 */
public class FPFt02e01L {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num1,num2,num3;
        final int a = 0;
        
        System.out.println("Buenos dias, introduzca tres numeros enteros para saber si alguno es mayor a 0");
        System.out.print("Introduzca el numero 1: ");
        num1 = teclado.nextInt();
        System.out.print("Introduzca el numero 2: ");
        num2 = teclado.nextInt();
        System.out.print("Introduzca el numero 3: ");
        num3 = teclado.nextInt();
         
        if ((num1 > a) || (num2 > a ) || (num3 > a))   System.out.printf("Al menos uno de los numeros es mayor a 0");
        else System.out.print("Ninguno de los numeros es mayor a 0");
            

       
        
    }
}
