

package tema2;
import java.util.Scanner;
/**
 *Fernando Parga Fernandez
 * Ejercicio 1H Decir entre dos numeros si son mayores, iguales o menores
 */
public class FPFt02e01H {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num1,num2;
        
        System.out.println("Buenos dias, introduzca dos numeros");
        System.out.print("Introduzca el primer numero: ");
        num1 = teclado.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        num2 = teclado.nextInt();
        
        if (num1 < num2) System.out.printf("El numero %d es  menor que %d", num1,num2);
        else if (num1 > num2) System.out.printf("El numero %d es  mayor que %d", num1,num2);
            else if (num1 == num2) System.out.println("Ambos numeros son iguales");
        
    }
}
