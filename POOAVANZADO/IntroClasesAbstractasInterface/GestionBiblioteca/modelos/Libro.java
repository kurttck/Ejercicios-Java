package POOAVANZADO.IntroClasesAbstractasInterface.GestionBiblioteca.modelos;

public class Libro extends ItemBiblioteca {

    @Override
    public void prestar() {
        // fasd
    }

    @Override
    public void devolver() {
        // Automatico
    }

    @Override
    public Double calcularMultas() {
        return 0.0;
    }

    public String obtenerInformacion() {
        return "Libros";
    }

}
