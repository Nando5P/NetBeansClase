package tema3;

import java.util.Scanner;

public class FPFt03e27 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 27: La suma de los dígitos de los números múltiplos de tres es también un múltiplo de tres. 
Realizar un programa que compruebe si esta afirmación es correcta o no para los primeros 10000 
números enteros positivos
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        boolean correcto = true;
        
        
 for (int i = 3; i <= 10000; i++) {
            if (i % 3 == 0) { // Verificamos si el número es múltiplo de 3
                int suma = ((i % 10) + (i/10));

                // Verificamos si la suma de los dígitos es múltiplo de 3
                if (suma % 3 != 0) {
                    correcto = false;
                    System.out.println("La afirmación es incorrecta para el número: " + i);
                    break; // Si encontramos un caso donde no se cumple, salimos del bucle
                }
            }
           
        } if (correcto){System.out.println("La afirmación es correcta siempre");}
        else{System.out.println("La afirmación es incorrecta");}
    }
}
    