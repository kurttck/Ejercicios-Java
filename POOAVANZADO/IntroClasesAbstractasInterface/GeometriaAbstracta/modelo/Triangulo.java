package POOAVANZADO.IntroClasesAbstractasInterface.GeometriaAbstracta.modelo;

import POOAVANZADO.IntroClasesAbstractasInterface.GeometriaAbstracta.modelo.Figura.Dibujable;

public class Triangulo extends Figura implements Dibujable {
    private int lado1, lado2, lado3;

    public Triangulo() {
    }

    public Triangulo(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lad2) {
        this.lado2 = lad2;
    }

    public int getLado3() {
        return lado3;
    }

    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }

    @Override
    public Double calcularArea() {
        double s = (lado1 + lado2 + lado3) / 2.0;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public Double calcularPerimetro() {
        return (double) (lado1 + lado2 + lado3);
    }

    public void dibujar() {
        System.out.println("Dibujando Triangulo");

        // Dibuja el triangulo
        if (esTrianguloValido(lado1, lado2, lado3)) {

            for (int i = 0; i < lado1; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Los lados no forman un triangulo");
        }
    }

    public boolean esTrianguloValido(int lado1, int lado2, int lado3) {
        return lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1;
    }
}
