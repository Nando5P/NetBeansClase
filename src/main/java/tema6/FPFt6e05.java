package tema6;

import java.util.Scanner;

/**
* A partir de la clase Ahorcado que te proporcionará el profesor, crea un programa que permita 
* al usuario jugar al ahorcado. Desconocemos los atributos de la clase Ahorcado ya que son privados, 
* pero sus métodos públicos son: - - - - - - - 
* Constructor(String txtAdivinar, String txtPista). Crea el juego con la frase a adivinar y con un texto de 
* pista para el jugador. 
* Constructor(String txtAdivinar). Crea el juego con la frase a adivinar, sin pistas. 
* boolean probarLetra (char x). Comprueba si la letra pasada como parámetro está en la frase a adivinar, 
* en caso afirmativo, devuelve true¸  sino false. 
* boolean adivinada(). Devuelve true si se ha adivinado la frase, false en caso contrario. 
* boolean perdio(). Devuelve true si se ha llegado al número máximo de intentos sin adivinar la frase, 
* false en caso contrario. 
* char leerLetra (). Pide al usuario por consola una letra y devuelve dicha letra. 
* void pintar (). Dibuja un “tablero” en la consola, con el estado del juego. 
*/
public class FPFt6e05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Ahorcado juego = new Ahorcado("","");

        // Configuración del juego
        System.out.println("Introduce la frase que hay que adivinar: ");
        
        System.out.println("¡Bienvenido al juego del ahorcado!");
        System.out.print("Introduce la palabra o frase a adivinar: ");
        String txtAdivinar = teclado.nextLine();

        System.out.print("¿Quieres incluir una pista? (s/n): ");
        char incluirPista = teclado.nextLine().toLowerCase().charAt(0);

        if (incluirPista == 's') {
            System.out.print("Introduce la pista: ");
            String txtPista = teclado.nextLine();
            juego = new Ahorcado(txtAdivinar, txtPista);
        } else {
            juego = new Ahorcado(txtAdivinar); 
        }

        System.out.println("¡El juego comienza!");

        
        while (!juego.adivinada() && !juego.perdio()) {
            juego.pintar(); 
            char letra = juego.leerLetra(); 

            if (juego.probarLetra(letra)) {
                System.out.println("¡Bien hecho! La letra está en la frase.");
            } else {
                System.out.println("¡Uy! La letra no está en la frase.");
            }
        }

        // Final del juego
        juego.pintar(); 

        if (juego.adivinada()) {
            System.out.println("¡Felicidades! Has adivinado la frase.");
        } else if (juego.perdio()) {
            System.out.println("¡Lo siento! Has perdido el juego.");
        }

    }
}

