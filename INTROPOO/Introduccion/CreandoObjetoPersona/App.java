package INTROPOO.Introduccion.CreandoObjetoPersona;

public class App {
    public static void main(String[] args) {
        Persona person1 = new Persona();
        person1.name = "Kurt";
        person1.age = 29;

        Persona person2 = new Persona();
        person2.name = "Ariana";
        person2.age = 23;
        System.out.println("\n");
        person1.imprimirDatos();
        person2.imprimirDatos();

    }
}
