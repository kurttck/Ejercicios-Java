package Metodos_II;

import java.util.Scanner;

public class EsPar {

    public static Scanner scan = new Scanner(System.in);
    public static Integer number;

    public static void main(String[] args) {
        System.out.println("Por favor ingrese un número");
        getNumber();
        numberPar(number);
    }

    public static void getNumber() {
        do {
            try {
                number = scan.nextInt();
            } catch (Exception e) {
                scan.nextLine();
                System.out.println("No ingresó un número, intente nuevamente");
            }
        } while (number == null);
    }

    public static void numberPar(int number) {
        if (number % 2 == 0) {
            System.out.println("El número " + number + " es par");
        } else {
            System.out.println("no es par");
        }
    }
}
