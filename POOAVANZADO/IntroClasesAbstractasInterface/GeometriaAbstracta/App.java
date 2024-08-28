package POOAVANZADO.IntroClasesAbstractasInterface.GeometriaAbstracta;

import POOAVANZADO.IntroClasesAbstractasInterface.GeometriaAbstracta.modelo.Rectangulo;
import POOAVANZADO.IntroClasesAbstractasInterface.GeometriaAbstracta.modelo.Circulo;
import POOAVANZADO.IntroClasesAbstractasInterface.GeometriaAbstracta.modelo.Triangulo;

public class App {
    public static void main(String[] args) {

        Circulo circulo = new Circulo(10);
        circulo.dibujar();

        Rectangulo rectangulo = new Rectangulo(10, 5);
        rectangulo.dibujar();

        Triangulo triangulo = new Triangulo(10, 12, 12);
        triangulo.dibujar();

    }
}