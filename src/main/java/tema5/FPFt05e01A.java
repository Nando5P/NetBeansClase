package tema5;

import java.util.Scanner;

public class FPFt05e01A {

    /*
* Ejercicio Calculo de área
* Fernando Parga Fernandez
* Ejercicio 1A: Realizar funciones que realicen los siguientes supuestos, y un main() desde el que se llame a 
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

        System.out.println("Introduce un numero: ");
        int numero = teclado.nextInt();

        if (esPar(numero)) {
            System.out.println("Es par");
        } else {
            System.out.println("Es impar");
        }

    }

    public static boolean esPar(int numero) {

        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }
}
