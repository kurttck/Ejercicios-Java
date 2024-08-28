package POOAVANZADO.IntroClasesAbstractasInterface.GestionBiblioteca.modelos;

public class Pelicula extends ItemBiblioteca {

    @Override
    public void prestar() {
        // prestado
    }

    @Override
    public void devolver() {
        // devuelto
    }

    @Override
    public Double calcularMultas() {
        return null;
        // calculado
    }

    public String obtenerInformacion() {
        return "Peliculas";
    }
}
