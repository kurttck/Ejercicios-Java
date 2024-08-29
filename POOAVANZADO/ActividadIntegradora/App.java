package POOAVANZADO.ActividadIntegradora;

import POOAVANZADO.ActividadIntegradora.modelo.Libro;
import POOAVANZADO.ActividadIntegradora.modelo.Persona;

import java.util.ArrayList;

import POOAVANZADO.ActividadIntegradora.modelo.Biblioteca;

class App {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        System.out.println("\n");
        biblioteca.agregarLibro("Harry Potter", "J.K. Rowling", 400, false);
        biblioteca.agregarLibro("El Senor de los Anillos", "J.R.R. Tolkien", 700, false);
        biblioteca.agregarLibro("El Hobbit", "J.R.R. Tolkien", 500, false);

        for (Libro l : biblioteca.libros) {
            System.out.println(l.mostrarInformacion());
        }

        System.out.println("\nAgregamos Persona");
        biblioteca.agregarPersona("Kurt", "Angeles", new ArrayList<>());

        biblioteca.prestarLibro(biblioteca.personas.get(0), biblioteca.libros.get(2));

        for (Libro l : biblioteca.libros) {
            System.out.println(l.mostrarInformacion());
        }

        System.out.println("\n-----------Info Personas -----------------");
        for (Persona p : biblioteca.personas) {
            System.out.println(p.mostrarInformacion());
        }

    }
}