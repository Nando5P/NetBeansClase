package tema2;

import java.util.Scanner;

/**
 * Fernando Parga Fernandez Ejercicio 13: Realizar un programa que se le introduzca una nota (un valor entero entre 0 y 10) y nos 
muestre por pantalla la nota final en texto, con la siguiente equivalencia: Muy deficiente (0,1,2), 
Insuficiente (3,4), Aprobado (5,6), Notable (7,8) y Sobresaliente (9,10). Haz una versión con if 
anidados, otra con switch + “case :” y otra con switch + “case ->”
 */
public class FPFt02e13A {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;

        System.out.println("Buenos dias, introduzca la nota del examen: ");
        nota = teclado.nextInt();
        
          switch (nota) {
            case 0,1,2 -> System.out.println("Muy deficiente");
            case 3,4 -> System.out.println("Insuficiente");
            case 5,6 -> System.out.println("Aprobado");
            case 7,8 -> System.out.println("Notable");
            case 9,10 -> System.out.println("Salidas todos los dias menos el sabado.");
            default -> System.out.println("Introduzca una nota correcta.");
           
        }
            }
           
        }

