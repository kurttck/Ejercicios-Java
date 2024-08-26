package Actividad_Integradora_IV;

import java.util.Scanner;

public class NumerosPrimosPlus {

    public static boolean esPrimo(int n){
        if(n<=1){
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0) {
            return false;
        }

        for (int b = 3; b <= Math.sqrt(n); b += 2) {
            if (n % b == 0) {
               return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese la cant de primos que desee.");
        int number = scan.nextInt();
        int numberprimos = 1;
        int numberbucle = 0;

        do {

            if (esPrimo(numberbucle)) {
                System.out.println("numero primo "+ numberprimos +":  "+ numberbucle);
                numberprimos++;
            }
            numberbucle++;
        } while (numberprimos <= number);

        scan.close();
    }
}
