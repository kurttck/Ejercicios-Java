package POOAVANZADO.IntroClasesAbstractasInterface.GeometriaAbstracta.modelo;

public abstract class Figura {

    public abstract Double calcularArea();

    public abstract Double calcularPerimetro();

    public interface Dibujable {
        void dibujar();
    }
}
