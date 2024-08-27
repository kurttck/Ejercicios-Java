package INTROPOO.EncapsulamientoYOcultamiento.FiguraGeometrica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import INTROPOO.EncapsulamientoYOcultamiento.FiguraGeometrica.modelos.Rectangulo;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Rectangulo> rectangulos = new ArrayList<>();
        int option = 0;
        Double alto;
        Double ancho;

        do {
            System.out.println("\nMenú\n");
            System.out.println("1. Crear Rectangulo");
            System.out.println("2. Ver Rectangulos");
            System.out.println("3. Ver area y perimetro del Rectangulo");
            System.out.println("4. Salir");

            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Crearemos un Rectangulo");
                    System.out.println("Ingrese el ancho");
                    ancho = scan.nextDouble();
                    System.out.println("Ingrese la altura");
                    alto = scan.nextDouble();
                    rectangulos.add(new Rectangulo(ancho, alto));
                    break;
                case 2:
                    System.out.println("Los rectangulos creados son:");
                    for (Rectangulo r : rectangulos) {
                        System.out.println((rectangulos.indexOf(r) + 1) + ". " + r.toString());
                    }
                    break;
                case 3:
                    System.out.println("Ver el area y el Perimetro de un Rectangulo");
                    System.out.println("Ingrese el indice del Rectangulo");
                    int indice = scan.nextInt();
                    if (indice >= 0 && indice <= rectangulos.size()) {
                        System.out.println(rectangulos.get(indice - 1).toString());
                        System.out.println("Area: " + rectangulos.get(indice - 1).area());
                        System.out.println("Perimetro: " + rectangulos.get(indice - 1).perimetro());
                    } else {
                        System.out.println("Rectangulo no encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
            }

        } while (option != 4);
        scan.close();
    }

}