
import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa tu edad: ");
            int edad = scanner.nextInt();

            if (edad <= 0) {
                System.out.println("Error: Ingresa una edad válida.");
            } else {
                for (int i = 1; i <= edad; i++) {
                    System.out.println("Has cumplido " + i + " años.");
                }
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa un número válido para la edad.");
        }
    }
}
