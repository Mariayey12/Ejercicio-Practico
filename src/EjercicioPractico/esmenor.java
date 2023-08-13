//Solicitar al usuario que ingrese dos números e imprima cuál de los dos
//es menor. Considerar el caso en que ambos números son iguales.
package EjercicioPractico;
import java.util.Scanner;

public class esmenor {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa el primer número: ");
            int numero1 = scanner.nextInt();

            System.out.print("Ingresa el segundo número: ");
            int numero2 = scanner.nextInt();

            if (numero1 == numero2) {
                System.out.println("Ambos números son iguales.");
            } else if (numero1 < numero2) {
                System.out.println("El primer número es menor: " + numero1);
            } else {
                System.out.println("El segundo número es menor: " + numero2);
            }
        } catch (Exception e) {
            System.out.println("Error: Ingresa números válidos.");
        }
    }
}
