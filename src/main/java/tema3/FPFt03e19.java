package tema3;

import java.util.Scanner;

public class FPFt03e19 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 19: Programa que se le introduzcan números por consola y que informe si están ordenados 
ascendentemente o no. El programa finaliza si se introduce cero o en cuanto se detecte que los 
números no están ordenados.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num = 4;
        int anterior;
        
        System.out.println("Introduce numeros en orden ascendente: ");
        anterior = teclado.nextInt();
        while ((num != 0) || (anterior != 0)){
        System.out.println("Introduce nuevo numero: ");
        num = teclado.nextInt();
        if (num > anterior){
            System.out.println("Estan ordenados ");
        }else {
            System.out.println("No estan ordendos");}
        anterior = num;
        }
        
       
  
        
          
 
}
}
