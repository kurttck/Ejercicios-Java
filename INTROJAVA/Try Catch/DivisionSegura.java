import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSegura {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("DIVISION SEGURA");
        try{
            System.out.println("Ingrese el primer número");
            int number1=scanner.nextInt();
            System.out.println("Ingrese el segundo número");
            int number2=scanner.nextInt();

            System.out.println("La division es: "+(number1/number2));
            
        }catch(ArithmeticException e){
            System.out.println("Esta dividiendo por 0! eso no se puedea"+e.getMessage());
        }catch(InputMismatchException e){
            System.out.println("Ingresa números no letras, asu que sano"+e.getMessage());
        }

        scanner.close();
    }
}
