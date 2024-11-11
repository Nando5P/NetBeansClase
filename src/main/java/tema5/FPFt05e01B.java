package tema5;

import java.util.Scanner;

public class FPFt05e01B {

    /*
* Ejercicio Calculo de área
* Fernando Parga Fernandez
* Ejercicio 1B: Realizar funciones que realicen los siguientes supuestos, y un main() desde el que se llame a 
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
        double num1, num2, num3;

        System.out.println("Introduce tres numeros: ");
        System.out.println("Primero: ");
        num1 = teclado.nextDouble();
        System.out.println("Segundo: ");
        num2 = teclado.nextDouble();
        System.out.println("Tercero: ");
        num3 = teclado.nextDouble();

        double mayor = mayor(num1, num2, num3);
        System.out.println("EL mayor es: " + mayor);

    }

    public static double mayor(double num1, double num2, double num3) {

        if ((num1 > num2) && (num1 > num3)) {
            return num1;
        } else if ((num2 > num1) && (num2 > num3)) {
            return num2;
        } else {
            return num3;
        }
    }
}
