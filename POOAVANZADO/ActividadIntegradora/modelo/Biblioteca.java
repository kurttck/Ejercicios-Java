package POOAVANZADO.ActividadIntegradora.modelo;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    public List<Libro> libros = new ArrayList<>();
    public List<Persona> personas = new ArrayList<>();

    public void agregarLibro(String titulo, String autor, int numPaginas, boolean prestado) {
        libros.add(new Libro(titulo, autor, numPaginas, prestado));
    }

    public void prestarLibro(Persona persona, Libro libro) {
        libro.setPrestado(true);
        persona.getLibros().add(libro);
    }

    public void agregarPersona(String name, String lastname, List<Libro> libros) {
        personas.add(new Persona(name, lastname, libros));
    }
}
