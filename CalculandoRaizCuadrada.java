import java.util.Scanner;

public class CalculandoRaizCuadrada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número para sacar raiz cuadrado");
        int number = scanner.nextInt();
        if(number>=0){
            System.out.println("La raiz cuadrada es: "+Math.sqrt(number));
        }else{
            System.out.println("Ingrese solo números positivos");
        }
        
        scanner.close();
    }
}
