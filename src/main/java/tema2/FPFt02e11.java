package tema2;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 11: Realizar un programa al que se le introduzcan DIA, MES, AÑO, que calcule el día siguiente. 
Suponemos que los valores son correctos, sin emplear las clases de fechas de Java. 
 */
public class FPFt02e11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia, mes, ano, ndias,newdia,newmes,newano;

        System.out.println("Buenos dias, introduzca numero de dia: ");
        dia = teclado.nextInt();
        System.out.println("Introduzca numero de mes: ");
        mes = teclado.nextInt();
        System.out.println("Introduzca anho: ");
        ano = teclado.nextInt();

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

        if ((dia < ndias) && (mes <= 12) && (dia > 0) && (mes > 0)) {
            newdia = dia + 1;
            newmes = mes;
            newano = ano;
            System.out.println("Maniana sera dia " + newdia + " del mes " + newmes + " del " + newano);
        } else {
            if ((dia == ndias) && (mes < 12) && (dia > 0) && (mes > 0)) {
            newdia = 1;
            newmes = mes + 1;
            newano = ano;
            System.out.println("Maniana sera dia " + newdia + " del mes " + newmes + " del " + newano);
            
            } else {
                if ((dia == ndias) && (mes == 12) && (dia > 0) && (mes > 0)) {
            newdia = 1;
            newmes = 1;
            newano = ano + 1;
            System.out.println("Maniana sera dia " + newdia + " del mes " + newmes + " del " + newano);
            
            } else System.out.println("La fecha no es correcta");
            }
        }

    }
}
