 /*
 * Ej: Realiza un programa que visualice en pantalla el código ASCII (el código ASCII está
 *incluido en el Unicode) de los caracteres 'r' y 'R' y sin usar la tabla ASCII.
 *Pista: Las operaciones de casting pueden servir para que una variable de un tipo sea vista
 *como de otro tipo.
 *
 *
 * Nando
 */

package repasotema1;
import java.util.Scanner;
public class RepT01e04 {
   

    public static void main(String[] args) {
        Scanner  teclado = new Scanner(System.in);
        char caracterMinuscula = 'r';
        char caracterMayuscula = 'R';
        
        int codigoAsciiMinuscula = (int) caracterMinuscula;
        int codigoAsciiMayuscula = (int) caracterMayuscula;
                     
        System.out.println("El código ASCII de '" + caracterMinuscula + "' es: " + codigoAsciiMinuscula);
        System.out.println("El código ASCII de '" + caracterMayuscula + "' es: " + codigoAsciiMayuscula);
        
    }
}
