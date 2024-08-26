package Metodos_III;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa el numero");
        int number = scan.nextInt();
        int fibonacci = fibonacci(number);
        System.out.println("El enésimo número de la serie Fibonacci es: " + fibonacci);
        scan.close();

    }

    public static int fibonacci(int number) {
        if (number <= 1) {
            return number;
        } else {
            return fibonacci(number - 1) + fibonacci(number - 2);
        }
    }
}
