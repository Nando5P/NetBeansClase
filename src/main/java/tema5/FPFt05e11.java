package tema5;

import java.util.Scanner;

public class FPFt05e11 {

    /*
* Fernando Parga Fernandez
* Ejercicio 11:  ¿Qué mostraría este código por pantalla? ¿Por qué? 
 
    public static void main(String[] args) { 
      float saldo = 500f; 
      ingresar(saldo, 600f); 
      if (saldo > 1000f) System.out.println("Ya tienes más de 1000 euros: " + saldo); 
      else                System.out.println("No tienes más de 1000 euros: "+ saldo); 
    } 
 
    static void ingresar(float saldo, float increm) {saldo += increm;    }
     */
    public static void main(String[] args) {
        float saldo = 500f;
        ingresar(saldo, 600f);
        if (saldo > 1000f) {
            System.out.println("Ya tienes más de 1000 euros: " + saldo);
        } else {
            System.out.println("No tienes más de 1000 euros: " + saldo);
        }
    }

    static void ingresar(float saldo, float increm) {
        saldo += increm;
    }
}

/* Mostraria "No tienes más de 1000 euros: 500 euros" 
ya que no hay return en la segunda funcion */