import java.util.Scanner;

//Even and Odd
public class IndentificadorParInpar {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número: ");
        int numero = scanner.nextInt();

        System.out.println("El número es "+ (numero%2==0 ? "Par" : "Impar"));

        scanner.close();
    }
}


