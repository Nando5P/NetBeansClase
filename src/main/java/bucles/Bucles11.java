/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package bucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 11: Escribe un programa que muestre en tres columnas, el cuadrado y el cubo de los 5 primeros 
números enteros a partir de uno que se introduce por teclado.
 */
public class Bucles11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num,cuadrado,cubo;
        

        System.out.println("Introduce un numero para calculr el cuadrado y el cubo de los 5 siguientes numeros: ");
        num = teclado.nextInt();
        
        for (int i = num; i <=(num +5); i++){
            cuadrado = i*i;
            cubo = i*i*i;
            System.out.println(i + "\t" + cuadrado + "\t" + cubo);
            /*System.out.printf("%-10d %-10d %-10d %n",i,cuadrado,cubo);*/
        }
        
    }
}
