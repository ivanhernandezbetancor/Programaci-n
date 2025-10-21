package ut2;

import java.util.Scanner;

public class Hernandez_Betancor_Ivan_ejercicio2 {

    // 2) Factorial con bucle for
    // Pide un número entero n y calcula n! (producto de 1 hasta n) usando un for. Muestra el resultado.
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Introduce un número entero que sea negativo: ");
        int n = scanner.nextInt();

        // Validamos que no sea negativo
        if (n < 0) {
            System.out.println(" El factorial no está definido para números negativos. ");
        } else {
        
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            // Mostramos el resultado
            System.out.println("\n" + n + "! = " + factorial);
        }
        scanner.close();
    }
}
