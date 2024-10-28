

package tema2;
import java.util.Scanner;
/**
 *Fernando Parga Fernandez
 * Ejercicio 5: Diseñar un algoritmo al que se le introduzca la cantidad de horas, minutos y segundo 
mostrados en un reloj digital, que verifique que los valores sean correctos y calcule el total de 
segundos transcurridos desde el comienzo del día. No emplear las clases de fecha de Java. 
23:59:57 será una hora correcta y 25:61:88 será una hora incorrecta 
 */
public class FPFt02e05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int hora,min,seg,tiempo;
        
        System.out.println("Buenos dias, introduzca actual");
        System.out.print("Horas: ");
        hora = teclado.nextInt();
        System.out.print("Minutos: ");
        min = teclado.nextInt();
        System.out.print("Segundos: ");
        seg = teclado.nextInt();
        tiempo = ((hora * 3600) + (min * 60) + seg);
        if ((hora <= 23) && (min <=59) && (seg <= 59) && (hora >= 0) && (min >=0) && (seg >= 0)){
            System.out.println("El tiempo transcurrido en segundos el dia de hoy es de: " + tiempo + " segundos");
        }else System.out.println("La hora introducida no es correcta");
 
    }
}
