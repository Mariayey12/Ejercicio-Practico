package EjercicioPractico;
// 1. Solicitar al usuario un número de cliente.
// Si el número es el 1000, imprimir
//“Ganaste un premio” de lo contrario imprimir “Sigue participando”.


import java.util.Scanner;

public class NumeroClient {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa tu número de client: ");
            int numeroCliente = scanner.nextInt();

            if (numeroCliente == 1000) {
                System.out.println("¡Ganaste un premio!");
            } else {
                System.out.println("Sigue participando.");
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa un número válido.");
        }
    }
}
