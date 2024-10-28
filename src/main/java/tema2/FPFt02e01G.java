

package tema2;
import java.util.Scanner;
/**
 *Fernando Parga Fernandez
 * Ejercicio 1G Introducir dos numeros y solo uno mayor a 10
 */
public class FPFt02e01G {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num1,num2;
        
        System.out.println("Buenos dias, introduzca dos numero de los cuales solo uno sea mayor a 10");
        System.out.print("Introduzca el primer numero: ");
        num1 = teclado.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        num2 = teclado.nextInt();
        
        if ((10 < num1 && num2 < 10) || (10 < num2 && num1 < 10)) System.out.println("Correcto");
        else 
            if (10 < num1 && num2 > 10) System.out.println("Error, solo uno de los numeros debe ser mayor a 10");
            else if(num1 < 10 && 10 > num2) System.out.print ("Error, al menos uno de los numeros debe ser mayor a 10");
    }
}
