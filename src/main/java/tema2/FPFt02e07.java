

package tema2;
import java.util.Scanner;
/**
 *Fernando Parga Fernandez
 * Ejercicio 7: Realizar un programa que informe si un año introducido previamente es bisiesto o no. Son 
bisiestos los años múltiplos de 4 que no sean múltiplos de 100. Como excepción los múltiplos de 400 
también son bisiestos. Se puede hacer una primera versión con varias sentencias condicionales y 
otra más sofisticada con una sola. No usar las clases de fechas de Java.  

 */
public class FPFt02e07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int año;
        
        System.out.println("Buenos dias, introduzca un año para saber si es bisoesto o no: ");
        año = teclado.nextInt();
        
        if ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0)){
        System.out.println("El año es bisiesto");
        }else System.out.println("El año no es bisiesto");
        
        
    }
}
