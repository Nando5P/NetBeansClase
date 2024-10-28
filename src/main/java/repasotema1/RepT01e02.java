 /*
 * Ej: 
 Realiza un programa en Java que calcule y muestre por pantalla el perímetro y el área de
un círculo. El valor del radio será de tipo double y asignamos nosotros uno cualquiera. El
valor de PI, lo definimos como una constante también de tipo double.
Área = pi * radio2
Perímetro = 2 * pi * radio.
 * Nando
 */

package repasotema1;
import java.util.Scanner;
public class RepT01e02 {
   

    public static void main(String[] args) {
        double radio,area,perimetro;
        /*final double pi = 3.14;
        * COMO OPCION
        */
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cual es el tamanho del radio?");
        radio = teclado.nextFloat();
        area = Math.PI * (radio * radio);
        perimetro = 2 * Math.PI * radio;
        System.out.printf("El sarea es de %.2f y el perimetro de %.2f ", area,perimetro);
    }
}
