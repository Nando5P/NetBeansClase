package tema3;

import java.util.Scanner;

public class FPFt03e22 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 22: Hacer un programa que permita calcular el sueldo final de los vendedores de un 
concesionario de coches. Para cada uno se introducirá: sueldo base, cantidad de horas extras 
realizadas y cantidad de ventas. El sueldo final será el sueldo base más las horas extras (se pagan a 
100€ la hora) y un plus en función de las ventas: entre 10 y 20 ventas 500€, entre 21 y 30 ventas 
1000€ y si supera las 30 ventas  1300 €. Después de tratar cada vendedor se preguntará al usuario 
y hay más vendedores a tratar, finalizando el programa si contesta negativamente. Al final el 
programa mostrará el total de ventas y el salario final del que más ventas ha realizado (supón que al 
menos introducen los datos de un empleado).
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
        int totalVentas = 0;
        int maxVentas = 0;
        double maxSueldo = 0;
        String maxVendedor = "";

        boolean continuar = true;

        while (continuar) {
            // Solicitar los datos del vendedor
            System.out.print("Introduce el nombre del vendedor: ");
            String nombre = teclado.nextLine();

            System.out.print("Introduce el sueldo base del vendedor: ");
            double sueldoBase = teclado.nextDouble();

            System.out.print("Introduce la cantidad de horas extras realizadas: ");
            int horasExtras = teclado.nextInt();

            System.out.print("Introduce la cantidad de ventas realizadas: ");
            int cantidadVentas = teclado.nextInt();

            // Calcular el pago por horas extras
            double pagoHorasExtras = horasExtras * 100;

            // Calcular el plus por las ventas
            double plusVentas = 0;
            if (cantidadVentas >= 10 && cantidadVentas <= 20) {
                plusVentas = 500;
            } else if (cantidadVentas >= 21 && cantidadVentas <= 30) {
                plusVentas = 1000;
            } else if (cantidadVentas > 30) {
                plusVentas = 1300;
            }

            // Calcular el sueldo final
            double sueldoFinal = sueldoBase + pagoHorasExtras + plusVentas;

            // Acumular las ventas
            totalVentas += cantidadVentas;

            // Comprobar si es el vendedor con más ventas
            if (cantidadVentas > maxVentas) {
                maxVentas = cantidadVentas;
                maxSueldo = sueldoFinal;
                maxVendedor = nombre;
            }

            // Mostrar el sueldo final del vendedor
            System.out.println("El sueldo final de " + nombre + " es: " + sueldoFinal + "€");

            // Preguntar si hay más vendedores a tratar
            System.out.print("¿Hay más vendedores a tratar? (s/n): ");
            char respuesta = teclado.next().charAt(0);
            teclado.nextLine(); // Limpiar el buffer

            if (respuesta == 'n' || respuesta == 'N') {
                continuar = false;
            }
        }

        // Mostrar resultados finales
        System.out.println("\nTotal de ventas realizadas: " + totalVentas);
        System.out.println("El vendedor con más ventas es " + maxVendedor + " con un sueldo de " + maxSueldo + "€.");
    }
}

