package tema4;


import java.text.MessageFormat;
import java.util.Scanner;


public class FPFt4e9 {

    /*
* Ejercicio Calculo de área
* Fernando Parga Fernandez
* Ejercicio 9: Escribe un programa que solicite que se introduzca por teclado un nombre completo y una 
* edad y muestre el siguiente mensaje. Hacer una versión utilizando la clase Format y otra versión con 
* el método System.out.printf.
* Hola, me llamo ------- ----- y tengo xx años
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe tu Nombre: ");
        String Nombre = teclado.nextLine();

        System.out.println("Introduce ntu edad: ");
        int edad = teclado.nextInt();

      String mensaje = MessageFormat.format("Hola, me llamo {0} y tengo {1} años", Nombre, edad);
      
        System.out.println(mensaje);
    }
}
