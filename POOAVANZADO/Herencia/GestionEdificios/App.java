package POOAVANZADO.Herencia.GestionEdificios;

import java.util.Scanner;
import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Edificio> edificios = new ArrayList<>();

        // Creamos las instancias
        edificios.add(new Polideportivo(15, 10, 20, "Limacity", "Abierto"));
        edificios.add(new Polideportivo(4, 2, 6, "Ouke", "Techado"));
        edificios.add(new EdificioOficinas(7, 10, 12, 8, 2));
        edificios.add(new EdificioOficinas(16, 40, 23, 10, 5));

        for (Edificio e : edificios) {
            System.out.println("\n" +
                    e.toString() + " Superficie: " + e.calcularSuperficie() + " Volumen:" + e.calcularVolumen());
        }

        for (Edificio e : edificios) {
            if (e instanceof Polideportivo) {
                Polideportivo p = (Polideportivo) e;
                if (p.getTipo().equals("Techado")) {
                    Polideportivo.cantTechado++;
                } else {
                    Polideportivo.cantAbierto++;
                }
            } else if (e instanceof EdificioOficinas) {
                EdificioOficinas o = (EdificioOficinas) e;
                System.out.println(o.cantPersonas());
            }
        }

        System.out.println("Polideportivos Techados:" + Polideportivo.cantTechado);
        System.out.println("Polideportivos Abiertos:" + Polideportivo.cantAbierto);

        // Cerramos el scanner
        scan.close();
    }
}
