 /*
 * Ej: . ¿Qué tipos de datos se necesitan para calcular la suma y la media de cuatro números de
tipo int? Escribe un programa para comprobarlo.
 *
 *
 * Necesitaria datos de tipo int o float/double
 *
 * Nando
 */

package repasotema1;
import java.util.Scanner;
public class RepT01e03 {
   

    public static void main(String[] args) {
        int a,b,c,d;
        double media;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca el primer numero");
        a = teclado.nextInt();
        System.out.println("Introduzca el segundo numero");
        b = teclado.nextInt();
        System.out.println("Introduzca el tercer numero");
        c = teclado.nextInt();
        System.out.println("Introduzca el cuarto numero");
        d = teclado.nextInt();
        media = (a + b + c + d) / 4;
        System.out.println("La media es de: " + media);
    }
}
