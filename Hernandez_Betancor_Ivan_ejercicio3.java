package ut2;

import java.util.Scanner;

public class Hernandez_Betancor_Ivan_ejercicio3 {


// 3) Verificar contraseña (máx. 3 intentos)
// Solicitamos una contraseña numérica al usuario y verifica si es correcta. Hasta 3 intentos.


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // La contraseña correcta
        int contrasenaCorrecta = 1234;
        
        int intentos = 0;
        int contrasenaIngresada = 0;
        
        System.out.println("Sistema de verificacion de contraseña");
        
        do {
            intentos++;
            System.out.print("Intento " + intentos + " de 3.... Introduce la contraseña: ");
            contrasenaIngresada = scanner.nextInt();
            
            if (contrasenaIngresada == contrasenaCorrecta) {
                System.out.println("\nContraseña correcta. Acceso concedido.");
                break;
            } else {
                if (intentos < 3) {
                    System.out.println("Contraseña incorrecta. Intentalo de nuevo.\n");
                }
            }
            
        } while (intentos < 3 && contrasenaIngresada != contrasenaCorrecta);
        

        // Aquí mostramos el mensaje de bloqueo si se agotaron los intentos
        if (intentos == 3 && contrasenaIngresada != contrasenaCorrecta) {
            System.out.println("\nHas agotado los 3 intentos... Cuenta bloqueada.");
        }
        
        scanner.close();
    }
}




