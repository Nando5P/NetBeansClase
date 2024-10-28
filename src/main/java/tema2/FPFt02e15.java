package tema2;

import java.util.Scanner;

/**
 Fernando Parga Fernandez Ejercicio 15: Haz 3 versiones de un mismo programa, que pida que se introduzcan por teclado 2 números 
int sobre sendas variables llamadas ‘a’ y ‘b’ y que incluyan las instrucciones que se muestran abajo. 
Para cada una de las versiones, ejecútalo varias veces, introduciendo cero para alguno de los valores 
y finalmente explica la diferencia de comportamiento entre cada una de las versiones: 
• Versión a) if (b !=0 && a/b==0) {r = a/b; System.out.println(r);} 
• Versión b) if (a/b==0 && b !=0) {r = a/b; System.out.println(r);}
• Versión c) if (b !=0 & a/b==0) {r = a/b; System.out.println(r);}
Puede ser el mismo código con las tres sentencias junta, teniendo una sola vigente y las otras 
dos como comentarios. Comentando unas y descomentando otra vas probando cada caso. 
La explicación puedes ponerla en el propio código, al final, como comentarios.
 */
public class FPFt02e15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a,b,r;

        System.out.println("Introduce valor A: ");
        a = teclado.nextInt();
        System.out.println("Introduce valor B: ");
        b = teclado.nextInt();

       //if (b !=0 && a/b==0) {r = a/b; System.out.println(r);} //
       if (a/b==0 && b !=0) {r = a/b; System.out.println(r);}
      // if (b !=0 & a/b==0) {r = a/b; System.out.println(r);}//
       
       
        /*Lo que pasa es que se lee primero lo que está a la izquierda del &&, por tanto en la primera versión
          comprueba si b no es igual a 0, si lo es, detiene el codigo, pero claro en la otra version, la segunda, al
          estar invertida la condicional, primero hace la division sin comprobar el valor de b, y si esta vuelve a ser
          el 0, esta vez si dará error, algo parecido ocurre en la tercera versión, que usa & en lugar de &&, lo cuál, hace
          que en lugar de leer de izquierda a derecha, lee ambos lados del & y detecta la división igual que la versión 2, por
          tanto si el b es igual a 0, también saltará error fatal*/
    }
}
