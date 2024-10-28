/*
*Operaciones matematicas
*Fernando Parga Fernandez
*/
package Tema1;
import java.util.Scanner;
public class FPFt01e03 {
public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
        int a,b,c,d,e;
       float f;
       
        System.out.print("Introduce valor de a: ");
        a = teclado.nextInt ();
        System.out.print("Introduce valor de b: ");
        b = teclado.nextInt ();
        c = a + b;
        System.out.println("Suma: " + c);
        d = a - b; 
        System.out.println("Resta: " + d);
        e = a * b;
        System.out.println("Multiplicacion: " + e);
        f = (float) a / b;
        System.out.print("division: " + f);
   }

    
}

