package tema3;

import java.util.Scanner;

public class FPFt03e17 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 17: Diseñar un algoritmo al que se le introduzcan las notas de un alumno en los nueve módulos 
de un ciclo y nos informe si puede ir a la FCT (todos aprobados). ¿Habría que solicitarle al usuario 
siempre las notas de los nueve módulos? 
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int nota = 5;
        int contador = 1;
        boolean aprobado = true;
        System.out.println("Introduzca las notas del alumno: ");

        for (int i = 1; i <= 9; i++) {
              nota = teclado.nextInt();
            while ((nota < 0) || (nota > 10)) {
               
                System.out.println("Nota no valida, introducela de nuevo: ");
                nota = teclado.nextInt();
            }
            if (nota < 5) {
                aprobado = false;
                break;
            } else {
                System.out.println("Siguiente nota: ");
            }
        }
        if (aprobado) {
            System.out.println("Todos aprobados");
        } else {
            System.out.println("Hay algun suspenso");
        }
    }
}
