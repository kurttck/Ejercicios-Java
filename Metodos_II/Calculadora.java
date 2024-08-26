package Metodos_II;

import java.util.Scanner;

public class Calculadora {

    public static Scanner scanner = new Scanner(System.in);
    public static double resultado, numero1, numero2;

    public static void main(String[] args) {

        System.out.println("CALCULADORA");
        System.out.println("Ingresa el primer número: ");
        numero1 = scanner.nextDouble();

        System.out.println("Ingresa el segundo número: ");
        numero2 = scanner.nextDouble();

        menu();

        scanner.close();
    }

    public static void menu() {
        int operacion = 0;
        do {

            System.out.println(
                    "------------------ \n1. Sumar \n2. Restar \n3. Multiplicar \n4. Dividir \n5. Salir \n-------------------");
            System.out.println("Ingrese el número de la opción que usará: ");
            operacion = scanner.nextInt();

        } while (operacion < 5);

    }

    public static void resultadoOperacion(int operacion) {
        if (operacion >= 5) {
            return;
        }

        if (operacion == 1) {
            resultado = numero1 + numero2;
        } else if (operacion == 2) {
            resultado = numero1 - numero2;
        } else if (operacion == 3) {
            resultado = numero1 * numero2;
        } else if (operacion == 4) {
            resultado = numero1 / numero2;
        }

        System.out.println("El resultado es: " + resultado);
    }
}
