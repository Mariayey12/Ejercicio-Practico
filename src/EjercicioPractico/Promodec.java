//9. Una fábrica tiene una promoción de descuento para vender un número
//de sillas, si son más de 5 sillas el descuento es de 10%, si son más de
//12 sillas el descuento es de 20%, si son más de 40 sillas el descuento
//es de 30%, imprimir el valor a pagar aplicando el descuento
//correspondiente dado el número de unidades que compre un usuario,
//el precio unitario sin descuento es de $40.000.

import java.util.Scanner;

public class Promodec {
    public static void main(String[] args) {
        final int precioUnitario = 40000;
        int cantidadSillas;
        double descuento = 0;

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa la cantidad de sillas que deseas comprar: ");
            cantidadSillas = scanner.nextInt();

            if (cantidadSillas > 5 && cantidadSillas <= 12) {
                descuento = 0.10;
            } else if (cantidadSillas > 12 && cantidadSillas <= 40) {
                descuento = 0.20;
            } else if (cantidadSillas > 40) {
                descuento = 0.30;
            }

            double precioTotal = cantidadSillas * precioUnitario * (1 - descuento);
            System.out.println("Precio a pagar: $" + precioTotal);

        } catch (Exception e) {
            System.out.println("Error: Ingresa una cantidad válida de sillas.");
        }
    }
}
