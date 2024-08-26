import java.util.Scanner;

public class PracticaInicial {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args){
        String name = obtenerName();
        int age = obtenerEdad();
        imprimeNombreYEdad(name, age);
        scan.close();
    }
  /*   private static void imprimeNombre(String nombre){
        System.out.println("Mi nombre es "+nombre);
    } */
    private static String obtenerName(){
        System.out.println("Ingresa tu nombre");
        return scan.nextLine();
    }

    private static int obtenerEdad(){
        System.out.println("Ingresa tu edad");
        return scan.nextInt();
    }

    private static void imprimeNombreYEdad(String nombre, int edad){
        System.out.println("Me llamo "+nombre+" y tengo "+edad+" años.");
    }



}
