package POOAVANZADO.Herencia.LigaDeFutbol;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Persona> equipo = new ArrayList<>();

        // Agregamos Jugadores
        List<Persona> equipoBarcelona = new ArrayList<>();
        equipoBarcelona.add(new Jugador("Messi", 34, "Barcelona", 10));
        equipoBarcelona.add(new Jugador("Neymar", 29, "Barcelona", 11));
        equipoBarcelona.add(new Entrenador("Xavi Hernandez", 41, "Barcelona"));

        List<Persona> equipoRealMadrid = new ArrayList<>();
        equipoRealMadrid.add(new Jugador("Cristiano Ronaldo", 36, "Real Madrid", 7));
        equipoRealMadrid.add(new Jugador("Luka Modric", 34, "Real Madrid", 10));
        equipoRealMadrid.add(new Entrenador("Zinedine Zidane", 46, "Real Madrid"));

        // Seleccion de equipo para añadir al ArrayList "equipo"
        System.out.println("Selecciona el equipo:");
        System.out.println("1. Barcelona");
        System.out.println("2. Real Madrid");
        int seleccion = scan.nextInt();
        if (seleccion == 1) {
            equipo.addAll(equipoBarcelona);
        } else if (seleccion == 2) {
            equipo.addAll(equipoRealMadrid);
        } else {
            System.out.println("Opcion no valida");
            scan.close();
            return;
        }

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Ver Equipo");
            System.out.println("2. Gritar Gol");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opcion");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    System.out.println("\nEquipo");
                    for (Persona p : equipo) {
                        System.out.println(p.toString());
                    }
                    break;
                case 2:
                    System.out.println("\nGritar Gol");
                    for (Persona p : equipo) {
                        p.gritarGol();
                    }
                case 3:
                    System.out.println("\nSaliendo...");
                    scan.close();
                    return;

                default:
                    System.out.println("\nOpcion no valida");
                    break;
            }
        }
    }
}
