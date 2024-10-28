

package tema2;
import java.util.Scanner;
/**
 *Fernando Parga Fernandez
 * Ejercicio 6: Un sistema de ecuaciones lineales de la forma: 
ax + by = c 
dx + ey = f 
puede resolverse utilizando las siguientes fórmulas: 
 =


  =


Realizar un programa que lea por teclado los dos conjuntos de coeficientes (a, b y c, y d, e y f) 
y calcule los valores para ‘x’ e ‘y’ según la fórmula descrita ¿Existen algunos casos para los 
cuales este algoritmo no funcione? Nota: cuando en matemáticas se escriben dos variables 
juntas, por ejemplo ‘ce’ quiere decir ‘c por e’. 
Solo hay que verificar que el denominador es distinto de cero 

 */
public class FPFt02e06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double a,b,c,d,e,f,x,y;
        double den1;
        System.out.println("Buenos dias vamos a resolver la siguiente operacion\n"
                + "ax + by = c\n"
                + "dx + ey = f");
       
        System.out.print("Valor de a: ");
        a = teclado.nextDouble();
        System.out.print("Valor de b: ");
        b = teclado.nextDouble();
         System.out.print("Valor de c: ");
        c = teclado.nextDouble();
        System.out.print("Valor de d: ");
        d = teclado.nextDouble();
         System.out.print("Valor de e: ");
        e = teclado.nextDouble();
        System.out.print("Valor de f: ");
        f = teclado.nextDouble();
        x = ((c * e) - (b * f)) / ((a * e) - (b * d));
        y = ((a * f) - (c * d)) / ((a * e) - (b * d));
        
        den1 = ((a * e) - (b * d));
        
        if (den1 != 0){
        System.out.printf("El valor de x es %.2f \n"
                + "El valor de y es %.2f", x,y);
       
        
        }else System.out.println("FALLO, el denominador es 0");
 
        /* Esta formula no seria valido cuando se tenga que dividir entre 0*/
        
    }
}
