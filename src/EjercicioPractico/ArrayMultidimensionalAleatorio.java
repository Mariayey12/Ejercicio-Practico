package EjercicioPractico;

import java.util.Scanner;
        import java.util.Random;

public class ArrayMultidimensionalAleatorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el número de filas: ");
        int filas = scanner.nextInt();

        System.out.print("Ingrese el número de columnas: ");
        int columnas = scanner.nextInt();

        int[][] array = new int[filas][columnas];

        rellenaArray(array, 100); // Renelle con números aleatorios entre 1 y 100

        mostrarArray(array);
    }

    public static void rellenaArray(int[][] array, int limite) {
        Random rand = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rand.nextInt(limite) + 1;
            }
        }
    }

    public static void mostrarArray(int[][] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
