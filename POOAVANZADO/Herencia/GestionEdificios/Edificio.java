package POOAVANZADO.Herencia.GestionEdificios;

public class Edificio {
    protected double ancho;
    protected double alto;
    protected double largo;

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

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public Edificio(double ancho, double alto, double largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    // METODOS

    public double calcularSuperficie() {
        return this.ancho * this.alto;
    }

    public double calcularVolumen() {
        return this.ancho * this.alto * this.largo;
    }

}
