package INTROPOO.EncapsulamientoYOcultamiento.FiguraGeometrica.modelos;

public class Rectangulo {
    private double ancho;
    private double alto;

    public Rectangulo() {
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public Double area() {
        return ancho * alto;
    }

    public Double perimetro() {
        return 2 * (ancho + alto);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }

}
