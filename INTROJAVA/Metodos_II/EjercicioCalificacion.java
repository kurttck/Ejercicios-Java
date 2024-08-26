package Metodos_II;

import java.util.Scanner;

public class EjercicioCalificacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un número entre 0 y 100");
        int number = scanner.nextInt();
        if (number >= 0 && number <= 100) {
            String nota = obtenerNota(number);
            System.out.println("La puntuación es: " + nota);
        } else {
            System.out.println("El número ingresado está fuera del rango válido");
        }

        scanner.close();
    }

    public static String obtenerNota(int number) {
        if (number >= 90) {
            return "A";
        } else if (number >= 80 && number <= 89) {
            return "B";
        } else if (number >= 70 && number <= 79) {
            return "C";
        } else if (number >= 60 && number <= 69) {
            return "D";
        } else {
            return "F";
        }

    }
}
