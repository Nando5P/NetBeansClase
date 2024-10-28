/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package bucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 16: Escribe un programa que diga si un número introducido por teclado es o no primo. Un 
número primo es aquel que sólo es divisible entre él mismo y la unidad. 
 *
 */
public class Bucles16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        boolean Primo = true;
        
        System.out.println("Introduce un numero para saber si es primo: ");
        num = teclado.nextInt();
        
        for (int i = 3; i <= Math.sqrt(num); i+=2){
        if (num%i==0){
            Primo = false; break;
        }
        }
        if (Primo) {System.out.println("Es primo");
            
        }else {System.out.println("No es primo");}
    }
}
