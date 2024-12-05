package tema6;

import java.util.Scanner;

/* 
* 6.13. Realiza un juego de la ruleta rusa para dos jugadores. La
* pistola tiene 6 huecos en la recámara pero solo una bala. Al empezar
* la partida se genera una posición al azar de la recámara para la bala
* de forma que puede salir en el primer disparo, en el segundo, etc.
* hasta el sexto. Los jugadores irán disparando sucesivamente hasta que
* uno de los dos se muera. Crea una clase Pistola con los atributos y
* métodos que la definen.
*/
public class FPFt6e13 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Pistola pistola = new Pistola();
        boolean juegoActivo = true;
        int jugadorActual = 1;
        System.out.println("Que comience la Ruleta Rusa, el juego en el que te lo pasas de muerte!");
        while (juegoActivo) {
            System.out.println("\nTurno del jugador " + jugadorActual + ". Que la suerte vaya contigo.");
            System.out.println("Jugador " + jugadorActual + " pulsa enter para disparar.");
            teclado.nextLine();
            if (pistola.disparar()) {
                System.out.println("BANG BANG BANG! El jugador " + jugadorActual + " ha muerto");
                juegoActivo = false;
            } else {
                System.out.println("Disparo afortunado el jugador " + jugadorActual + " sobrevive, por ahora...");
                jugadorActual = (jugadorActual == 1) ? 2 : 1;
            }
        }
        System.out.println("El juego termina con la tragica y estupida muerte del jugador "+ jugadorActual+ ". Gracias por jugar.");
    }

}