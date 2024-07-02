import java.util.Scanner;

public class CalculoDeDescuento {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa el precio del producto");
        double price=scanner.nextDouble();

        if(price>100){
            System.out.println(price*0.9);
        }else{
            System.out.println(price);
        }

        scanner.close();
    }
}
