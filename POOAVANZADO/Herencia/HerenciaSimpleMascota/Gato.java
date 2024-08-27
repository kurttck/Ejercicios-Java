package POOAVANZADO.Herencia.HerenciaSimpleMascota;

public class Gato extends Animal {
    String raza;

    public Gato(String name, int age, String raza) {
        super(name, age);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void maullar() {
        System.out.println("Miau");
    }

    @Override
    public String dormir() {
        return this.name + " se durmio en el sofa.";
    }
}
