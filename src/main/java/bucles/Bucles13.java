/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package bucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 13: Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y 
cuántos son negativos.

 */
public class Bucles13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        int sumaPositivos = 0;
        int sumaNegativos = 0;
        int N = 0;  /*numeros introducidos*/

        System.out.print("Introduciremos 10 numeros positivos o negativos: ");
        

        do {            
            System.out.println("Introduce numero: ");
            num = teclado.nextInt();
            if (num < 0){
            sumaNegativos++;
            }else {sumaPositivos++;}
            N++;
            System.out.println("Numeros restantes: " + (10-N));
        } while (N != 10);
        System.out.println("Numeros positivos: " + sumaPositivos);
        System.out.println("Numeros negativos: " + sumaNegativos);
        }
    }
