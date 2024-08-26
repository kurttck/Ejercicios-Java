import java.util.Scanner;

public class ExtracciónDeSubcadena {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa una frase");
        String name=scanner.nextLine();
        System.out.println("Ingresa primer Numero Entero");
        int number1=scanner.nextInt();
        System.out.println("Ingresa segundo Numero Entero");
        int number2=scanner.nextInt();


        System.out.println(name.substring(number1,number2));

        scanner.close();
    }
}
