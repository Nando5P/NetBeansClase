package tema4;

import java.util.Scanner;

public class FPFt4e10 {

    /*
* Ejercicio Calculo de área
* Fernando Parga Fernandez
* Ejercicio 10: Realizar un programa que solicite la entrada de 10 cadenas de caracteres y construya una 
* cadena con el primer carácter de cada cadena. Finalmente mostrará dicha cadena por pantalla. 

     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        StringBuilder resultado = new StringBuilder();

        for (int i = 1; i <= 10; i++) {
            System.out.println("Introduce la cadena " + i + ": ");
            String cadena = teclado.nextLine();

            if (!cadena.isEmpty()) {
                resultado.append(cadena.charAt(0));
            } else {
                System.out.println("La cadena está vacia, no se añadira nada.");
            }
        }
        System.out.println("La cadena resultante es: " + resultado.toString());

    }
}
