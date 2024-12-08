package tema6;

import java.util.Random;

public class Raton {
    
private int posXraton, posYraton;
        private Random random = new Random();

        public Raton(int filas, int columnas) {
            this.posXraton = random.nextInt(filas);
            this.posYraton = random.nextInt(columnas);
        }

        public int getPosicionX() { return posXraton; }
        public int getPosicionY() { return posYraton; }

        public void movimientoRaton(int filas, int columnas) {
            boolean movimientoValido = false;
            while (!movimientoValido) {
                int direccion = random.nextInt(4); // 0: arriba, 1: abajo, 2: izquierda, 3: derecha
                int nuevaFila = posXraton, nuevaColumna = posYraton;

                switch (direccion) {
                    case 0 -> nuevaFila -= 2; // Arriba
                    case 1 -> nuevaFila += 2; // Abajo
                    case 2 -> nuevaColumna -= 2; // Izquierda
                    case 3 -> nuevaColumna += 2; // Derecha
                }

                if (nuevaFila >= 0 && nuevaFila < filas &&
                    nuevaColumna >= 0 && nuevaColumna < columnas) {
                    posXraton = nuevaFila;
                    posYraton = nuevaColumna;
                    movimientoValido = true;
                }
            }
        }
    }
