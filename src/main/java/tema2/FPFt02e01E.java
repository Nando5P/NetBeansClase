

package tema2;
import java.util.Scanner;
/**
 *Fernando Parga Fernandez
 * Ejercicio 1E Introducir dos numeros mayores o menores a 10 de forma distinta
 */
public class FPFt02e01E {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num1,num2;
        
        System.out.print("Buenos dias, introduzca un primer numero: ");
        num1 = teclado.nextInt();
        System.out.print("Introduzca un segundo numero: ");
        num2 = teclado.nextInt();
        
        if ((num1  > 10 && 10 > num2)||(num1 < 10 && 10 < num2)) System.out.println("Uno de los numeros es mayor a 10 mientras que el otro es menor");
        else  System.out.println("Ambos numeros son mayores o menores a la vez que 10");
        
    }
}
