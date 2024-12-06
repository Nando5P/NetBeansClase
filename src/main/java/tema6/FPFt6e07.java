package tema6;

import java.util.Scanner;

/* 
* Implementar una clase llamada Circulo, que tiene solo la propiedad radio y los métodos 
* setRadio, getRadio, calcularCircunferencia, calcularSuperficie, calcularDiametro además de un 
* constructor. Crea un programa que use esta clase creando un par de círculos y usando los métodos 
* creados.
*/
public class FPFt6e07 {

    public static void main(String[] args) {

      // Crear dos círculos
        Circulo circulo1 = new Circulo(5.0);
        Circulo circulo2 = new Circulo(10.0);

        // Usar los métodos y mostrar resultados
        System.out.println("Círculo 1:");
        System.out.println("Radio: " + circulo1.getRadio());
        System.out.println("Circunferencia: " + circulo1.calcularCircunferencia());
        System.out.println("Superficie: " + circulo1.calcularSuperficie());
        System.out.println("Diámetro: " + circulo1.calcularDiametro());

        System.out.println("\nCírculo 2:");
        System.out.println("Radio: " + circulo2.getRadio());
        System.out.println("Circunferencia: " + circulo2.calcularCircunferencia());
        System.out.println("Superficie: " + circulo2.calcularSuperficie());
        System.out.println("Diámetro: " + circulo2.calcularDiametro());
    }
}