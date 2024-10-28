/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package bucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 9: Realiza un programa que nos diga
 * cuántos dígitos tiene un número introducido por teclado. Hay que realizar el
 * ejercicio utilizando bucles. La única limitación en el número de dígitos la
 * establece el tipo de dato que se utilice (int o long).
 */
public class Bucles09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        int digitos =0 ;
        
        System.out.println("Introduce un numero: ");
        num = teclado.nextInt();
        num = Math.abs(num);
        
        do {            
            num /=10;
            digitos++;
        } while (num > 0);
        System.out.println("El numero tiene " + digitos + " digitos");
        
        
        
        
    }
}
