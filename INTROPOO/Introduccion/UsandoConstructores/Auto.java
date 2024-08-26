package INTROPOO.Introduccion.UsandoConstructores;

public class Auto {
    String marca;
    String model;
    Integer anio;

    public Auto(String marca, String model, Integer anio) {
        this.marca = marca;
        this.model = model;
        this.anio = anio;
    }

    public Auto(String marca, String model) {
        this.marca = marca;
        this.model = model;
    }

    public Auto(String marca) {
        this.marca = marca;
    }

    public Auto() {
    }

    public void imprimirDatos() {
        if (this.marca != null && this.model != null && this.anio != null) {
            System.out.println(
                    "Hola soy un auto de marca " + this.marca + " y modelo " + this.model + " del año " + this.anio);
        } else if (this.marca != null && this.model != null) {
            System.out.println("Hola soy un auto de marca " + this.marca + " y modelo " + this.model);
        } else if (this.marca != null) {
            System.out.println("Hola soy un auto de marca " + this.marca);
        } else {
            System.out.println("No pusiste datos en el auto");
        }
    }
}
