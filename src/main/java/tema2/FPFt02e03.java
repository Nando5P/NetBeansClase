

package tema2;
import java.util.Scanner;
/**
 *Fernando Parga Fernandez
 * Ejercicio 3: Para aprobar el curso se valorará la nota del examen, la valoración del trabajo en clase y la 
nota de un trabajo práctico. Aprobarán los alumnos que estén en alguna de las siguientes 
situaciones: 
• Nota examen mayor o igual a 5 
• Nota examen entre 4 y 5, trabajo en clase mayor que cinco y trab. práctico mayor que 5. 
• Nota examen entre 4 y 5, y una nota mayor que 8 o en el trabajo práctico o en la valoración 
del trabajo en clase. 
Diseñar un algoritmo al que se le introduzcan por consola la nota del examen, la valoración del 
trabajo en clase y la nota del trabajo práctico y saque por pantalla si está aprobado o no, todo en 
con una sola sentencia condicional.
 */
public class FPFt02e03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double examen,Tclase,Tpractico;
        
        
        System.out.println("Buenos dias, introduzca las notas del alumno: ");
        System.out.print("Nota del examen: ");
        examen = teclado.nextDouble();
        System.out.print("Nota del trabajo en clase: ");
        Tclase = teclado.nextDouble();
        System.out.print("Nota del trabajo practico: ");
        Tpractico = teclado.nextDouble();
         
        if ((examen >= 5) || (((4 <= examen && examen < 5)) && (Tclase > 5) && (Tpractico > 5)) || (((4 <= examen && examen < 5)) && ((Tclase > 8) || (Tpractico > 8)))){
        System.out.println("APROBADO");
        }else System.out.println("SUSPENSO");
 
    }
}
