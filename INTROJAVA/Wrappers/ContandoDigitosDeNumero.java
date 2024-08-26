package Wrappers;

import java.util.Scanner;

public class ContandoDigitosDeNumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("Ingrese un número");
            int number = scan.nextInt();
            String numberString = Integer.toString(number);
            int count = 0;

            for (int i = 0; i < numberString.length(); i++) {
                if (Character.isDigit(numberString.charAt(i))) {
                    count++;
                }
            }

            System.out.println("El número tiene " + count + " digitos.");

        } catch (Exception e) {
            System.out.println("Ingrese correctamente un número.");
        }

        scan.close();

    }
}
