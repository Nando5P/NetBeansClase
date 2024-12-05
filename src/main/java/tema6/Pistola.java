/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema6;

/**
 *
 * @author fernando.pargafernan
 */
public class Pistola {
      /**
     * 6.13. Realiza un juego de la ruleta rusa para dos jugadores. La pistola
     * tiene 6 huecos en la recámara pero solo una bala. Al empezar la partida
     * se genera una posición al azar de la recámara para la bala de forma que
     * puede salir en el primer disparo, en el segundo, etc. hasta el sexto. Los
     * jugadores irán disparando sucesivamente hasta que uno de los dos se
     * muera. Crea una clase Pistola con los atributos y métodos que la definen.
     */
    private int posicionBala;
    private int disparosRealizados;

    public Pistola() {
        this.posicionBala = (int) (Math.random() * 6);
        disparosRealizados = 0;
    }

    public int getDisparosRealizados() {
        return disparosRealizados;
    }

    public boolean disparar() {
        if (disparosRealizados == posicionBala) {
            return true;
        } else {
            disparosRealizados++;
            return false;
        }
    }
}
