package POOAVANZADO.IntroClasesAbstractasInterface.GestionBiblioteca.modelos;

public abstract class ItemBiblioteca {
    public abstract void prestar();

    public abstract void devolver();

    public abstract Double calcularMultas();

    public interface Catalogable {
        String obtenerInformacion();

    }

}
