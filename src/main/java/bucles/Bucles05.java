/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package bucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 5: Muestra los números del 320 al 160, contando de 20 en 20 hacia atrás utilizando un bucle 
while
 */
public class Bucles05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

       int i = 320;

        while ((i >= 160) && (i <= 320)) {
            
                System.out.println(i);
                i-=20;
            }
            
        }
    }

