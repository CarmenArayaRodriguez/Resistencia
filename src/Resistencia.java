import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Se solicita al usuario que ingrese 3 resistencias
        System.out.print("Ingrese resistencia 1: ");
        float R1 = scanner.nextFloat();
        System.out.print("Ingrese resistencia 2: ");
        float R2 = scanner.nextFloat();
        System.out.print("Ingrese resistencia 3: ");
        float R3 = scanner.nextFloat();

        // Se verifica que todas las resistencias ingresadas sean positivas
        if (R1 <= 0 || R2 <= 0 || R3 <= 0) {

            // Si las resistencias son negativas, se muestra el mensaje:
            System.out.println("Todas las resistencias deben ser positivas.");

            // Se cierra el objeto scanner
            scanner.close();

            // Finaliza el programa
            return;
        }

        // Si los valores ingresados son positivos,se calcula la resistencia total
        float RT = 1 / (1 / R1 + 1 / R2 + 1 / R3);

        // Se muestra el resultado con dos decimales de precisión
        System.out.printf("La resistencia total es de %.2f\n", RT);

        // Se cierra el objeto scanner
        scanner.close();
    }
}
