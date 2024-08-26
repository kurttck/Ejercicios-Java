package Actividad_Integradora_IV;

import java.util.Scanner;

public class SerieFibonacciMejorada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa el numero");
        int number = scan.nextInt();

        if (number <= 1) {
            System.out.println("su serie finacci es: " + number);
        } else {
            int a = 0;
            int b = 1;
            int c = 0;

            for (int i = 2; i <= number; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("su serie finacci es: " + c);
        }

        scan.close();

    }
}
