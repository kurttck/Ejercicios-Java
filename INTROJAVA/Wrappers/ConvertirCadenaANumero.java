package Wrappers;
import java.util.Scanner;

public class ConvertirCadenaANumero {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa un número entero");
        String number = scan.nextLine();

        
        System.out.println(Integer.valueOf(number));

        scan.close();
    }
}
