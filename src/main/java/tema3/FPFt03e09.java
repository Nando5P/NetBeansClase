package tema3;

import java.util.Scanner;

public class FPFt03e09 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 9: Sumar una cantidad de números que se van introduciendo por teclado hasta que la suma de 
los mismos valga más de 100.  
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n, valor;

               valor = 0;

        while (valor <= 100) {
            System.out.println("Introduzca un numero para sumar hasta llegar a 100: ");
            n = teclado.nextInt();
            valor += n;

        }
        System.out.println("La suma ya pasa de 100: " + valor);

    }
}
