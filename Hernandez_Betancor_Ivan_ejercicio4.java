package ut2;

import java.util.Scanner;

public class Hernandez_Betancor_Ivan_ejercicio4 {

    // 4) Calculadora básica
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mostramos el menu de operaciones
        System.out.println(" CALCULADORA BASICA ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.print("\nSelecciona una operación (1-4): ");
        int opcion = scanner.nextInt();

        System.out.print("Introduce el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Introduce el segundo numero: ");
        int num2 = scanner.nextInt();

        // Aquí vemos la variable para el resultado
        int resultado = 0;

        // Realizamos la operación según la opción seleccionada
        if (opcion == 1) {
            resultado = num1 + num2;
            System.out.println("\nResultado: " + num1 + " + " + num2 + " = " + resultado);

        } else if (opcion == 2) {
            resultado = num1 - num2;

            System.out.println("\nResultado: " + num1 + " - " + num2 + " = " + resultado);
        } else if (opcion == 3) {

            resultado = num1 * num2;

            System.out.println("\nResultado: " + num1 + " * " + num2 + " = " + resultado);
        } else if (opcion == 4) {

            // Verificamos la división por cero
            if (num2 == 0) {
                System.out.println("\nError: No se puede dividir por cero.");
            } else {
                resultado = num1 / num2;
                System.out.println("\nResultado: " + num1 + " / " + num2 + " = " + resultado);
            }
        } else {
            System.out.println("\nOpcion no valida. Por favor selecciona una opcion entre 1 y 4");
        }
        scanner.close();
    }
}