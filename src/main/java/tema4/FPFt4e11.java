package tema4;

import java.util.Scanner;

public class FPFt4e11 {

    /*
* Ejercicio Calculo de área
* Fernando Parga Fernandez
* Ejercicio 11: Describe que realiza el código siguiente e indica si contiene algún error.
    
  
 java.util.Scanner teclado = new java.util.Scanner(System.in); 
 System.out.println("Introduce una cadena:"); 
 String cadena = teclado.nextLine(); 
 StringBuilder cadenaSB = new StringBuilder(cadena); 
 int pos; 
 do { 
 pos = cadenaSB.indexOf(" "); 
 if (pos!=-1) cadenaSB.deleteCharAt(pos); 
 } while (pos != -1); 
 System.out.println(cadenaSB); 
    
    
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce una cadena:");
        String cadena = teclado.nextLine();
        StringBuilder cadenaSB = new StringBuilder(cadena);
        int pos;
        do {
            pos = cadenaSB.indexOf(" ");
            if (pos != -1) {
                cadenaSB.deleteCharAt(pos);
            }
        } while (pos != -1);
        System.out.println(cadenaSB);

    }
}
