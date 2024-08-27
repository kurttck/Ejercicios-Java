package POOAVANZADO.Herencia.LigaDeFutbol;

public class Jugador extends Persona {
    private int number;

    public Jugador(String name, Integer age, String team, int number) {
        super(name, age, team);
        this.number = number;
    }

    @Override
    public void gritarGol() {
        System.out.println(getName() + " (Jugador) con camiseta numero" + number + " grita: ¡Golazo!");
    }

    @Override
    public String toString() {
        return "Jugador{" + "number=" + number + ", name=" + name + ", age=" + age + ", team=" + team + '}';
    }

}
