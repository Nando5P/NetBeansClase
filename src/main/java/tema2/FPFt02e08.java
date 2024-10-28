package tema2;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 8: La tabla siguiente representa las horas
 * de salida de un bus. Diseña un algoritmo al que se le introduzca el día (1-7)
 * y la hora (9-14), verifique la entrada y nos informe si hay bus o no. Hacer
 * una primera condición que haga la verificación de la entrada de datos y otra
 * única condición para ver si hay bus.  *
 */
public class FPFt02e08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, hora;

        System.out.println("Buenos dias, introduzca un numero del uno al siete para saber el dia de la semana (Lunes=1, Martes=2,...) para saber si hay bus: ");
        dia = teclado.nextInt();
        System.out.println("Ahora introducza en punto desde las 9h hasta las 14h: ");
        hora = teclado.nextInt();

        switch (dia) {
            case 1 -> {
                if ((hora == 10) || (hora == 14)) {
                    System.out.println("El lunes a la hora elegida hay bus.");
                } else {
                    System.out.println("El lunes a la hora elegida no hay bus.");
                }
            }
           case 2 -> {
                if ((hora == 10) || (hora == 14)) {
                    System.out.println("El martes a la hora elegida hay bus.");
                } else {
                    System.out.println("El martes a la hora elegida no hay bus.");
                }
            }
           case 3 -> {
                if ((hora == 10) || (hora == 14)) {
                    System.out.println("El miercoles a la hora elegida hay bus.");
                } else {
                    System.out.println("El miercoles a la hora elegida no hay bus.");
                }
            }
           case 4 -> {
                if ((hora == 10) || (hora == 14) || (hora == 12)) {
                    System.out.println("El jueves a la hora elegida hay bus.");
                } else {
                    System.out.println("El jueves a la hora elegida no hay bus.");
                }
            }
           case 5 -> {
                if ((hora == 10) || (hora == 14)) {
                    System.out.println("El Viernes a la hora elegida hay bus.");
                } else {
                    System.out.println("El Viernes a la hora elegida no hay bus.");
                }
            }
           case 6 -> {
                if (hora == 10) {
                    System.out.println("El Sabado a la hora elegida hay bus.");
                } else {
                    System.out.println("El Sabado a la hora elegida no hay bus.");
                }
            }
           default -> System.out.println("El Domingo a esa hora tiene bus.");
        }

    }

}

