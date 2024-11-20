package inicioobjetosclases;

import java.util.Scanner;

/*
 Crea una clase llamada Cuenta que tendrá los siguientes atributos a los que no
queremos que se acceda directamente: titular, saldo (puede tener decimales) e iban.
● El titular será obligatorio, la cantidad es opcional y el ibán se genera de forma
automática cada vez que se crea una nueva cuenta. Crea dos constructores que
cumplan lo anterior.
● Crea sus métodos get, set y toString.
Tendrá dos métodos de tipo public:
● ingresar(double cantidad): se ingresa una cantidad a la cuenta, si la cantidad
introducida es negativa, no se hará nada.
● retirar(double cantidad): se retira una cantidad a la cuenta si el saldo es mayor o
igual a la cantidad que se pretende retirar. Si el saldo es menor que la cantidad que
se pretende retirar no se hace nada
Tendrá un método de tipo private:
generarIban(): Se crea un identificador de cuenta formado por las letras ES y 5 dígitos
numéricos que generaremos de forma aleatoria.
● Crea un método ejecutable dentro de la clase Cuenta y haz dos instancias de la
clase, es decir crea dos objetos llamados cuenta1 y cuenta2.
● Ingresa 200 euros de cuenta1 y retira 500 euros de la cuenta2.
Llama al método getIban() del objeto cuenta1 e imprime lo que devuelve.
● Crea otro método ejecutable en una clase a parte, y realiza los pasos anteriores.
¿Qué observas?¿Tiene sentido tener un método setter del atributo iban?

 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta();
        Cuenta cuenta2 = new Cuenta();

        System.out.println("Introduce titular de la cuenta1: ");
        cuenta1.setTitular (teclado.next());
        System.out.println("Introduce saldo en la cuenta1: ");
        cuenta1.setSaldo(teclado.nextDouble());
        System.out.println("Cantidad a ingresar: ");
        double sumar = teclado.nextDouble();
        System.out.println("Cantidad a retirar: ");
        double restar = teclado.nextDouble();

        System.out.println("Introduce titular de la cuenta2: ");
        cuenta2.setTitular(teclado.next());
        System.out.println("Introduce saldo en la cuenta2: ");
        cuenta2.setSaldo(teclado.nextDouble());
        System.out.println("Cantidad a ingresar: ");
        sumar = teclado.nextDouble();
        System.out.println("Cantidad a retirar: ");
        restar = teclado.nextDouble();
       
        System.out.println(cuenta1.toString());
        System.out.println(cuenta2.toString());

        
    }
    
    public double ingresar (double saldo, double sumar){
        if (sumar > 0) {
            return (sumar + saldo);
        } else {
            return saldo;
        }
    }
    
    public double retirar (double saldo, double restar){
        if (restar < saldo) {
            return (saldo - restar);
        } else {
            return saldo;
        }
    }
    
}
