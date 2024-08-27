package POOAVANZADO.Herencia.HerenciaSimpleMascota;

public class App {
    public static void main(String[] args) {
        Animal animal1 = new Perro("Nicki", 3, "chusco");
        Animal animal2 = new Gato("Weiser", 1, "Bonito");
        Animal animal3 = new Animal("Simba", 5);
        Animal animal4 = new Gato("Weiser", 1, "Bonito");

        Animal[] animales = { animal1, animal2, animal3, animal4, animal1, animal3, animal2, animal1, animal4,
                animal2 };

        for (Animal animal : animales) {
            if (animal instanceof Perro) { // instanceof Sirve para comparar si es un objeto o no
                System.out.println("Es un perro");
                System.out.println(animal.comer()); // metodo modificado
                ((Perro) animal).ladrar(); // metodo especifico
            }
            if (animal instanceof Gato) {
                System.out.println("Es un gato");
                System.out.println(animal.dormir());
                ((Gato) animal).maullar();
            }
        }

        // System.out.println(animal1.comer());
        // System.out.println(animal2.dormir());
        // System.out.println(animal3.comer());
        // metodo(animal1, animal2);
        // metodo(animal2, animal4);

    }

    public static void metodo(Animal animal1, Animal animal2) {
        System.out.println("Instancia 1 es igual a instancia 2?= " + animal1.equals(animal2));
    }

    public static void metodo(Animal instancia) {

    }
}
