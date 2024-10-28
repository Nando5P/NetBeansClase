package tema3;

import java.util.Scanner;

public class FPFt03e13 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 13: Programa al que le introduzcas un número y que garantice que es positivo, es decir si lo 
introducimos menor o igual que cero nos obligará a volver a introducirlo las veces que sea necesario 
hasta que se introduzca uno positivo.  
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Variables
        int num;
        boolean negativo = true;

        System.out.println("Introduce un numero positivo: ");
        while (true)  {
            num = teclado.nextInt();
            if (num > 0) {
                negativo = false; break;
            } else {
                System.out.println("Error, introduce un numero positivo: ");
            }
       
        }
        System.out.println(num + " Es positivo.");
    }
}
