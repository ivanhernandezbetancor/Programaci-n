package ut2;

import java.util.Scanner;

public class Hernandez_Betancor_Ivan_RepasoUT1 {
    
    public static Scanner sc = new Scanner(System.in);
    
    // Actividad 1 - Fundamentos rápidos
    public static void actividad1Fundamentos() {

        // Tambien puse \n para que se vea mejor en consola
        System.out.println("\nACTIVIDAD 1º FUNDAMENTOS RÁPIDOS\n");

        // Variables y constantes
        String nombre = "Ivan Hernandez Betancor";
        int edad = 21;
        final double PI = 3.1416;
        System.out.println("Nombre : " + nombre);
        System.out.println("Edad : " + edad);
        System.out.println("PI: " + PI);

        // Primitivos -> declaramos e imprimimos ejemplo de cada uno 
        int numero = 8;
        double decimal = 8.5;
        boolean esMayor = true;
        char letra = 'W';
        String texto = "Lionel Messi";

        System.out.println("int : " + numero);
        System.out.println("double : " + decimal);
        System.out.println("boolean : " + esMayor);
        System.out.println("char : " + letra);
        System.out.println("String : " + texto);

        // Operadores aritméticos -> realizamos (suma, resta, multiplicación y división)
        int a = 2, b = 2;
        System.out.println("Suma : " + (a + b));
        System.out.println("Resta : " + (a - b));
        System.out.println("Multiplicación : " + (a * b));
        System.out.println("División : " + (a / b));

        // Condicionales -> leemos una nota y mostramos Aprobado o Suspenso
        System.out.print("Introduce una nota (0 - 10): ");
        int nota = sc.nextInt();
        if (nota >= 5) {

            System.out.println("Aprobado");
        } else {
            System.out.println ("Suspenso");
        }
    }

    // Actividad 2 - Bucles
    public static void actividad2Bucles() {
        System.out.println("\n ACTIVIDAD 2º BUCLES\n");

        // for (1 - 10): Imprimos los números del 1 al 10
        System.out.println("Números del 1 al 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // while (10 - 1): Imprimos del 10 al 1 en orden descendente
        System.out.println("Números del 10 al 1:");
        int j = 10;
        while (j >= 1) {
            System.out.println(j);
            j--;
        }

        // Tabla de multiplicar -> pedimos un número y mostramos su tabla
        System.out.print("Introduce un número para la tabla de multiplicar: ");
        int numerodetabla = sc.nextInt();
        System.out.println("Tabla del " + numerodetabla + ":");
        for (int d= 1; d <= 10; d++) {
            System.out.println(numerodetabla + " x " + d + " = " + (numerodetabla * d));
        }

        // OPCIONAL : Solicitamos una contraseña hasta acertar (1234)
        int contrasena;
        do {
            System.out.print("Introduce la contraseña numérica: ");
            contrasena = sc.nextInt();
        } while (contrasena != 1234);
        System.out.println("¡Contraseña correcta!");
    }

    // Este sería el método principal que llame a los ejercicios
    public static void main(String[] args) {
        actividad1Fundamentos();
        actividad2Bucles();
        sc.close();
    }
}