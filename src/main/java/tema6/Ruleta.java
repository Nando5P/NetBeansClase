package tema6;



public class Ruleta {
    
 private int numeroGanador;

    public int girarRuleta() {
        this.numeroGanador = (int) (Math.random() * 37);
        return this.numeroGanador;
    }

    public boolean apostarPar(int cantidadApostada) {
        if (numeroGanador == 0) {
            System.out.println("El numero ganador es 0. Has perdido tu apuesta.");
            return false;
        }
        boolean esPar = (numeroGanador % 2 == 0) ? true : false;
        if (esPar) {
            System.out.println("Felicidades! Has ganado " + (cantidadApostada * 2) + " euros.");
            return true;
        } else {
            System.out.println("Has perdido tu apuesta de " + cantidadApostada + " euros.");
            return false;
        }

    }

    public boolean apostarImpar(int cantidadApostada) {
        if (numeroGanador == 0) {
            System.out.println("El numero ganador es 0. Has perdido tu apuesta.");
            return false;
        }
        boolean esImpar = (numeroGanador % 2 != 0) ? true : false;
        if (esImpar) {
            System.out.println("Felicidades! Has ganado " + (cantidadApostada * 2) + " euros.");
            return true;
        } else {
            System.out.println("Has perdido tu apuesta de " + cantidadApostada + " euros.");
            return false;
        }
    }
}
