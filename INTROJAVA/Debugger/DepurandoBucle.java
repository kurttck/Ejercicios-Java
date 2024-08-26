package Debugger;

public class DepurandoBucle {

    public static void main(String[] args) {
        System.out.println("Hola bienvenido al debugger");
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int suma = 0;
        for (int i = 0; i < numbers.length; i++) {
            suma += numbers[i];
        }

        System.out.println(suma);
    }
}