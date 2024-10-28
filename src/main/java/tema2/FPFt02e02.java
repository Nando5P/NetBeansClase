

package tema2;
import java.util.Scanner;
/**
 *Fernando Parga Fernandez
 * Ejercicio 2: Diseñar un programa al que se le introduzcan por consola tres números enteros. Si todos son 
negativos, mostrar el producto de los tres. Si alguno es negativo, pero no todos, mostrar la suma de 
los tres. En caso de que todos sean positivos sumar los dos primeros y multiplicar dicha suma por el 
tercero. ¿existe alguna combinación de los valores leídos no contemplado en el algoritmo? (Suponer 
que el cero es un número positivo). Hacer el programa lo más sencillo posible
 */
public class FPFt02e02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int num1,num2,num3,resultado;
        final int a = 0;
        
        System.out.println("Buenos dias, introduzca tres numeros enteros: ");
        System.out.print("Introduzca el numero 1: ");
        num1 = teclado.nextInt();
        System.out.print("Introduzca el numero 2: ");
        num2 = teclado.nextInt();
        System.out.print("Introduzca el numero 3: ");
        num3 = teclado.nextInt();
         
        if ((num1 < a) && (num2 < a) && (num3 < a)){
        resultado = num1 * num2 * num3;
        System.out.print("El resultado de la multiplicacion es: " + resultado);}
        else
          if (((num1 < a) && (num2 < a) && (num3 > a)) || ((num1 < a) && (num2 > a) && (num3 > a)) || ((num1 > a) && (num2 < a) && (num3 > a))){
            resultado = num1 + num2 + num3;
            System.out.print("El resultado de la suma es: " + resultado);
          }else resultado = (num1 + num2) * num3; System.out.print("El resultado de sumar los dos primeros y multiplicar dicha suma por el tercero es: " + resultado);      

       
        
    }
}
