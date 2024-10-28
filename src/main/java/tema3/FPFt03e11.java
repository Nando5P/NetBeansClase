package tema3;

import java.util.Scanner;

public class FPFt03e11 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 11: Diseñar un algoritmo capaz de leer dos valores enteros, m y n, y nos muestre los números 
comprendidos entre ellos ordenados ascendentemente, junto con el valor de elevar cada uno de 
esos números al cuadrado. No se sabe si m > n, pero se desea utilizar una sola sentencia repetitiva 
tanto si m > n como si m < n.  
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n,m;

        System.out.println("Introduzca un primer numero (N): ");
            n = teclado.nextInt();
        System.out.println("Introduzca un segundo numero (M): ");
            m = teclado.nextInt();
       
        if (n < m) {
            for (int i = n; i <= m; i++){
               System.out.println("Numero: " + i + " Cuadrado: " + (i*i)); 
            }
        }else 
        for (int i = m; i <= n; i++){
               System.out.println("Numero: " + i + " Cuadrado: " + (i*i));  
    }
}
}