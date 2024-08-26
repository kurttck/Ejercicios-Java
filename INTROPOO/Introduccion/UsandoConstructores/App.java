package INTROPOO.Introduccion.UsandoConstructores;

public class App {
    public static void main(String[] args) {
        Auto auto1 = new Auto("BMW", "X5", 2022);
        Auto auto2 = new Auto("Mercedes", "C200");
        Auto auto3 = new Auto("Audi");
        Auto auto4 = new Auto();

        auto1.imprimirDatos();
        auto2.imprimirDatos();
        auto3.imprimirDatos();
        auto4.imprimirDatos();
    }
}
