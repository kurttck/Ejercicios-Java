package Wrappers;

import java.util.Scanner;

public class SumaDeNumeros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("Ingresa un número entero.");
            String number = scan.nextLine();
            System.out.println("Ingresa un número decimal.");
            String decimal = scan.nextLine();

            //convertimos la cadena a sus respectivos tipo de datos
            int numberint=Integer.valueOf(number);
            double decimaldouble=Double.valueOf(decimal);

            System.out.println("La suma de los números es: "+(numberint+decimaldouble));

        } catch (Exception e) {
            System.out.println("Ocurrio un error.");
        }

        scan.close();
    }
}
