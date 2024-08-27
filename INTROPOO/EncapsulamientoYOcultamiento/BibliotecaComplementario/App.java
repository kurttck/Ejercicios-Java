package INTROPOO.EncapsulamientoYOcultamiento.BibliotecaComplementario;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import INTROPOO.EncapsulamientoYOcultamiento.BibliotecaComplementario.modelos.Libro;

public class App {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Libro> libros = new ArrayList<Libro>();
        int option = 0, page = 0, indice;
        String nombre, autor;
        do {
            System.out.println("\nMenu\n");
            System.out.println("1. Agregar libro");
            System.out.println("2. Ver libros");
            System.out.println("3. Colocar cantidad de Paginas");
            System.out.println("4. Imprimir detalles");
            System.out.println("5. Salir");
            System.out.println("Ingrese la opción que desee");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Crearemos un Libro");
                    System.out.println("Ingrese el nombre del libro");
                    scan.nextLine();
                    nombre = scan.nextLine();
                    System.out.println("Ingrese el autor del libro");
                    autor = scan.nextLine();
                    Libro libro = new Libro(nombre, autor);
                    libros.add(libro);
                    break;

                case 2:
                    System.out.println("Libros");
                    for (Libro l : libros) {
                        System.out.println((libros.indexOf(l) + 1) + ". " + l.AllBooks());
                    }
                    break;
                case 3:
                    System.out.println("Colocar cantidad de Paginas");
                    System.out.println("Ingrese el indice del libro");
                    indice = scan.nextInt();
                    System.out.println("Ingrese la cantidad de paginas");
                    page = scan.nextInt();
                    libros.get(indice - 1).setNumPaginas(Libro.calcularPaginas(page));
                    break;

                case 4:
                    System.out.println("Libros");
                    for (Libro l : libros) {
                        System.out.println((libros.indexOf(l) + 1) + ". " + l.mostrarInformacion());
                    }
                    break;
                case 5:
                    System.out.println("Saliendo");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (option != 5);

        scan.close();
    }
}
