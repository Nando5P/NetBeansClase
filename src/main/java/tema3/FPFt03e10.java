package tema3;

import java.util.Scanner;

public class FPFt03e10 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 10:  Programa al que se le introduzcan las edades de los alumnos (-1 para finalizar) y nos informe 
si hay alguno menor de edad.  
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int edad;
        boolean MenorEdad = false;

        edad = 0;
        while (edad != -1 ) {
            System.out.println("Introduzca la edad de los alumnos: ");
            edad = teclado.nextInt();
            if (edad < 18) {
                MenorEdad = true;
            }
        }
        if (MenorEdad){
            System.out.println("Hay algun menor de edad");
        } else  System.out.println("No hay menores de edad");
    }
}
