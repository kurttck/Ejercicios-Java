import java.util.Scanner;

public class ConcatenacionDeCadenas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su nombre");
        String name=scanner.nextLine();
        System.out.println("Ingrese su Apellido");
        String lastname=scanner.nextLine();

        System.out.println(name.concat(" "+lastname));
        scanner.close();
    }
}
