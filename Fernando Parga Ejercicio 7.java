package tema3;

import java.util.Scanner;

public class FPFt03e07 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 7: Indica la funcionalidad del siguiente programa. ¿Tiene algún error?¿Falta alguna llave? 
¿Podrías reducir el recorrido del for para que el programa sea más rápido, manteniendo su
funcionalidad?   
     */
    public static void main(String[] args) {
        int num;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número natural entre 1 y 1000: ");
        num = teclado.nextInt();
        
        if ((num < 0) || (num > 1000)) {
            System.out.println("Numero incorrecto.");
        } else {
            for (int i = num; i >= 1; i--) { /* en lugar de num >= 1, debería ser i >= 1*/
                if (num % i == 0) {
                    System.out.println(i); 
                }
            }
        }/*faltaban llaves: {} y ()*/
    }
}
/*La funcionalidad del programa es detectar si un valor introducido está entre 1 y 1000 para posteriormente reducirlo de 1 en 1 hasta qye sea menor a 1 (0)*/


/*import java.util.Scanner; 
public class Ejercicios { 
 public static void main(String[] args) { 
 int num; 
 Scanner teclado = new Scanner(System.in); 
 System.out.print("Introduce un número natural entre 1 y 1000: "); 
 num = teclado.nextInt(); 
 if (num <0 && num > 1000) 
 System.out.println("Numero incorrecto."); 
 else 
 for (int i=num;num>=1;i--) 
 if (num % i == 0) System.out.println(i); 
 } } */