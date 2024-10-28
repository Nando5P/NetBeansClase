package tema3;

import java.util.Scanner;

public class FPFt03e15 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 14: Sin ejecutarlo, intenta explicar que hace este programa.   
     */
      public static void main(String[] args) {
        int hora = 0;
        for (int i = 1; i <= 7 * 24; i++) {
            System.out.println(hora);
            if (++hora > 23) {
                hora = 0;
            }
        }
    } //fin main 
} //fin clase
/* Este ejercicio muestra todas las horas enteras (0-23) de los 7 ías de la semana*/