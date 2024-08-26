package INTROJAVA.Metodos_I;

import java.util.Scanner;

public class TablaDeMultiplicar {
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int number = getNumber();
        imprimirTablaMultiplicar(number);
    }

    private static int getNumber() {
        System.out.println("Ingrese un número");
        return scan.nextInt();
    }

    private static void imprimirTablaMultiplicar(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
