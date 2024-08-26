import java.util.InputMismatchException;
import java.util.Scanner;

public class RestaConExcepciones {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("RESTA SEGURA");

        try{
            System.out.println("Ingrese el primer número");
            int number1=scanner.nextInt();
            System.out.println("Ingrese el primer número");
            int number2=scanner.nextInt();

            System.out.println("La resta es: "+(number1-number2));
        }catch(InputMismatchException e){
            System.out.println("Ingresa correctamente los numeros");
        }

        scanner.close();
    }
}
