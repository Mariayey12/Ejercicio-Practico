//Escribir un programa que pida el ingreso de una calificación (de la A a
//la F) e imprima la evaluación de dicha calificación.

import java.util.Scanner;

public class calificacion {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa una calcification (A, B, C, D, E o F): ");
            String calificacion = scanner.nextLine().toUpperCase();

            String evaluacion;

            switch (calificacion) {
                case "A":
                    evaluacion = "Excellent";
                    break;
                case "B":
                    evaluacion = "Buena";
                    break;
                case "C":
                    evaluacion = "Regular";
                    break;
                case "D":
                    evaluacion = "Mala";
                    break;
                case "E":
                    evaluacion = "Muy mala";
                    break;
                case "F":
                    evaluacion = "Reprobado";
                    break;
                default:
                    evaluacion = "Calificación inválida";
            }

            System.out.println("Evaluación: " + evaluacion);
        } catch (Exception e) {
            System.out.println("Error: Ingresa una calificación válida.");
        }
    }
}
