package tema6;



public class Tablero {
    
        private int cantFilas, cantColumnas;

        public Tablero(int cantFilas, int cantColumnas) {
            this.cantFilas = cantFilas;
            this.cantColumnas = cantColumnas;
        }

        public void dibujarTablero(int filaGato, int columnaGato, int filaRaton, int columnaRaton) {
            for (int i = 0; i < cantFilas; i++) {
                for (int j = 0; j < cantColumnas; j++) {
                    if (i == filaGato && j == columnaGato) System.out.print("G ");
                    else if (i == filaRaton && j == columnaRaton) System.out.print("R ");
                    else System.out.print(". ");
                }
                System.out.println();
            }
        }
    }

