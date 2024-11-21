package inicioobjetosclases;

import java.util.Random;

public class Persona {

//Constantes
    public static final char hombre = 'H';
    public static final char mujer = 'M';
    public static final int PesoBajo = -1;
    public static final int PesoIdeal = 0;
    public static final int PesoAlto = 1;
    
//Atributos
    private String nombre;
    private int edad;
    private char genero;
    private double peso;  //Kilos
    private double altura; //metros
    private String dni;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = generarDNI();
        this.genero = hombre;
        this.peso = 80;
        this.altura = 1.75;
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.genero = comprobarGenero(genero);
        this.peso = 80;
        this.altura = 1.75;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generarDNI();
        this.genero = comprobarGenero(genero);
        this.peso = peso;
        this.altura = altura;
    }
    
     public int calcularIMC() {
        if (altura <= 0) return PesoBajo; // Prevención de divisiones por cero
        double imc = peso / (altura * altura);
        if (imc < 20) {
            return PesoBajo;
        } else if (imc <= 25 && imc >=20) {
            return PesoIdeal;
        } else {
            return PesoAlto;
        }
    }

    public boolean esMayorDeEdad() {
        if (edad >= 18){return true;
        } else  {return false;}
    }

    private char comprobarGenero(char genero) {
        return (genero == hombre || genero == mujer) ? genero : hombre;
    }

    private String numeroDNI() {

        StringBuilder numeros = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 7; i++) {
            int numero = random.nextInt(10); // Genera un número entre 0 y 9
            numeros.append(numero);
        }

        return numeros.toString();
    }

    private String generarDNI() {

        String DNILetras = "TRWAGMYFPDXBNJZSQVHLCKE";

        int indice = Integer.parseInt(numeroDNI()) % 23;

        char DNILetra = DNILetras.charAt(indice);

        return numeroDNI() + "-" + DNILetra;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String toString() {
        return "Persona{" + "nombre= " + nombre + ", edad= " + edad + ", genero= " + genero + ", peso= " + peso + ", altura= " + altura + ", dni= " + dni + '}';
    }

}
