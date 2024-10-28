package tema2;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 12: Introduciendo dos fechas (día, mes,
 * año), hacer un programa que nos diga cuál de las dos es mayor (agrupa las
 * condiciones de día, mes y año en una sola sentencia condicional). Suponemos
 * que se introducen fechas válidas y no empleamos las clases de fecha de Java.
 */
public class FPFt02e12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, ano, ndias, dia2, mes2, ano2, ndias2;

        System.out.println("Buenos dias, introduzca numero de dia: ");
        dia = teclado.nextInt();
        System.out.println("Introduzca numero de mes: ");
        mes = teclado.nextInt();
        System.out.println("Introduzca anho: ");
        ano = teclado.nextInt();
        System.out.println("Buenos dias, introduzca numero de dia: ");
        dia2 = teclado.nextInt();
        System.out.println("Introduzca numero de mes: ");
        mes2 = teclado.nextInt();
        System.out.println("Introduzca anho: ");
        ano2 = teclado.nextInt();

        ndias = switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                31;
            case 2 -> {
                if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default ->
                30;
        };
        ndias2 = switch (mes2) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                31;
            case 2 -> {
                if ((ano % 4 == 0) && (ano % 100 != 0) || (ano % 400 == 0)) {
                    yield 29;
                } else {
                    yield 28;
                }
            }
            default ->
                30;
        };

        if ((dia <= ndias) && (mes <= 12) && (dia >= 0) && (mes >= 0) && (dia2 <= ndias2) && (mes2 <= 12) && (dia2 >= 0) && (mes2 >= 0) && ((ano > ano2) || ((mes > mes2) && (ano == ano2)) || ((dia > dia2) && (mes == mes2) && (ano == ano2)))) {

            System.out.println("El primer año es mayor que el segundo ");
        } else {
            if ((dia <= ndias) && (mes <= 12) && (dia >= 0) && (mes >= 0) && (dia2 <= ndias2) && (mes2 <= 12) && (dia2 >= 0) && (mes2 >= 0)) {
                System.out.println("El primer año es meno que el segundo ");

            } else {
                System.out.println("ERROR, introduzca fechas validas");

            }
        }

       
    }
}
