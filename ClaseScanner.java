import java.util.Scanner;

public class ClaseScanner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        int res = firstNumber - secondNumber;
        int mult = firstNumber * secondNumber;
        int div = firstNumber/secondNumber;
        int modulo=firstNumber%secondNumber;

        System.out.println("La suma de los numeros es : "+ sum);
        System.out.println("La resta de los numeros es : "+ res);
        System.out.println("La multiplicación de los numeros es : "+ mult);
        System.out.println("La división de los numeros es : "+ div);
        System.out.println("El residuo de los numeros es : "+ modulo);

        System.out.println(
            "El numero " + firstNumber + " is mayor que " + secondNumber + ": "+(firstNumber>secondNumber));
        System.out.println(
            "El numero " + firstNumber + " is diferente" + secondNumber + ": "+(firstNumber!=secondNumber));
        System.out.println(
            "El numero " + firstNumber + " Es divisible entre 2: "+(firstNumber%2==0));

        
        System.out.println("Enter the tercer number: ");
        int thirdNumber = scanner.nextInt();

        
        System.out.println("Enter the cuarto number: ");
        int fourNumber = scanner.nextInt();

        System.out.println(firstNumber>secondNumber && thirdNumber>fourNumber);
        System.out.println(firstNumber>secondNumber || thirdNumber>fourNumber);



        scanner.close();
    }
}   
