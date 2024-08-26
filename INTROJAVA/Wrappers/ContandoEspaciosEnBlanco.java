package INTROJAVA.Wrappers;

import java.util.Scanner;

public class ContandoEspaciosEnBlanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una frase.");
        String sentence = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isWhitespace(sentence.charAt(i))) {
                count++;
            }
        }

        System.out.println("La cantidad de espacios es: " + count);

        scanner.close();
    }
}
