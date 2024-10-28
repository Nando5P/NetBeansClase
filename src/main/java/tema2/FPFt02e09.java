package tema2;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 9:  Realizar un programa al que se le introduzca la hora del día (0 –23) y nos diga que días de la 
semana hay salida de bus (utilizar la tabla anterior). 
 */
public class FPFt02e09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int hora;

        System.out.println("Buenos dias, introduzca la hora del dia para saber cuando tendra buses: ");
        hora = teclado.nextInt();
        
        switch (hora) {
            case 0,1,2,3,4,5,6,7,8 -> System.out.println("Ningun dia de la semana hay salida a esa hora.");
            case 9,11,13 -> System.out.println("Solamente hay salidad de buses el Domingo.");
            case 10 -> System.out.println("Toda la semana tiene salidas de buses.");
            case 12 -> System.out.println("Hay salidas jueves y domingos.");
            case 14 -> System.out.println("Salidas todos los dias menos el sabado.");
            case 15,16,17,18,19,20,21,22,23 -> System.out.println("Ningun dia de la semana hay salida a esa hora.");
            default -> System.out.println("Introduzca una hora correcta.");
        }
            }
           
        }

    

