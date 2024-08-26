import java.util.Scanner;

public class AgeVerification {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Ingrese año: ");
        int birthYear = scanner.nextInt();
        final int anioActual = 2024;

        int age=anioActual-birthYear;
        String message= age>= 18 ? "Eres mayor de edad" : "Eres menor de edad";
        
        System.out.println(message+ " y tienes " + age + " años.");
        
        scanner.close();
        
    }
}
