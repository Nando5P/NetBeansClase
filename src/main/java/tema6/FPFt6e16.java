package tema6;

import java.util.Scanner;

/*
* (Opcional) Realiza mediante objetos un juego de Gato y Ratón: sobre un tablero que por el 
* momento es de 20 filas x 20 columnas (aunque podría cambiar el tamaño), el gato y ratón se sitúan 
* inicialmente en una posición al azar. En cada turno el gato y el ratón se mueven alternativamente. El 
* ratón es rápido pero ciego así que  se mueve de 2 en 2 casillas pero en una dirección aleatoria (si el 
* movimiento provocase que saliese del tablero, vuelve a generarlo hasta que sea un movimiento 
* válido). El gato se mueve de una en una casilla pero siempre en dirección hacia el ratón. El programa 
* termina cuando se encuentren. El programa mostrará la situación del tablero después de cada 
* movimiento (el usuario pulsará "ENTER" para que se produzca cada movimiento). Pistas: - - - 
* Hacer una clase TableroGatoRaton, con un constructor en el que se crea las dimensiones cantidad de 
* filas y cantidad de columnas. Esa clase tiene un método para pintar el tablero, por ejemplo, con un 
* punto para casillas vacías, una “G” para la posición del gato y una “R” para la posición del Ratón. 
* Hacer una clase Ratón y una clase Gato cuyas propiedades son su posición, con un constructor que 
* sitúa al gato o ratón en una posición inicial, y un método mover que cambia de posición, según las 
* reglas descritas. 
* Hacer un main() que cree un tablero, un ratón y un gato y alterne los movimientos de los dos últimos.
*/
public class FPFt6e16 {

    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

        int filas = 20, columnas = 20;
        Tablero tablero = new Tablero(filas, columnas);
        Raton Pancracio = new Raton(filas, columnas);
        Gato Tom = new Gato(filas, columnas);

        boolean juegoTerminado = false;

        while (!juegoTerminado) {
            tablero.dibujarTablero(Tom.getPosicionX(), Tom.getPosicionY(),
                                   Pancracio.getPosicionX(), Pancracio.getPosicionY());
            System.out.println("Presiona <ENTER> para continuar...");
            scanner.nextLine();

            if (Pancracio.getPosicionX() == Tom.getPosicionX() &&
                Pancracio.getPosicionY() == Tom.getPosicionY()) {
                System.out.println("El gato atrapo al raton");
                juegoTerminado = true;
                break;
            }

            Pancracio.movimientoRaton(filas, columnas);

            tablero.dibujarTablero(Tom.getPosicionX(), Tom.getPosicionY(),
                                   Pancracio.getPosicionX(), Pancracio.getPosicionY());
            System.out.println("Presiona <ENTER> para continuar...");
            scanner.nextLine();

            if (Pancracio.getPosicionX() == Tom.getPosicionX() &&
                Pancracio.getPosicionY() == Tom.getPosicionY()) {
                System.out.println("El gato atrapó al raton");
                juegoTerminado = true;
                break;
            }

            Tom.movimientoGato(Pancracio.getPosicionX(), Pancracio.getPosicionY());
        }

        scanner.close();
    }
}