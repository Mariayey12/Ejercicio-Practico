package EjercicioPractico;// Cree un bucle que sume los numeros del 100 al 200.

public class Buclecien {
    public static void main(String[] args) {
        int suma = 0;

        for (int i = 100; i <= 200; i++) {
            suma += i;
        }

        System.out.println("La suma de los números del 100 al 200 es: " + suma);
    }
}
