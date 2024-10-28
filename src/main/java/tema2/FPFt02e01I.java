

package tema2;
import java.util.Scanner;
/**
 *Fernando Parga Fernandez
 * Ejercicio 1I segundo numero divisor del primero
 */
public class FPFt02e01I {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num1,num2;
        double resultado;
        
        System.out.println("Buenos dias, introduzca dos numeros enteros en los que el segundo sea divisor del primer numero");
        System.out.print("Introduzca el primer numero: ");
        num1 = teclado.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        num2 = teclado.nextInt();
        
        if ((num2 != 0) && (num1 % num2 == 0)) System.out.printf("El numero %d es dividendo de %d", num2,num1);
        else System.out.printf("El numero %d no es dividendo de %d", num2,num1);
        
    }
}
