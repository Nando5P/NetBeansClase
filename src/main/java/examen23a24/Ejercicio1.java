package examen23a24;

import java.util.Scanner;

/**
 *
 * @author fernando.pargafernan
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double numero = 0;
        double sumaMultiplos = 0;
        double contadorMultiplos=0;

        do {
            System.out.println("Introduce un numero menor de 50 y mayor a 0: ");
            numero = teclado.nextInt();
        } while (numero > 50 || numero < 0);

        for (double i = 0; i <= numero; i++) {
            if (i % 7 == 0) {
                sumaMultiplos += i;
                contadorMultiplos++;
            }
        }

        System.out.println("La susma de todos los multiplos de 7 encontrados es: " + sumaMultiplos);
        System.out.println("Hay un total de " + contadorMultiplos + " multiplos");
        double raizCuadrada = Math.sqrt(sumaMultiplos);
        
        System.out.println("Su raiz cuadrada es: " + raizCuadrada);
        
        double division = (raizCuadrada/contadorMultiplos);
        
        System.out.println("La division es: " + division);
        System.out.printf("La division redondeada a 3 decimales es: %.3f " , division);
        
        
    }
}
