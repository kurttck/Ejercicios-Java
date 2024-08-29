package POOAVANZADO.ActividadIntegradora.modelo;

import java.util.List;

public class Persona {
    private String name;

    private String lastName;
    private List<Libro> libros;

    public Persona() {

    }

    public Persona(String name, String lastName, List<Libro> libros) {
        this.name = name;
        this.lastName = lastName;
        this.libros = libros;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    public void setLibros(List<Libro> libros) {
        this.libros = libros;
    }

    public String mostrarInformacion() {
        return "La persona " + this.name + " " + this.lastName + " tiene los siguientes libros: "
                + this.libros.toString();
    }

    @Override
    public String toString() {
        return "";
    }
}
