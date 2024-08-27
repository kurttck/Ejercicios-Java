package INTROPOO.Introduccion.FigurasGeometricas;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int option = 0;
        Scanner scan = new Scanner(System.in);
        Rectangulo[] rectangulos = new Rectangulo[10];
        do {
            System.out.println("\n Menú");
            System.out.println("1. Crear Rectangulo");
            System.out.println("2. Calcular area y perimetro de un rectangulo");
            System.out.println("3. Ver numero total de rectangulos creados");
            System.out.println("4. Salir");
            System.out.println("Ingrese la opción que desee");
            option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Crearemos un Rectangulo");
                    System.out.println("Ingrese el ancho");
                    double ancho = scan.nextDouble();
                    System.out.println("Igrese la altura");
                    double alto = scan.nextDouble();
                    Rectangulo nuevoRectangulo = new Rectangulo(ancho, alto);
                    rectangulos[Rectangulo.getRectangulos() - 1] = nuevoRectangulo;
                    System.out.println("Rectangulo creado");
                    break;

                case 2:
                    System.out.println("Ingrese el indice del Rectangulo");
                    int indice = scan.nextInt();

                    if (indice >= 0 && indice < Rectangulo.getRectangulos()) {
                        System.out.println("Area:" + rectangulos[indice].area());
                        System.out.println("Perimetro:" + rectangulos[indice].perimetro());
                    } else {
                        System.out.println("indice invalido");
                    }
                    break;
                case 3:
                    System.out.println("Numero total de rectangulos:" + Rectangulo.getRectangulos());
                    break;

                case 4:
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opcion invalida");
                    break;
            }

        } while (option != 4);

        scan.close();
    }
}
