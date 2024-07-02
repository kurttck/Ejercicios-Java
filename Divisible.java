import java.util.Scanner;

public class Divisible {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número para averiguar si es divisible por 5, por 3 o por ambos o ninguno");
        int number = scanner.nextInt();

        if(number%5==0 && number%3==0){
            System.out.println("El número es divisible por ambos");
        }else if(number%5==0){
            System.out.println("Es divisible por 5");
        }else if(number%3==0){
            System.out.println("Es divisible por 3");
        }else{
            System.out.println("No es divisible por ninguno");
        }

        scanner.close();
    }

}
