package tema3;

import java.util.Scanner;

public class FPFt03e16 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 16: Programar el siguiente juego. El ordenador genera un número al azar entre 0 y 99 que habrá 
que adivinar. El jugador intentará adivinar el número y el programa le responderá si es mayor, menor 
o si ha acertado. Se dispone de un máximo de 5 intentos   
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int i, num;
        int contador = 1;

        i = (int) (Math.random() * 99 + 0);
        System.out.println("Intenta adivinar mi numero. Tienes 5 intentos");

        do {
            System.out.println("Tienes " + (6 - contador) + " intentos.");
            System.out.println("Introduce tu numero: ");
            num = teclado.nextInt();
            if (num == i) {
                System.out.println("Acertaste!!"); break;
            } else if (num < i) {
                System.out.println("Fallo, mi numero es mayor");
            } else {
                System.out.println("Fallo, mi numero es menor");
            }
            contador += 1;

        } while (contador <= 5);
System.out.println("Mi numero es: " + i);
    }
}
