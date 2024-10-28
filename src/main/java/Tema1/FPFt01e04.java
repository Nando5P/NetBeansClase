/*
*Porcentajes
Fernando Parga Fernandez
*/
package Tema1;
import java.util.Scanner;
public class FPFt01e04 {
public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);
    int a,b,c,d,alumnos;
    float aprobados,notsob;

        System.out.print("Introduce numero de suspensos: ");
        a = teclado.nextInt ();
        System.out.print("Introduce numero de suficientes: ");
        b = teclado.nextInt ();
        System.out.print("Introduce notables: ");
        c = teclado.nextInt ();
        System.out.print("Introduce el numero de sobresalientes: ");
        d = teclado.nextInt ();
        alumnos = a + b + c + d;
        aprobados =  (float) ((b + c + d)* 100) / alumnos;
        System.out.println("El total de alumnos es: " +alumnos);
        System.out.println("El porcentaje de aprobados es: " +aprobados +"%");
         notsob =  (float) ((c + d)* 100) / alumnos;
        System.out.println("El porcentaje de notables y sobresalientes es: " +notsob);
        
         }

    
}

