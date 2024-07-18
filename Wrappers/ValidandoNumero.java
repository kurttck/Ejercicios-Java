package Wrappers;
import java.util.Scanner;

public class ValidandoNumero {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        try {
            
        System.out.println("Ingresa un número");
        String number=scan.nextLine();
        double decimal=Double.valueOf(number);
           
        System.out.println(decimal);     

        } catch (Exception e) {
           
        System.out.println("Ingrese un número");
        }


        scan.close();

    }
}
