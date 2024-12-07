package tema6;

import java.util.Scanner;

/*
* Hacer un programa en el que un jugador lleve 10.000 euros y juegue
* 10.000 veces 1 euro cada vez siempre apostando a par ¿Con cuánto
* dinero acaba? El resultado final puede ir entre 0 y 20.000 euros.
* Ejecútalo varias veces. ¿Conclusiones sobre jugar a la ruleta? ;)
*/
public class FPFt6e14 {

    public static void main(String[] args) {

   Ruleta ruleta = new Ruleta();
        int dineroGanado = 10000;
        for (int i = 0; i < 10000; i++) {
            ruleta.girarRuleta();
            if (ruleta.apostarPar(1)) {
                dineroGanado += 2;
            } else {
                dineroGanado -= 1;
            }
        }
        System.out.println("Tras jugar 10.000 veces apostando 1 euro la cantidad obtenida en tus apuestas es de: " + dineroGanado + " euros");
    }

}