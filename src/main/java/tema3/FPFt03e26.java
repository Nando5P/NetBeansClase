package tema3;

import java.util.Scanner;

public class FPFt03e26 {

    /*
*Ejercicio Calculo de área
*Fernando Parga Fernandez
 Ejercicio 26: Hacer cuatro programas que pinten 9 líneas según los siguientes gráficos: 
 a.) b.) c.) d.) 
0000000000 1 1111111111 9 
1111111111 22 222222222 98 
2222222222 333 33333333 987 
3333333333 4444 4444444 9876 
........ ...... ....... ....... 
Cada apartado se resuelve con un for dentro de otro for.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

       /* int n=0;

       System.out.println("a)");
        for (int i = n; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(n);
            }System.out.print("\n");
            n += 1;*/
            
          /*   int b=1;

        System.out.println("b)");
        for (int i = b; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(b);
            }System.out.print("\n");
            b += 1;*/
          
       /*    int c=1;

        System.out.println("c)");
        for (int i = c; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(c);
            }System.out.print("\n");
            c += 1;
          */
       
       
       int d=9;
       System.out.println("d)");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(d);
                d-=1;
            }System.out.print("\n");
            d =9;
            
        }
    }
}
