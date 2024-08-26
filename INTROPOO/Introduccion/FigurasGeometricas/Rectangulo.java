package INTROPOO.Introduccion.FigurasGeometricas;

public class Rectangulo {
    Double ancho;
    Double alto;

    static Integer contadorRectangulos = 0;

    public Rectangulo(Double ancho, Double alto) {
        this.ancho = ancho;
        this.alto = alto;
        contadorRectangulos++;
    }

    public Double area() {
        return this.alto * this.ancho;
    }

    public Double perimetro() {
        return 2 * (this.alto + this.ancho);
    }

    public void imprimirArea() {
        System.out.println("El area del rectangulo es: " + this.area());
    }

    public void imprimirPerimetro() {
        System.out.println("El perimetro del rectangulo es: " + this.perimetro());
    }

    public static int getRectangulos() {
        return contadorRectangulos;
    }
}
