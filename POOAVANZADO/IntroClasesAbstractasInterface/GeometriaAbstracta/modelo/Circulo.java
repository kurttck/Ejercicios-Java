package POOAVANZADO.IntroClasesAbstractasInterface.GeometriaAbstracta.modelo;

import POOAVANZADO.IntroClasesAbstractasInterface.GeometriaAbstracta.modelo.Figura.Dibujable;;

public class Circulo extends Figura implements Dibujable {
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public Double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public Double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public void dibujar() {
        System.out.println("Dibujando Circulo");
        for (int i = (int) -radio; i < radio; i++) {
            for (int j = (int) -radio; j < radio; j++) {
                if ((i * i) + (j * j) <= (radio * radio)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

}
