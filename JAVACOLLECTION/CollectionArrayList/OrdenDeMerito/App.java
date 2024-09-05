package JAVACOLLECTION.CollectionArrayList.OrdenDeMerito;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Integer> notas = new ArrayList<Integer>();
        int option = 0;
        do {
            System.out.println("\n Menus");
            System.out.println("1. Ingresar Nota");
            System.out.println("2. Mostrar Notas");
            System.out.println("3. Salir");
            System.out.println("Ingrese la opción que desee");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Ingrese una nota entre el rango del 1 al 10");
                    scan.nextLine();
                    int nota = scan.nextInt();
                    if (nota >= 1 && nota <= 10) {
                        notas.add(nota);
                    } else {
                        System.out.println("La nota debe ser entre 1 y 10");
                    }
                    break;
                case 2:
                    System.out.println("Notas");
                    Collections.sort(notas);
                    System.out.println("Lista Ascendente" + notas.toString().replaceAll("[\\[\\]]", ""));
                    Collections.sort(notas, Collections.reverseOrder());
                    System.out.println("Lista Descendente" + notas.toString().replaceAll("[\\[\\]]", ""));
                    break;
                case 3:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("La opcion es invalida");
            }
        } while (option != 3);
        scan.close();
    }
}