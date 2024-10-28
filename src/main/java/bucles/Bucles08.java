/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package bucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 4:  
 * Muestra la tabla de multiplicar de un número introducido por teclado
 */
public class Bucles08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num, producto;
        
        System.out.println("Introduce un numero para saber su tabla de multiplicar: ");
        num = teclado.nextInt();
        System.out.println("Tabla del " + num);
        for (int i = 0; i <= 10; i++) {
            producto = (num * i);
            System.out.println(num + " x " + i + " = " + producto);
        }
    }
}
