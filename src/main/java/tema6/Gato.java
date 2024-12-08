
package tema6;

import java.util.Random;

public class Gato {
    
private int posXgato, posYgato;
        private Random random = new Random();

        public Gato(int filas, int columnas) {
            this.posXgato = random.nextInt(filas);
            this.posYgato = random.nextInt(columnas);
        }

        public int getPosicionX() { return posXgato; }
        public int getPosicionY() { return posYgato; }

        public void movimientoGato(int filaRaton, int columnaRaton) {
            if (posXgato < filaRaton) posXgato++;
            else if (posXgato > filaRaton) posXgato--;

            if (posYgato < columnaRaton) posYgato++;
            else if (posYgato > columnaRaton) posYgato--;
        }
    }
