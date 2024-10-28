package tema3;

import java.util.Scanner;

public class FPFt03e04 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 4: Diseñar un programa capaz de leer un valor entero, que verifique que esté comprendido entre 
1 y 10, y mostrar su tabla de multiplicar.   
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;
        
        System.out.print("Introduce un numero entre 1 y 10 para ver su tabña de multiplicar: ");
        n = teclado.nextInt();
        
        if ((n >= 1) && (n <= 10)){
            
        for (int i = 1; i <= 10; i++)
        System.out.println(n + " * " + i + " = " + (n * i));
           
    }else System.out.println("El numero no es valido");

        }

    }

