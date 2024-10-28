

package tema2;
import java.util.Scanner;
/**
 *Fernando Parga Fernandez
 * Ejercicio 1D Introducir dos numeros mayores o menores a 10 simultaneamente
 */
public class FPFt02e01D {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num1,num2;
        
        System.out.print("Buenos dias, introduzca un primer numero: ");
        num1 = teclado.nextInt();
        System.out.print("Introduzca un segundo numero: ");
        num2 = teclado.nextInt();
        
        if ((num1  > 10 && 10 < num2)||(num1 < 10 && 10 > num2)) System.out.println("Ambos numeros son mayores o menores a la vez que 10");
        else  System.out.println("Ambos numeros no son mayores o menores a la vez que 10");
            
        
    }
}
