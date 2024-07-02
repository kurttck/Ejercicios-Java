import java.util.Scanner;

public class DeterminacionDeEdades {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese su edad");

        int age = scanner.nextInt();

        if(age>=18 && age<=64){
            System.out.print("Eres adulto");
        }else if(age<18){
            System.out.println("Eres menor de edad.");
        }else{
            System.out.println("Eres un adulto mayor");
        }

        scanner.close();
    }
}
