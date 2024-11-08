package tema4;

import java.util.Scanner;

public class FPFt4e7a {

    /*
* Ejercicio Calculo de área
* Fernando Parga Fernandez
* Ejercicio 7a: Un algoritmo de encriptado monoalfabético consiste en la sustitución de una letra por otra a 
lo largo de todo el mensaje, por ejemplo las A por F, las B por X, las C por M. Obviamente si la A pasa 
a ser F, ninguna otra letra pasará F. Hacer un programa que le introduzca una cadena en mayúsculas 
y muestre la cadena encriptada en (todo lo que no sean letras mayúsculas se deja intacto: números, 
espacios en blanco, etc.). Hacer una segunda versión que funcione con mayúsculas y minúsculas
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe tu mensaje a encriptar: ");
        String mensaje = teclado.nextLine();

        StringBuilder mensajeEncriptado = new StringBuilder(); /* Con StingBuilder se puede modificar la cadena sin crear cadenas nuevas */

        for (char c : mensaje.toCharArray()) { /* Recorremos cada caracter del mensaje original (En cada interaccion los caracteres son asignados a c) */
            switch (c) {
                case 'A':
                    mensajeEncriptado.append('F');
                    break;
                case 'B':
                    mensajeEncriptado.append('X');
                    break;
                case 'C':
                    mensajeEncriptado.append('M');
                    break;
                case 'D':
                    mensajeEncriptado.append('Q');
                    break;
                case 'E':
                    mensajeEncriptado.append('P');
                    break;
                    case 'M':
                    mensajeEncriptado.append('C');
                    break;
                    case 'S':
                    mensajeEncriptado.append('Y');
                    break;
                /* Se pueden añadir más letras */
                default:
                    mensajeEncriptado.append(c);
                    break;
            }
        }

        System.out.println("Mensaje encriptado: " + mensajeEncriptado);
    }
}
