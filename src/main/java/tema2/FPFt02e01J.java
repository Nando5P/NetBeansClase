

package tema2;
import java.util.Scanner;
/**
 *Fernando Parga Fernandez
 * Ejercicio 1J Leer dos números enteros y diga si el menor de ellos es divisor del mayor (prevenir 
divisiones por cero, que causan error) Repasar operadores en cortocircuito para hacer 
un solo if
 */
public class FPFt02e01J {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num1,num2;
        
        
        System.out.println("Buenos dias, introduzca dos numeros enteros para saber si el menor es divisor del mayor");
        System.out.print("Introduzca el primer numero: ");
        num1 = teclado.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        num2 = teclado.nextInt();
        
        if  (((num1 > num2) &&((num2 != 0) && (num1 % num2 == 0)) ) || ((num2 > num1) &&((num1 != 0) && (num2 % num1 == 0)) )) System.out.printf("El numero menor es dividendo del menor");
        else System.out.printf("El numero menor NO es dividendo del mayor");
        
    }
}
