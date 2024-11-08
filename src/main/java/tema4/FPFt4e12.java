package tema4;

import java.util.Scanner;

public class FPFt4e12 {

    /*
* Ejercicio Calculo de área
* Fernando Parga Fernandez
* Ejercicio 12: Realizar un programa que solicite la entrada de una cadena de 6 posiciones, que todas sean 
* dígitos y sin repetidos. Si no cumple esas condiciones, el usuario deberá introducirla de nuevo hasta 
* que lo haga correctamente. 
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        while (true) {
            System.out.print("Introduce una cadena de 6 dígitos sin repetidos: ");
            String cadena = teclado.nextLine();

            if (esCadenaValida(cadena)) {
                System.out.println("Cadena válida: " + cadena);
                break;
            } else {
                System.out.println("Cadena no válida. Inténtalo de nuevo.");
            }
        }

    }

    private static boolean esCadenaValida(String cadena) {
        // Verifica que la cadena tenga exactamente 6 caracteres
        if (cadena.length() != 6) {
            return false;
        }

        /* Que cada caracter sea un digito y no se repita */
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);

            /* Comprobar si el caracter es un digito */
            if (!Character.isDigit(c)) {
                return false;
            }
            /* Comprobar si el digito actual se repite en otra posición */
            for (int j = i + 1; j < cadena.length(); j++) {
                if (c == cadena.charAt(j)) {
                    return false;
                }
            }

        }
        return true;
    }

}



