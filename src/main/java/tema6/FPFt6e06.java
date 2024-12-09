package tema6;

import java.util.Scanner;

/**
* 
* A partir de las clases Nim  y Consola, crea un programa que juegue al NIM contra la máquina. 
* Se trata de un tablero con 3 filas de palillos, con 3, 5 y 7 palillos respectivamente. Dos jugadores por 
* turnos alternos (el usuario y la máquina) han de retirar palillos del tablero perdiendo el que se quede 
* el último palillo. En cada turno se pueden retirar uno o más palillos, pero solo de una misma fila.  
* Por lo tanto, la estructura del programa será la siguiente: primero se crea el juego. Luego habrá un 
* bucle mientras no gane ninguno de los dos y, dentro del bucle, primero piensa la máquina, luego 
* hace su jugada, y se comprueba si ha ganado. Si no ha ganado, introduces los valores de tu jugada 
* (fila y cantidad de palillos) y juegas. Se comprueba si has ganado y así sucesivamente hasta que gane 
* uno de los dos.  
*/
public class FPFt6e06 {

    public static void main(String[] args) {
         Nim tablero = new Nim(); // Crear el tablero del juego
        boolean finJuego = false; // Indicador de fin de juego

        System.out.println("¡Bienvenido al juego de Nim!");
        System.out.println("Reglas: En cada turno, puedes retirar uno o más palillos de una misma fila.");
        System.out.println("Pierde quien se quede con el último palillo.");
        System.out.println("Empieza la máquina... ¡Buena suerte!");

        // Bucle principal del juego
        while (!finJuego) {
            // Turno de la máquina
            int jugadaMaquina = tablero.piensa();
            int filaMaquina = jugadaMaquina / 10;
            int cantidadMaquina = jugadaMaquina % 10;

            System.out.println("\nTurno de la máquina:");
            System.out.println("La máquina retira " + cantidadMaquina + " palillos de la fila " + (filaMaquina + 1) + ".");
            tablero.juega(filaMaquina, cantidadMaquina);
            Consola.pintarTablero(tablero);

            // Verificar si la máquina ganó
            if (tablero.fin()) {
                System.out.println("¡La máquina ha ganado!");
                finJuego = true;
                break;
            }

            // Turno del jugador
            System.out.println("\nTu turno:");
            int filaJugador = Consola.leerEntero("Introduce el número de la fila (1-3): ") - 1;
            int cantidadJugador = Consola.leerEntero("Introduce la cantidad de palillos que quieres retirar: ");

            // Validar y realizar la jugada del jugador
            if (tablero.juega(filaJugador, cantidadJugador)) {
                System.out.println("Has retirado " + cantidadJugador + " palillos de la fila " + (filaJugador + 1) + ".");
                Consola.pintarTablero(tablero);
            } else {
                System.out.println("Jugada inválida. Intenta de nuevo.");
                continue; // Repetir el turno del jugador
            }

            // Verificar si el jugador ganó
            if (tablero.fin()) {
                System.out.println("¡Felicidades, has ganado!");
                finJuego = true;
            }
        }

        System.out.println("¡Gracias por jugar!");
    }
}