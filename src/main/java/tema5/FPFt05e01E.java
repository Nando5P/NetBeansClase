package tema5;

import java.util.Scanner;

public class FPFt05e01E {

    /*
* Ejercicio Calculo de área
* Fernando Parga Fernandez
* Ejercicio 1E: Realizar funciones que realicen los siguientes supuestos, y un main() desde el que se llame a 
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
        int num1, num2;

        System.out.println("Introduce dos numeros enteros: ");
        System.out.println("Primero: ");
        num1 = teclado.nextInt();
        System.out.println("Segundo: ");
        num2 = teclado.nextInt();

        int numAleatorio = aleatorio(num1, num2);
        System.out.println("Numero aleatorio: " + numAleatorio);
    }

    public static int aleatorio(int num1, int num2) {

        if (num1 >= 0 && num2 >= 0 && num1 < num2) {
            return (int) (Math.random() * (num2 - num1 + 1) + num1);

        } else {
            return -1;
        }
    }
}