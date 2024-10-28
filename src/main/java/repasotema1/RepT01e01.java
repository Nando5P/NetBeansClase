 /*
 * Ej: Area de un cuadrado
 * Nando
 */

package repasotema1;
import java.util.Scanner;
public class RepT01e01 {
   

    public static void main(String[] args) {
        double a,b;
        
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cual es el tamanho del area del cuadrado?");
        a = teclado.nextFloat();
        b = a * a;
        System.out.println("El sarea es: " + b);
    }
}
