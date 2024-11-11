package tema5;

import java.util.Scanner;

public class FPFt05e02 {

    /*
* Ejercicio Calculo de área
* Fernando Parga Fernandez
* Ejercicio 2: Programa que presente un menú y permita calcular repetidas veces a) el área de círculo –
* necesitará el radio- , b) el área de cuadrado –necesitará el lado - , c) el área de triángulo –necesitará 
* base y altura – d) Salir. Usar funciones para cada una de las 3 opciones. 
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce una cadena para contar ceros (0): ");
        String cadena = teclado.next();

        int cantidadCeros = contarCeros(cadena);
        System.out.println("La suma de ceros es: " + cantidadCeros);
    }

    public static int contarCeros(String cadena) {

        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '0') {
                contador++;
            }
        }
        return contador;
    }
}
