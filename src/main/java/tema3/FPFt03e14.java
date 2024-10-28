package tema3;

import java.util.Scanner;

public class FPFt03e14 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 14: Diseñar un algoritmo que informe de los números perfectos que hay entre 1 y 10000. Un 
número perfecto si es igual a la suma de todos los divisores menores que él.  
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
             
        for (int i = 1; i <= 10000; i++) {
            int sumaDivisores = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0) {
                    sumaDivisores += j; // Sumar los divisores    
                }
            }if (sumaDivisores == i){
                    System.out.println(i);
                }
        } 
    }
}