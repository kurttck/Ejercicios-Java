import java.util.Scanner;

public class CalculandoLaPotencia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese dos números enteros para generar la potencia");
        System.out.println("Ingrese la base");
        int base=scanner.nextInt();

        System.out.println("Ingrese el exponente");
        int exp=scanner.nextInt();

        System.out.println("El resultado es: "+Math.pow(base, exp));

        scanner.close();
    }    
}
