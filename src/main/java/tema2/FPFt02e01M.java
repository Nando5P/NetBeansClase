

package tema2;
import java.util.Scanner;
/**
 *Fernando Parga Fernandez
 * Ejercicio 1M: Leer tres números enteros y diga si hay alguno mayor que cero, pero no todos.

 */
public class FPFt02e01M {

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
         
        if ((num1 > a) && (num2 > a) && (num3 > a)) System.out.print("Fallo, todos son mayores a 0");
        else 
            if ((num1 <= a) && (num2 <= a) && (num3 <= a)) System.out.print("Fallo, todos son menores a 0");
            else System.out.print("Correcto, alguno es mayore a 0");
            

       
        
    }
}
