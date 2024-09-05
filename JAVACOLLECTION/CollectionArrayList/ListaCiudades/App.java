package JAVACOLLECTION.CollectionArrayList.ListaCiudades;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<String> ciudades = new ArrayList<String>();
        int option = 0;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Ingresar ciudad");
            System.out.println("2. Mostrar");
            System.out.println("3. Salir");

            option = scan.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Ingrese la ciudad");
                    scan.nextLine();
                    String ciudad = scan.nextLine();
                    ciudades.add(ciudad);
                    break;
                case 2:
                    System.out.println("ciudades");
                    for (int i = 0; i < ciudades.size(); i++) {
                        System.out.println((i + 1) + ". " + ciudades.get(i));
                    }
                    break;
                case 3:
                    System.out.println("Saliendo");

                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (option != 3);

        scan.close();
    }

}
