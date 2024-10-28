package examen1;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez
 *
 */
public class Examen1e3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean continuar = true;
        
        
        System.out.println("--- Consulta de  Disponibilidad de Funciones de Cine ---");
        System.out.println("Introduzca un numero del uno al siete para saber el dia de la semana (Lunes=L, Martes=M, Miercoles=X...)");
        

        do {
            System.out.println("Introduzca un numero del uno al siete para saber el dia de la semana (Lunes=L, Martes=M, Miercoles=X...)");
        char dia = teclado.next().charAt(0);
            switch (dia) {
                case 'L','X', 'V' -> {
                    System.out.println("Hay funciones a las 16:00, 18:00 y 21:00.");
                }
                case 'M', 'J' -> {
                    System.out.println("Hay funciones a las 17:00 y 20:00.");
                }
                case 'S','D' -> {
                    System.out.println("Hay funciones desde las 14:00hasta las 22:00.");
                }

                default ->
                    System.out.println("El día seleccionado no es valido.");
            }
             System.out.print("¿Alguna consulta mas? (s/n): ");
            char respuesta = teclado.next().charAt(0);
            teclado.nextLine(); 

            if (respuesta == 'n' || respuesta == 'N') {
                continuar = false;
            }
            
        } while (continuar);
    }
}
