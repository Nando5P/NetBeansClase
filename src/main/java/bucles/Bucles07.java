/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package bucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 7: Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. 
El programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el 
mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se 
ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
 */
public class Bucles07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int intentos = 0;
        boolean fallo = true;
        int num, combinacion;
        
        System.out.println("Adivina la combinacion de la caja fuerte:");
        combinacion = (int)(Math.random() * 9999 + 999);
        
        do {
    num = teclado.nextInt();
    if ((num < 1000) || (num > 9999)){
        System.out.println("Numero erroneo, introduce numero de 4 digitos");
        continue;
    }
        
    if (num == combinacion){
        System.out.println("La caja fuerte se ha abierto satisfactoriamente");
    fallo = false;
    } else {System.out.println("Lo siento, esa no es la combinación");
        intentos++;
            System.out.println("Intentos restantes: " + (4-intentos));}
        } while ((intentos !=4) && (fallo == true));
    }
}
