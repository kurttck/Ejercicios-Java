package POOAVANZADO.IntroClasesAbstractasInterface.GeometriaAbstracta.modelo;

import POOAVANZADO.IntroClasesAbstractasInterface.GeometriaAbstracta.modelo.Figura.Dibujable;

public class Rectangulo extends Figura implements Dibujable {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public Double calcularArea() {
        return base * altura;
    }

    @Override
    public Double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public void dibujar() {
        System.out.println("Dibujando Rectangulo");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}
