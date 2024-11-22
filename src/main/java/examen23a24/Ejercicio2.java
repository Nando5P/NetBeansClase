package examen23a24;

import java.util.Scanner;

/**
 *
 * @author fernando.pargafernan
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce una frase: ");
        String frase = teclado.next();
        
        System.out.println(fraseInvertida(frase));  
    }
    
    public static String fraseInvertida(String frase){
    String cadenaInvertida = "";
        
        for (int i = (frase.length()-1) ; i >=0; i--){
         cadenaInvertida += frase.charAt(i);
        }
    
        return cadenaInvertida;
    }
}