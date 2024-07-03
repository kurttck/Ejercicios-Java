import java.util.Scanner;

public class ConversonDeCadenaAEntero {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el número entero: ");
        String number=scanner.nextLine();

        try{
            int numberconver=Integer.parseInt(number);
            System.out.println("El número convertido: "+numberconver);


        }catch(NumberFormatException e){
            System.out.println("No funciona!"+e.getMessage());
        }
        scanner.close();
    }
}
