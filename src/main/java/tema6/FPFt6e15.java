package tema6;

import java.util.Scanner;

/*
* Un profesor ha desarrollado un examen tipo test de 20 preguntas y cada una de ellas tiene 
* cuatro opciones: a), b), c) ó d), siendo solo una de ellas la correcta. Cada pregunta correcta suma 0.5 
* puntos y cada una incorrecta resta 0.2 puntos, no pudiendo llevar un alumno ninguna nota inferior 
* a cero. Desarrolla una clase llamada Examen que almacene las respuestas correctas de las 20 
* preguntas. La clase debe disponer de algún mecanismo mediante el que se le pase las respuestas de 
* un alumno para las 20 preguntas (a,b,c,d o bien z, siendo respuesta en blanco) y nos informe de la 
* puntuación en el examen. Hacer un programa que permita primero informar de las respuestas 
* correctas a un examen y después introducir las respuestas de los alumnos, mostrándonos la nota 
* obtenida por los mismos.  
*/

public class FPFt6e15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Examen examen = new Examen("abcdaabdcddbcaccabda", 0.5, 0.2);
        System.out.println("Introduce las respuestas del alumno. Tienen que ser 20. Utiliza x para marcar las preguntas no contestadas.");
        String respostasAlumno = teclado.nextLine();
        while (!examen.checkFormat(respostasAlumno)) {
            System.out.println("El formato de las respuestas no es correcto. Introducela de nuevo.");
            respostasAlumno = teclado.nextLine();
        }
        System.out.printf("Nota del alumno: %.2f", examen.calcularNota(respostasAlumno));
    }
}