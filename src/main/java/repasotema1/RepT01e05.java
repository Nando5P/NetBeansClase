 /*
 * Ej:Prueba el programa del Ámbito de las variables.
a) ¿Qué ocurre si a nivel de clase defino la variable int i = 5 y a nivel del método main
defino una variable int i =10? ¿Cuál de las 2 variables veo en pantalla al intentar
mostrar la i?
b) ¿Y qué sucede si además de las 2 anteriores, ahora a nivel del bloque interno al
método defino una variable int i = 15?
 *
 *
 * Nando
 */

package repasotema1;
import java.util.Scanner;
public class RepT01e05 {
   int i = 5;

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
               
       int i = 10;/* Al añadir solo dos variables la primera se sustituye por la segunda */
        /*int i = 15; si añadimos esta variable da error*/
        System.out.println(i);
        
        
    }
}
