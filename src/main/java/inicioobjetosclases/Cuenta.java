package inicioobjetosclases;

import java.util.Random;

public class Cuenta {

    private String titular;
    private double saldo;
    private String Iban;

    public Cuenta() {
        this.Iban = generarIban();
    }

    public Cuenta(String titular) {
        this.titular = titular;
        this.saldo = 0.0;
        this.Iban = generarIban();
    }

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
        this.Iban = generarIban();
    }

    private String generarIban() {

        StringBuilder numeros = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            int numero = random.nextInt(10); // Genera un número entre 0 y 9
            numeros.append(numero);
        }

        return "Es" + numeros.toString();
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getIban() {
        return generarIban();
    }


    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }

}
