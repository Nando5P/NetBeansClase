/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package bucles;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 17: Realiza un programa que sume los 100 números siguientes a un número entero y positivo 
introducido por teclado. Se debe comprobar que el dato introducido es correcto (que es un 
número positivo).
 *
 */
public class Bucles17 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        int sumaNum = 0;
        
        System.out.println("Introduce un numero entero positivo y le sumaremos los 100 siguientes:");
        num = teclado.nextInt();
        
        if (num < 0){
            System.out.println("Error, no es positivo");
        }else{
            for (int i = 1; i<= 100; i++){
                sumaNum += (num+i);
            }
        }
        System.out.println("La suma total es: " + sumaNum);
    }
}
