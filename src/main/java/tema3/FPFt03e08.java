package tema3;

import java.util.Scanner;

public class FPFt03e08 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 8: Calcular la suma de los 100 números siguientes a uno tecleado previamente.  
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n,valor;

        System.out.println("Introduzca un numero al que le sumaremos los 100 siguientes: ");
        n = teclado.nextInt();
        valor = n;

        for (int i = 1; i <= 100; i++) {
            n += (valor + i);

        }
            System.out.println("La suma es: " + n);

    }
}
