package examen23a24;

import java.util.Scanner;

/**
 *
 * @author fernando.pargafernan
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Prenda prenda1 = new Prenda("pantalon", 38, 'M', 50.0, 21.0);
        Prenda prenda2 = new Prenda("camisa", 30.0);
        
        System.out.println(prenda1.toString());
        System.out.println(prenda2.toString());

    }
}
