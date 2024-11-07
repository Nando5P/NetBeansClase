package tema4;

import java.util.Scanner;

public class FPFt4e2 {

    /*
* Ejercicio Calculo de área
* Fernando Parga Fernandez
* Ejercicio 2: Diseña un algoritmo capaz de obtener la letra del NIF a partir del número de DNI. Consiste en 
*dividir dicho número entre 23 y tomar el resto de la división asignándole la letra correspondiente 
*según la siguiente tabla. Almacena las letras del NIF en una cadena. 
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String DNILetras = "TRWAGMYFPDXBNJZSQVHLCKE";

        System.out.println("Escribe tu numero del DNI: ");
        int DNI = teclado.nextInt();

        int indice = DNI % 23;

        char DNILetra = DNILetras.charAt(indice);

        System.out.println("El NIF completo es: " + DNI + "-" + DNILetra);

    }

}
