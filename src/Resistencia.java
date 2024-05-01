import java.util.Scanner;

public class Resistencia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float R1 = 0;
        float R2 = 0;
        float R3 = 0;

        // Se solicita al usuario que ingrese 3 resistencias
        do {
            System.out.print("Ingrese resistencia 1: ");
            R1 = scanner.nextFloat();
            if (R1 <= 0) {
                System.out.println("Todas las resistencias deben ser positivas. Por favor, ingrese un valor positivo.");
            }
        } while (R1 <= 0);

        do {
            System.out.print("Ingrese resistencia 2: ");
            R2 = scanner.nextFloat();
            if (R2 <= 0) {
                System.out.println("Todas las resistencias deben ser positivas. Por favor, ingrese un valor positivo.");
            }
        } while (R2 <= 0);

        do {
            System.out.print("Ingrese resistencia 3: ");
            R3 = scanner.nextFloat();
            if (R3 <= 0) {
                System.out.println("Todas las resistencias deben ser positivas. Por favor, ingrese un valor positivo.");
            }
        } while (R3 <= 0);

        // Si los valores ingresados son positivos,se calcula la resistencia total
        float RT = 1 / (1 / R1 + 1 / R2 + 1 / R3);

        // Se muestra el resultado con dos decimales de precisión
        System.out.printf("La resistencia total es de %.1f\n", RT);

        // Se cierra el objeto scanner
        scanner.close();
    }
}

