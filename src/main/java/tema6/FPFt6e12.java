package tema6;

import java.util.Scanner;
import java.time.LocalDate;

/* 
* 6.13. Realiza un juego de la ruleta rusa para dos jugadores. La
* pistola tiene 6 huecos en la recámara pero solo una bala. Al empezar
* la partida se genera una posición al azar de la recámara para la bala
* de forma que puede salir en el primer disparo, en el segundo, etc.
* hasta el sexto. Los jugadores irán disparando sucesivamente hasta que
* uno de los dos se muera. Crea una clase Pistola con los atributos y
* métodos que la definen.
 */
public class FPFt6e12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Crear dos alumnos
        Alumno alumno1 = new Alumno(/*"Juan Pérez", "12345678A", "2005-03-15"*/);
        Alumno alumno2 = new Alumno(/*"Ana López", "87654321B", "2008-07-20"*/);

        //Introducir datos
        System.out.println("Alumno1:");
        System.out.println("Introduce nombre completo: ");
        alumno1.setNombreCompleto(teclado.next());
        teclado.next();
        System.out.println("Introduce DNI: ");
        alumno1.setDni(teclado.next());
        System.out.println("Introduce fecha de nacimiento (yyyy-mm-dd): ");
        String fechanacimiento = teclado.next();

        LocalDate fechaCumple = LocalDate.parse(fechanacimiento);
        alumno1.setFechaNacimiento(fechaCumple);

        System.out.println("Alumno2:");
        System.out.println("Introduce nombre completo: ");
        alumno2.setNombreCompleto(teclado.next());
        teclado.next();
        System.out.println("Introduce DNI: ");
        alumno2.setDni(teclado.next());
        System.out.println("Introduce fecha de nacimiento (yyyy-mm-dd): ");
        fechanacimiento = teclado.next();

        fechaCumple = LocalDate.parse(fechanacimiento);
        alumno2.setFechaNacimiento(fechaCumple);

        // Imprimir información de los alumnos
        System.out.println("Alumno 1: " + alumno1.getNombreCompleto() + ", DNI: " + alumno1.getDni());
        System.out.println("Alumno 2: " + alumno2.getNombreCompleto() + ", DNI: " + alumno2.getDni());

        // Verificar si son mayores de edad
        System.out.println("¿Alumno 1 es mayor de edad? " + alumno1.esMayorEdad());
        System.out.println("¿Alumno 2 es mayor de edad? " + alumno2.esMayorEdad());

        // Comparar edades
        System.out.println("¿Alumno 1 es mayor que Alumno 2? " + alumno1.esMayorQue(alumno2));

        // Verificar si son duplicados
        System.out.println("¿Alumno 1 y Alumno 2 son duplicados? " + alumno1.esDuplicado(alumno2));
    }
}
