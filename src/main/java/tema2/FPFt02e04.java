

package tema2;
import java.util.Scanner;
/**
 *Fernando Parga Fernandez
 * Ejercicio 4: Programa al que se le introduzcan las coordenadas X e Y de dos puntos del plano, nos diga si 
 *lo que forman es un cuadrado o un rectángulo y calcule el área del mismo. 
 * Math.abs(x) obtiene el valor absoluto de x, sin signo. 
 */
public class FPFt02e04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int cordx1,cordy1,cordx2,cordy2,area;
        
        System.out.println("Buenos dias, introduzca las coordenadas de dos puntos");
        System.out.println("Primer punto: ");
        System.out.print("Coordenada X: ");
        cordx1 = teclado.nextInt();
        System.out.print("Coordenada Y: ");
        cordy1 = teclado.nextInt();
        System.out.println("Segundo punto: ");
        System.out.print("Coordenada X: ");
        cordx2 = teclado.nextInt();
        System.out.print("Coordenada Y: ");
        cordy2 = teclado.nextInt();
        area = Math.abs((cordx1 + cordx2) * (cordy1 + cordy2));
        
        if ((cordx1 == cordy1) && (cordx2 == cordy2)){
            System.out.print("Es un cuadrado, y su area es: " + area);
        }else System.out.println("Es un rectangulo y su area es: " + area);
 
    }
}
