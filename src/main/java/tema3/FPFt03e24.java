package tema3;

import java.util.Scanner;

public class FPFt03e24 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 24: Realizar un programa que permita introducir el sexo (‘H’,’M’) y la edad de los 30 trabajadores 
de una fábrica. El programa debe obligar a que las edades que se introduzcan estén comprendidas 
entre 16 y 70 años. El programa nos mostrará la edad y el sexo del más joven y también mostrará la 
media de edad de las mujeres. Finalmente nos informará si hay alguno con más de 60 años. Si se 
introduce cero como edad el programa terminará en ese momento sin esperar a que introduzcan 
los 30 trabajadores.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int trabajadores = 30;
        int edadMasJoven = Integer.MAX_VALUE;
        char sexoMasJoven = ' ';
        int sumaEdadMujeres = 0;
        int numMujeres = 0;
        boolean mayor60 = false;

        for (int i = 0; i < trabajadores; i++) {
            System.out.println("Trabajador " + (i + 1) + ":");

            // Leer sexo
            char sexo;
            do {
                System.out.print("Ingrese el sexo (H para hombre, M para mujer): ");
                sexo = teclado.next().toUpperCase().charAt(0);
            } while (sexo != 'H' && sexo != 'M');

            // Leer edad
            int edad;
            do {
                System.out.print("Ingrese la edad (entre 16 y 70, o 0 para terminar): ");
                edad = teclado.nextInt();
                if (edad == 0) {
                    break; // Salir del bucle for si se ingresa 0
                }
            } while (edad < 16 || edad > 70);

            // Si la edad es 0, terminamos el ciclo
            if (edad == 0) {
                break;
            }

            // Actualizar el más joven
            if (edad < edadMasJoven) {
                edadMasJoven = edad;
                sexoMasJoven = sexo;
            }

            // Acumular la edad de las mujeres
            if (sexo == 'M') {
                sumaEdadMujeres += edad;
                numMujeres++;
            }

            // Verificar si hay alguien mayor de 60 años
            if (edad > 60) {
                mayor60 = true;
            }
        }
        if (edadMasJoven != Integer.MAX_VALUE) {
            System.out.println("El trabajador más joven tiene " + edadMasJoven + " años y su sexo es " + sexoMasJoven);
        } else {
            System.out.println("No se ingresaron trabajadores.");
        }

        // Mostrar la media de edad de las mujeres
        if (numMujeres > 0) {
            double mediaEdadMujeres = (double) sumaEdadMujeres / numMujeres;
            System.out.println("La media de edad de las mujeres es: " + mediaEdadMujeres);
        } else {
            System.out.println("No se ingresaron mujeres.");
        }

        // Informar si hay algún trabajador mayor de 60 años
        if (mayor60) {
            System.out.println("Hay al menos un trabajador con más de 60 años.");
        } else {
            System.out.println("No hay ningún trabajador con más de 60 años.");
        }
    }
}
