package ut2;

import java.util.Scanner;

public class Hernandez_Betancor_Ivan_ejercicio1 {

    // 1) Contar divisores de un número

    // Pide un número entero al usuario y muestra todos sus divisores.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos número al usuario
        System.out.print("Introduce un número entero: ");
        int num = scanner.nextInt();

        // Validamos que el número sea positivo
        if (num <= 0) {
            System.out.println("Por favor, introduce un número entero positivo.");
        } else {
            System.out.println("\nDivisores de " + num + ":");

            // Este sera el contador de divisores
            int contador = 0;

            // Aquí recorremos el número y comprobamos si es divisible por cada uno de los enteros del 1 al numero
            for (int i = 1; i <= num; i++) {

                if (num % i == 0) {
                    System.out.print(i + " ");
                    contador++;
                }
            }
            System.out.println("\nNúmero total de divisores: " + contador);
        }
        scanner.close();
    }
}
