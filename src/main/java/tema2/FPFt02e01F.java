

package tema2;
import java.util.Scanner;
/**
 *Fernando Parga Fernandez
 * Ejercicio 1E Introducir dos numeros mayores o menores a 10 de forma distinta
 */
public class FPFt02e01F {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num;
        
        System.out.print("Buenos dias, introduzca un numero: ");
        num = teclado.nextInt();
        
        
        if (10 <= num && num <= 20) System.out.println("El numero seleccionado esta entre 10 y 20 ambos incluidos");
        else  System.out.println("El numero elegido no esta entre el 10 y el 20");
        
    }
}
