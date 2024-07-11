import java.util.Scanner;

public class CalculandoElValorAbsoluto {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese un número entero.");

            int entero=scanner.nextInt();

            System.out.println("El valor absoluto es: "+Math.abs(entero));

            scanner.close();
        }
}
