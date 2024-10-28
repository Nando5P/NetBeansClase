package tema3;

import java.util.Scanner;

public class FPFt03e20 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 20: Programa que muestre los número primos comprendidos entre 2 y 1000. Hacer los bucles 
con un número mínimo de iteraciones (se permite el uso de break) sabiendo que: 
- Un número primo es solo divisible por 1 y el mismo.
- Los números primos son todos impares salvo el 2. 
- Los divisores de un número siempre son menores que la mitad de dicho número (salvo el 
mismo). 
- Si un número no es divisible por 2 ya no va a serlo por ningún otro número par.
     */
    public static void main(String[] args) {
        System.out.println(2); // El 2 es el único número primo par

        for (int num = 3; num <= 1000; num += 2) { // Solo probamos números impares
            boolean esPrimo = true;

            // No hace falta probar divisores mayores que la raíz cuadrada del número
            for (int divisor = 3; divisor <= Math.sqrt(num); divisor += 2) {
                if (num % divisor == 0) {
                    esPrimo = false;
                    break; // Si encontramos un divisor, salimos del bucle
                }
            }

            if (esPrimo) {
                System.out.println(num);
            }
        }
    }
}
