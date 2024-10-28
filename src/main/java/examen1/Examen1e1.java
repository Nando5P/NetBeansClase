package examen1;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Fernando Parga Fernandez
 *
 */
public class Examen1e1 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int num;

        System.out.println("Introduce un numero desde el que quieras contar hasta llegar de forma regresiva a 0: ");

        do {

            num = teclado.nextInt();
            if (num < 0) {
                System.out.println("Numero no valido");
            } else {
                System.out.println("Iniciando cuenta regresiva hasta 0: ");
                for (int i = num; i >= 0; i--) {
                    System.out.println(i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Examen1e1.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            System.out.println("Desea hacer otra cuenta regresiva? (0 finaliza)");

        } while (num != 0);
    }
}
