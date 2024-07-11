package Switch;
import java.util.Scanner;

public class CalAreayPerimetro {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa la base del rectangulo: ");
        double base=scanner.nextDouble();

        System.out.println("Ingresa la altura del rectangulo: ");
        double altura = scanner.nextDouble();

        double area=base*altura;
        double perimetro=2*(base+altura);

        System.out.println("el area es: "+ area);
        System.out.println("el area es: "+ perimetro);

        scanner.close();
    }
}
