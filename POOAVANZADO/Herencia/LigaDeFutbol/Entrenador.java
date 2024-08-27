package POOAVANZADO.Herencia.LigaDeFutbol;

public class Entrenador extends Persona {

    public Entrenador(String name, Integer age, String team) {
        super(name, age, team);
    }

    @Override
    public void gritarGol() {
        System.out.println(getName() + " (Entrenador): ¡Vamos Equipo, Gol!");
    }

    @Override
    public String toString() {
        return "Entrenador{" + "name=" + name + ", age=" + age + ", team=" + team + '}';
    }
}
