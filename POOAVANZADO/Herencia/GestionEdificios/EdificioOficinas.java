package POOAVANZADO.Herencia.GestionEdificios;

public class EdificioOficinas extends Edificio {
    int numberOffices;
    int numberFloors;

    public EdificioOficinas(double ancho, double alto, double largo, int numberOffices, int numberFloors) {
        super(ancho, alto, largo);
        this.numberOffices = numberOffices;
        this.numberFloors = numberFloors;
    }

    public int getNumberOffices() {
        return numberOffices;
    }

    public void setNumberOffices(int numberOffices) {
        this.numberOffices = numberOffices;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    public int cantPersonas() {
        return numberOffices * numberFloors;
    }

}
