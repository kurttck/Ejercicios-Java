package JAVACOLLECTION.CollectionArrayList.SopaDeNumeros;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        ArrayList<Integer> numeros = leerValores();
        Integer Suma = calcularSuma(numeros);
        Double Promedio = calcularPromedio(numeros);
        mostrarResultados(numeros, Suma, Promedio);

    }

    public static ArrayList<Integer> leerValores() {
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int number = 0;
        do {
            System.out.println("Ingresa un número");
            number = scan.nextInt();
            if (number != -99) {
                numeros.add(number);
            }
        } while (number != -99);

        return numeros;
    }

    public static Integer calcularSuma(ArrayList<Integer> number) {
        int suma = 0;
        for (int i = 0; i < number.size(); i++) {
            suma += number.get(i);
        }
        return suma;
    }

    public static Double calcularPromedio(ArrayList<Integer> numbers) {
        int suma = 0;
        for (int i = 0; i < numbers.size(); i++) {
            suma += numbers.get(i);
        }
        return (double) suma / numbers.size();
    }

    public static void mostrarResultados(ArrayList<Integer> numbers, Integer Suma, Double Promedio) {

        for (int number : numbers) {
            System.out.println(number);
        }
        System.out.println("Suma: " + Suma);
        System.out.println("Promedio: " + Promedio);
        System.out.println("Numeros superior a la media");
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) > Promedio) {
                System.out.println(numbers.get(i));
            }
        }
    }

}
