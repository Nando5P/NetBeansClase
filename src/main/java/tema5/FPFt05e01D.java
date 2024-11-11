package tema5;

import java.util.Scanner;

public class FPFt05e01D {

    /*
* Ejercicio Calculo de área
* Fernando Parga Fernandez
* Ejercicio 1D: Realizar funciones que realicen los siguientes supuestos, y un main() desde el que se llame a 
* dichas funciones: 
* • Función llamada par() que se le pasa un entero y devuelve true si es par, false si no lo 
* es. 
* • Función llamada mayor() que se le pasan 3 double y devuelve el mayor de ellos. 
* • Función llamada sumaIntervalo() que le pasan dos long y devuelve otro long con la suma 
* de los números comprendidos entre los números pasados (el primero es menor que el 
* segundo, y ambos mayores que cero, en caso contrario devuelve -1) 
* • Función llamada contarCeros() que se le pasa una cadena y devuelve la cantidad de ceros 
* que tiene. 
* • Función llamada aleatorio() que se le pasan dos valores enteros devuelve un entero al 
* azar comprendido entre esos dos valores (el primero es menor que el segundo, y ambos 
* mayores que cero, en caso contrario devuelve -1) 
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
