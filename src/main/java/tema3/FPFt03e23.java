package tema3;

import java.util.Scanner;

public class FPFt03e23 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 23:  Programa que permita introducir números y nos muestre el resultado de sumarlos, hasta 
que introduzca un número mayor que 1000. Si no se introduce un número mayor que 1000 el 
programa finalizará después de introducidos 15 números. (Ojo: es fácil equivocarse y hacer que 
solicite un numero de más o bien que no sume correctamente)
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        int sumaNum = 0;
        int ejecuciones = 0;
        
        System.out.println("Introduce numeros para irlos sumando. Tras 15 repeticiones o introducir numero mayor a 1000 se cierra el programa: ");
        do {  
            num = teclado.nextInt();
            sumaNum += num;
            if (num >= 1000) {System.out.println("La suma es: " + sumaNum);break;
            }else{
            ejecuciones +=1;
            System.out.println("La suma es: " + sumaNum);
            System.out.println("Repeticiones restantes: " + (15-ejecuciones));
            System.out.println("Siguiente numero: ");}
            
        } while ((num < 1000) || (ejecuciones == 0));

    }
}