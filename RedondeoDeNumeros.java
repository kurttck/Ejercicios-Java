import java.util.Scanner;

public class RedondeoDeNumeros {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número decimal");
        double decimal=scanner.nextDouble();

        System.out.println("Su valor redondeado es: "+Math.round(decimal));

        scanner.close();
    }
}
