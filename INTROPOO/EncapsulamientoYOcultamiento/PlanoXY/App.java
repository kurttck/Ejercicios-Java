package INTROPOO.EncapsulamientoYOcultamiento.PlanoXY;

import java.util.Scanner;

import INTROPOO.EncapsulamientoYOcultamiento.PlanoXY.modelos.Punto;

import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Punto> puntos = new ArrayList<>();
        int option = 0;
        do {
            System.out.println("\nMenu\n");
            System.out.println("1. Crear Punto");
            System.out.println("2. Ver Puntos");
            System.out.println("3. Ver Distancia de origen");
            System.out.println("4. Ver Distancia");
            System.out.println("5. Ver si estan Alineados");
            System.out.println("6. Salir");
            option = scan.nextInt();
            int indice, indice1, indice2, indice3;
            switch (option) {

                case 1:
                    System.out.println("Crearemos un Punto");
                    System.out.println("Ingrese la coordenada X");
                    double x = scan.nextDouble();
                    System.out.println("Ingrese la coordenada Y");
                    double y = scan.nextDouble();
                    puntos.add(new Punto(x, y));
                    break;
                case 2:
                    System.out.println("Los puntos creados son:");
                    for (Punto p : puntos) {
                        System.out.println((puntos.indexOf(p) + 1) + ". " + p.toString());
                    }
                    break;
                case 3:
                    System.out.println("Ver la distancia entre el punto y el origen");
                    System.out.println("Ingrese el indice del punto");
                    indice = scan.nextInt();
                    if (indice >= 0 && indice <= puntos.size()) {
                        System.out.println(puntos.get(indice - 1).distanciaDesdeOrigen(puntos.get(indice - 1).getX(),
                                puntos.get(indice - 1).getY()));
                    } else {
                        System.out.println("Punto no encontrado");
                    }
                    break;
                case 4:
                    System.out.println("Ver la distancia entre dos puntos");
                    System.out.println("Ingrese el indice del primer punto");
                    indice1 = scan.nextInt();
                    System.out.println("Ingrese el indice del segundo punto");
                    indice2 = scan.nextInt();
                    if (indice1 >= 0 && indice1 <= puntos.size() && indice2 >= 0 && indice2 <= puntos.size()) {
                        System.out.println(Punto.distancia(puntos.get(indice2 - 1), puntos.get(indice1 - 1)));
                    } else {
                        System.out.println("Punto no encontrado");
                    }
                    break;
                case 5:
                    System.out.println("Ver si dos puntos estan Alineados");
                    System.out.println("Ingrese el indice del primer punto");
                    indice1 = scan.nextInt();
                    System.out.println("Ingrese el indice del segundo punto");
                    indice2 = scan.nextInt();
                    System.out.println("Ingrese el indice del tercer punto");
                    indice3 = scan.nextInt();
                    if (indice1 >= 0 && indice1 <= puntos.size() && indice2 >= 0 && indice2 <= puntos.size()
                            && indice3 >= 0 && indice3 <= puntos.size()) {
                        System.out.println(Punto.estanAlineados(puntos.get(indice1 - 1), puntos.get(indice2 - 1),
                                puntos.get(indice3 - 1)));
                    } else {
                        System.out.println("Punto no encontrado");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        } while (option != 6);
        scan.close();
    }
}
