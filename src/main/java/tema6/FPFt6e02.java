package tema6;

import java.util.Scanner;


/*
* A partir de la clase MovilPrepago del ejercicio anterior, crea un programa en el que el usuario 
* dé de alta un teléfono con unas características determinadas y luego le permita mediante un menú 
* hacer operaciones como consultar saldo, recarga, hacer llamada, navegar. Se proporciona un 
* modelo (modeloMenu) a modo de esqueleto, con el menú y las funciones necesarias, en las que solo 
* tienes rellenar los huecos. 
 */
public class FPFt6e02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        MovilPrepago movil2 = new MovilPrepago(900900900L, 0.1f, 0.5f, 10f);

        System.out.println("Indique su numero de telefono: ");
        movil2.setNumeroMovil(teclado.nextLong());

        movil2.toString();
        menu(movil2);

    }

    static void menu(MovilPrepago movil) {
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        do {
            opcion = pintarMenu();
            switch (opcion) {
                case 1:
                    System.out.println("Elegiste opción 1 (Consultar el saldo)");
                    System.out.println("Su saldo es: " + movil.getSaldo());
                    break;
                case 2:
                    System.out.println("Elegiste opción 2 (Recargar)");
                    System.out.println("Introduce cantidad a recargar: (solo se aceptan multiplos de 5)");
                    boolean importe = movil.recargar(teclado.nextInt());
                    System.out.println("Nuevo saldo: " + movil.getSaldo());
                    break;
                case 3:
                    System.out.println("Elegiste opción 3 (Realizar una llamada)");
                    System.out.println("Se realizara una llamada. Establece duracion en segundos: ");
                    movil.efectuarLlamada(teclado.nextInt());
                    break;
                case 4:
                    System.out.println("Elegiste opción 4 (Navegar por internet");
                    System.out.println("Cuantos megas ha consumido? ");
                    movil.navegar(teclado.nextInt());
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (!salir);
    }

    private static int pintarMenu() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("\n");
        System.out.println("Elija una opción:");
        System.out.println("1 Consultar Saldo");
        System.out.println("2 Recargar");
        System.out.println("3 Realizar una llamada");
        System.out.println("4 Navegar por internet");
        System.out.println("0 Salir del programa");
        try {                  //si introduce un valor no entero haría return 999
            return Integer.parseInt(teclado.next());
        } catch (Exception e) {
            return 999;
        }
    }
}
