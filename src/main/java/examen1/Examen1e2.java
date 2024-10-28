package examen1;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez
 *
 */
public class Examen1e2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int num;
        boolean fallo = true;
        
        do {   
            System.out.println("Introduce el tamaño del lado del cuadrado (entre 10 y 20): ");
        num = teclado.nextInt();
            if ((num > 10) && (num < 20)){
                fallo = false;
            }else {
                System.out.println("Error al introducir numero.");}
       
        } while (fallo);
        

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                if ((i==0) || (i == (num-1)) || (j == 0) || (j == (num-1))){
                System.out.print("*");}
                else {System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}

/* Para que fuese un rectangulo, podriamos modificar el valor de num en J o en I (ej: num/2), ya que para ser un rectangulo no puede tener los cuatro lados iguales, si no 2 y 2*/