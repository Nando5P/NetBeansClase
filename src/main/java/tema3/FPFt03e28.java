package tema3;

import java.util.Scanner;

public class FPFt03e28 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 28: Sacar por pantalla la suma, la media y el producto de los números pares comprendidos entre 
dos números enteros tecleados previamente. No sabemos si el que introduce primero es menor que 
el segundo. No incluir en los cálculos los números introducidos, solo los intermedios.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int a, b;
        int suma = 0;
        int producto = 1;
        float media;
        int pares = 0;

        System.out.println("Introduce dos numeros y te daré la suma, la media y el producto de los números pares comprendidos entre eelos");
        System.out.println("Numero A: ");
        a = teclado.nextInt();
        System.out.println("Numero B: ");
        b = teclado.nextInt();
        
       if (a < b) {
            for (int i = (a+1); i < b; i++){
              if (i%2==0){
                  suma += i;
                  producto *= i;
                  pares++;
              }
            }
        }else 
        for (int i = (b+1); i < a; i++){
               if (i%2==0){
                  suma += i;
                  producto *= i;
                  pares++;
              }
        
    }
       media = (suma/pares);
        System.out.println("La suma es: " + suma);
        System.out.println("La media es: " + media);
        System.out.println("El producto es: " + producto);
}
}