package INTROJAVA.Metodos_I;

import java.util.Scanner;

public class TablaDeMultiplicar2 {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = getNumbers();
        imprimirTablaMultiplicar(numeros);
    }

    private static int getNumber() {
        System.out.println("Ingrese un número");
        return scan.nextInt();
    }

    private static int[] getNumbers() {
        int[] numbers = new int[3];
        for (int i = 0; i <= 2; i++) {
            numbers[i] = getNumber();
        }
        return numbers;
    }

    private static void imprimirTablaMultiplicar(int[] numbers) {
        for (int number : numbers) {
            System.out.println("Tabla de Multiplicar del número " + number);
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
            System.out.println("\n");
        }
    }
}
