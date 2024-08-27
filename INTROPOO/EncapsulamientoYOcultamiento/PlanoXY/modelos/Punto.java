package INTROPOO.EncapsulamientoYOcultamiento.PlanoXY.modelos;

public class Punto {
    private double x;
    private double y;

    public Punto() {
    }

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Double distanciaDesdeOrigen(double x, double y) {
        return Math.sqrt(x * x + y * y);
    }

    public static Double distancia(Punto p1, Punto p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    public static String estanAlineados(Punto p1, Punto p2, Punto p3) {
        double pendiente1 = (p2.y - p1.y) * (p3.x - p2.x);
        double pendiente2 = (p3.y - p2.y) * (p2.x - p1.x);
        return (pendiente1 == pendiente2 ? "Alineados " : "No Alineados");
    }
}
