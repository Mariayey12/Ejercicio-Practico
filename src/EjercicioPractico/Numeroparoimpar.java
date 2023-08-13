package EjercicioPractico;
import java.util.Scanner;

public class Numeroparoimpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingresa un número: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                System.out.println("El número ingresado es par.");
            } else {
                System.out.println("El número ingresado es impar.");
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa un número válido.");
        } finally {
            scanner.close();
        }
    }
}
