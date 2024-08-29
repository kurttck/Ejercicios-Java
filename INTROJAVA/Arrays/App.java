package Arrays;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Crear un scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Crear un array para almacenar los cuatro números
        int[] numeros = new int[4];
        // Ingresar los cuatro números uno por uno
        System.out.println("Ingrese el primer número:");
        numeros[0] = scanner.nextInt();
        System.out.println("Ingrese el segundo número:");
        numeros[1] = scanner.nextInt();
        System.out.println("Ingrese el tercer número:");
        numeros[2] = scanner.nextInt();
        System.out.println("Ingrese el cuarto número:");
        numeros[3] = scanner.nextInt();
        // Sumar los números
        int suma = numeros[0] + numeros[1] + numeros[2] + numeros[3];
        // Calcular el promedio
        double promedio = (double) suma / 4;
        // Imprimir el resultado por consola
        System.out.println("La suma de los elementos es: " + suma);
        System.out.println("El promedio de los elementos es: " + promedio);
        // Cerrar el scanner
        scanner.close();
    }

}