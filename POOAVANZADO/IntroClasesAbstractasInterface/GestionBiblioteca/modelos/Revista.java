package POOAVANZADO.IntroClasesAbstractasInterface.GestionBiblioteca.modelos;

import POOAVANZADO.IntroClasesAbstractasInterface.GestionBiblioteca.modelos.ItemBiblioteca.Catalogable;

public class Revista extends ItemBiblioteca implements Catalogable {
    private int numberEdition;
    private int cant;
    private String name;

    public Revista() {

    }

    public int getNumberEdition() {
        return numberEdition;
    }

    public void setNumberEdition(int numberEdition) {
        this.numberEdition = numberEdition;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Revista(int numberEdition, int cant, String name) {
        this.numberEdition = numberEdition;
        this.cant = cant;
        this.name = name;
    }

    @Override
    public void prestar() {
        if (cant > 0) {
            cant--;
            System.out.println("La revista " + name + " ha sido prestada");

        } else {
            System.out.println("La revista " + name + " no se encuentra disponible");
        }

    }

    @Override
    public void devolver() {
        cant++;
        System.out.println("La revista " + name + " ha sido devuelta");

    }

    @Override
    public Double calcularMultas() {
        return 0.0;
    }

    public String obtenerInformacion() {
        return "Nombre de la revista: " + name + "\n" +
                "Número de edición: " + Integer.toString(numberEdition) + "\n" +
                "Cantidad de ejemplares: " + Integer.toString(cant) + "\n" +
                "******************************";
    }

}
