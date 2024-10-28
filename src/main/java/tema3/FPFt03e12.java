package tema3;

import java.util.Scanner;

public class FPFt03e12 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 12: Diseñar un algoritmo al que se le introduzcan las notas de los exámenes de una clase con 
decimales. Se introducirá –1 para indicar que no hay más notas. El algoritmo informará del total de 
notas introducidas, calculará la nota mínima, máxima , la media, si hay algún 5.0 exacto, y el 
porcentaje de aprobados. Hay que validar que estén entre 0 y 10.  
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Variables
        double nota;
        double sumaNotas = 0;
        double notaMin = 10; // El valor más alto que puede tener una nota válida
        double notaMax = 0;  // El valor más bajo que puede tener una nota válida
        int totalNotas = 0;
        int contadorAprobados = 0;
        boolean existe5Exacto = false;

        // Entrada de notas
        System.out.println("Introduce las notas (introduce -1 para terminar):");
        while (true) {
            nota = teclado.nextDouble();
            
            // Terminar el ciclo si la nota es -1
            if (nota == -1) {
                break;
            }

            // Nota esté entre 0 y 10
            if (nota >= 0 && nota <= 10) {
                totalNotas++;
                sumaNotas += nota;

                // Comprobar si es 5.0 exacto
                if (nota == 5.0) {
                    existe5Exacto = true;
                }

                // Contar aprobados
                if (nota >= 5.0) {
                    contadorAprobados++;
                }

                // Nota mínima
                if (nota < notaMin) {
                    notaMin = nota;
                }

                // Nota máxima
                if (nota > notaMax) {
                    notaMax = nota;
                }
            } else {
                System.out.println("Nota no válida. Introduce un valor entre 0 y 10.");
            }
        }

        // Calcular y mostrar resultados
        if (totalNotas > 0) {
            double media = sumaNotas / totalNotas;
            double porcentajeAprobados = (contadorAprobados / (double) totalNotas) * 100;

            System.out.println("Total de notas introducidas: " + totalNotas);
            System.out.println("Nota mínima: " + notaMin);
            System.out.println("Nota máxima: " + notaMax);
            System.out.println("Nota media: " + media);
            System.out.println("¿Hay algún 5.0 exacto?: " + (existe5Exacto ? "Sí" : "No"));
            System.out.println("Porcentaje de aprobados: " + porcentajeAprobados + "%");
        } else {
            System.out.println("No se introdujeron notas válidas.");
        }

      
    }
}