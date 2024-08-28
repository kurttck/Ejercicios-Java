package POOAVANZADO.IntroClasesAbstractasInterface.GestionBiblioteca;

//import POOAVANZADO.IntroClasesAbstractasInterface.GestionBiblioteca.modelos.Pelicula;
//import POOAVANZADO.IntroClasesAbstractasInterface.GestionBiblioteca.modelos.Libro;
import POOAVANZADO.IntroClasesAbstractasInterface.GestionBiblioteca.modelos.Revista;

class App {
    public static void main(String[] args) {

        Revista[] revistas = new Revista[3];
        revistas[0] = new Revista(1, 5, "Revista 1");
        revistas[1] = new Revista(2, 1, "Revista 2");
        revistas[2] = new Revista(3, 15, "Revista 3");

        for (Revista r : revistas) {
            System.out.println("Informacion de Revistas");
            System.out.println(r.obtenerInformacion());
            System.out.println();
        }

        Revista revistaEjemplo = revistas[0];

        revistaEjemplo.prestar();
        System.out.println("Stock actualizado quedan: " + revistaEjemplo.getCant());
        revistaEjemplo.devolver();
        System.out.println("Stock actualizado quedan: " + revistaEjemplo.getCant());

    }
}