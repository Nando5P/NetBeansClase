package tema2;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 14: Diseña un algoritmo capaz de obtener
 * la letra del DNI a partir del número de DNI. Consiste en dividir dicho número
 * entre 23 y tomar el resto de la división asignándole la letra correspondiente
 * según la siguiente tabla (Hacer con switch, no empleando ni arrays ni String
 */
public class FPFt02e14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int DNI, resto;
     /* char letra; */

        System.out.println("Buenos dias, introduzca su numero de DNI: ");
        DNI = teclado.nextInt();
        
        resto = (DNI % 23);
        switch (resto) {
            case 0 ->
                System.out.println("La letra correspondiente a su DNI es la \"T\" ");
                /* case 0 -> letra = 'T'; */
            case 1 ->
                System.out.println("La letra correspondiente a su DNI es la \"R\" ");
            case 2 ->
                System.out.println("La letra correspondiente a su DNI es la \"W\" ");
            case 3 ->
                System.out.println("La letra correspondiente a su DNI es la \"A\" ");
            case 4 ->
                System.out.println("La letra correspondiente a su DNI es la \"G\" ");
            case 5 ->
                System.out.println("La letra correspondiente a su DNI es la \"M\" ");
            case 6 ->
                System.out.println("La letra correspondiente a su DNI es la \"Y\" ");
            case 7 ->
                System.out.println("La letra correspondiente a su DNI es la \"F\" ");
            case 8 ->
                System.out.println("La letra correspondiente a su DNI es la \"P\" ");
            case 9 ->
                System.out.println("La letra correspondiente a su DNI es la \"D\" ");
            case 10 ->
                System.out.println("La letra correspondiente a su DNI es la \"X\" ");
            case 11 ->
                System.out.println("La letra correspondiente a su DNI es la \"B\" ");
            case 12 ->
                System.out.println("La letra correspondiente a su DNI es la \"N\" ");
            case 13 ->
                System.out.println("La letra correspondiente a su DNI es la \"J\" ");
            case 14 ->
                System.out.println("La letra correspondiente a su DNI es la \"Z\" ");
            case 15 ->
                System.out.println("La letra correspondiente a su DNI es la \"S\" ");
            case 16 ->
                System.out.println("La letra correspondiente a su DNI es la \"Q\" ");
            case 17 ->
                System.out.println("La letra correspondiente a su DNI es la \"V\" ");
            case 18 ->
                System.out.println("La letra correspondiente a su DNI es la \"H\" ");
            case 19 ->
                System.out.println("La letra correspondiente a su DNI es la \"L\" ");
            case 20 ->
                System.out.println("La letra correspondiente a su DNI es la \"C\" ");
            case 21 ->
                System.out.println("La letra correspondiente a su DNI es la \"K\" ");
            case 22 ->
                System.out.println("La letra correspondiente a su DNI es la \"E\" ");
        }
    }
}
